package bo.edu.ucb.spapp.Sports.App.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.dto.SoliAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public RespAutenticacionDto authenticate(SoliAutenticacionDto credentials){
        RespAutenticacionDto result = null;
        System.out.println("Comenzando autenticacion: "+ credentials);
        String currentPasswordInBCrypt = spCuentaDao.findByCorreoAndContrasenia(credentials.getCorreo());
        System.out.println("Se encontro la contraseña en la base de datos: "+ currentPasswordInBCrypt);
        // Consulto si las constraseñas coinciden.
        if (currentPasswordInBCrypt != null){
            System.out.println("Se procede a verificar si las contraseñas coinciden");
            // comparamos las contraseñas.
            BCrypt.Result verifyResult = BCrypt.verifyer().verify(credentials.getContrasenia().toCharArray(), currentPasswordInBCrypt);
            if (verifyResult.verified){
                //Se procede a generar el token de autenticacion.
                System.out.println("Las contraseñas coinciden");
                result = generateTokenJwt(credentials.getCorreo(), 300, new String[]{"admin", "user"});

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

    // Este metodo genera tokens JWT
    private RespAutenticacionDto generateTokenJwt(String suject, int expirationTimeInSeconds, String [] roles){
        RespAutenticacionDto result = new RespAutenticacionDto();
        // Generamos el token.
        try{
            Algorithm algorithm = Algorithm.HMAC256("contrasenia");
            String token = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(suject)
                    .withArrayClaim("roles", roles)
                    .withClaim("refresh", false)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000)))
                    .sign(algorithm);
            result.setToken(token);
            String refreshToken = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(suject)
                    .withClaim("refresh", true)
                    .withExpiresAt(new Date(System.currentTimeMillis() + (expirationTimeInSeconds * 1000 * 2)))
                    .sign(algorithm);
            result.setRefresh(refreshToken);
        }catch (JWTCreationException e){
            throw new RuntimeException("Error al generar el token", e);
        }

        return result;
    }

}
