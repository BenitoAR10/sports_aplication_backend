package bo.edu.ucb.spapp.Sports.App.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.dto.SoliAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;

// Creamos una clase que implemente la interfaz de la capa de acceso a datos y la interfaz de la capa de negocio.
@Service // Service nos indica que podremos inyectar esta clase en otras clases.
public class SeguridadBl {

    private SpCuentaDao spCuentaDao;
    // Constructor de la clase.
    public SeguridadBl(SpCuentaDao spCuentaDao){
        this.spCuentaDao = spCuentaDao;
    }
    // Metodo para obtener un usuario por su id.
    public CuentaDto getUserByPk(Integer idCuenta){
        SpCuenta spCuenta = spCuentaDao.findByPrimarykey(idCuenta);
        // Transformamos la entidad de bbdd a un DTO para
        // retornar al cliente via API (Data Transfer Object)
        CuentaDto cuentaDto = new CuentaDto(spCuenta.getIdCuenta(), spCuenta.getIdPersona(), spCuenta.getIdDeporte(), spCuenta.getCorreo());
        return cuentaDto;
    }
    // Este metodo se encarga de la autenticacion de usuarios, va a buscar la contraseña
    // en la base de datos y la va a comparar con su equivalente en BCRYPT.
    public RespAutenticacionDto authentication(SoliAutenticacionDto credentials){
        RespAutenticacionDto result = null;
        System.out.println("Comenzando autenticacion: "+ credentials);
        String currentPasswordInBCrypt = spCuentaDao.findByCorreoAndContrasenia(credentials.correo());
        System.out.println("Se encontro la contraseña en la base de datos: "+ currentPasswordInBCrypt);
        // Consulto si las constraseñas coinciden.
        if (currentPasswordInBCrypt != null){
            BCrypt.Result bcryptResult = BCrypt.verifyer().verify(credentials.secret().toCharArray(), currentPasswordInBCrypt);
            System.out.println("Se procede a verificar si las contraseñas coinciden");
            if (bcryptResult.verified){
                //Se procede a generar el token de autenticacion.
                System.out.println("Las contraseñas coinciden");
                result.setToken("TEST TOKEN");
                result.setRefresh("TEST  TOKEN");
            } else {
                System.out.println("Las contraseñas no coinciden");
                throw new RuntimeException("Contraseña y secret no coinciden");
            }
        }else{
            System.out.println("Usuario no existe");
            throw new RuntimeException("Contraseña y secret no coinciden");
        }

        return result;
    }
}
