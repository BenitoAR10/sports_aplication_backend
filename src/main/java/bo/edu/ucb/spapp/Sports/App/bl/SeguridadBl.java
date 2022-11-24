package bo.edu.ucb.spapp.Sports.App.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpRolesDao;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.dto.SoliAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import bo.edu.ucb.spapp.Sports.App.entity.SpRoles;
import bo.edu.ucb.spapp.Sports.App.util.SpException;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Creamos una clase que implemente la interfaz de la capa de acceso a datos y la interfaz de la capa de negocio.
@Service // Service nos indica que podremos inyectar esta clase en otras clases.
public class SeguridadBl {
    public final static String JWT_SECRET = "contrasenia";

    private final  SpCuentaDao spCuentaDao;


    private final SpRolesDao spRolesDao;
    // Constructor de la clase.
    public SeguridadBl(SpCuentaDao spCuentaDao, SpRolesDao spRolesDao) {
        this.spCuentaDao = spCuentaDao;
        this.spRolesDao = spRolesDao;
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
        String currentPasswordInBCrypt = spCuentaDao.findSecretByCorreo(credentials.getCorreo());
        System.out.println("Se encontro la contraseña en la base de datos: "+ currentPasswordInBCrypt);
        // Consulto si las constraseñas coinciden.
        if (currentPasswordInBCrypt != null){
            System.out.println("Se procede a verificar si las contraseñas coinciden");
            // comparamos las contraseñas.
            BCrypt.Result verifyResult = BCrypt.verifyer().verify(credentials.getContrasenia().toCharArray(), currentPasswordInBCrypt);
            if (verifyResult.verified){
                //Se procede a generar el token de autenticacion.
                System.out.println("Las contraseñas coinciden");
                // consultamos los roles que tiene el usuario.
                List<SpRoles> roles = spRolesDao.findRolesByCorreo(credentials.getCorreo());
                List<String> rolesAdString = new ArrayList<>();
                for (SpRoles rol: roles) {
                    rolesAdString.add(rol.getRol());
                }
                // Con esto no sera necesario refrescar token
                // FIXME: Erro de seguridad los tokens deberian ser de corta duracion.
                result = generateTokenJwt(credentials.getCorreo(), 30000, rolesAdString);

            } else {
                System.out.println("Las contraseñas no coinciden");
                throw new RuntimeException("La cuenta y la contraseña son incorrectos");
            }
        }else{
            System.out.println("Usuario no existe");
            throw new SpException("La cuenta y la contraseña son incorrectos");
        }

        return result;
    }

    // Este metodo genera tokens JWT
    private RespAutenticacionDto generateTokenJwt(String suject, int expirationTimeInSeconds, List<String> roles){
        RespAutenticacionDto result = new RespAutenticacionDto();
        // Generamos el token.
        try{
            Algorithm algorithm = Algorithm.HMAC256(JWT_SECRET);
            String token = JWT.create()
                    .withIssuer("ucb")
                    .withSubject(suject)
                    .withArrayClaim("roles", roles.toArray(new String[roles.size()]))
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

    /** Este metodo se encarga de validar un token JWT y retornar una SpCuenta si el token es valido.
     * @param jwt
     * @return
     */
    public SpCuenta validateJwtToken(String jwt){
        SpCuenta result = null;
        try{
            String correo = JWT.require(Algorithm.HMAC256(JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();
            result = spCuentaDao.findByCorreo(correo);
        } catch (Exception e){
            throw new SpException("La cuenta y la contraseña son incorrectos", e);
        }
        return result;
    }




}
