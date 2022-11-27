package bo.edu.ucb.spapp.Sports.App.bl;


import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;

@Service // Lo marcamos como service para que Spring lo pueda inyectar.
public class CuentaBl {
    private SpCuentaDao spCuentaDao;


    // Inyectamos el dao para poder usarlo.
    public CuentaBl(SpCuentaDao spCuentaDao) {

        this.spCuentaDao = spCuentaDao;
    }

    // Metodo para crear una cuenta
    public void crearCuenta(CrearCuentaDto crearCuentaDto){
        SpCuenta spCuenta = new SpCuenta();
        spCuenta.setIdDeporte(crearCuentaDto.getIdDeporte());
        spCuenta.setCorreo(crearCuentaDto.getCorreo());
        spCuenta.setNombres(crearCuentaDto.getNombre());
        spCuenta.setApellidos(crearCuentaDto.getApellido());
        spCuenta.setNumeroTelefono(crearCuentaDto.getNumeroTelefono());
        String contrasenia = BCrypt.withDefaults().hashToString(12, crearCuentaDto.getContrasenia().toCharArray());
        crearCuentaDto.getContrasenia();
        spCuenta.setContrasena(contrasenia);
        this.spCuentaDao.crearCuenta(spCuenta);
    }
    // Metodo para obtener los datos de una cuenta por medio del correo
    public SpCuenta findByCorreo(String correo) {
        return spCuentaDao.findByCorreo(correo);
    }
}
