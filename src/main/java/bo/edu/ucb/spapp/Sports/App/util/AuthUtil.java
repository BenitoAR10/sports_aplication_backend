package bo.edu.ucb.spapp.Sports.App.util;

import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.util.List;
import java.util.Map;

public class AuthUtil {
    /**
     * Recibimos el token jwt y si sale bien retornamos el sub, caso contrario lanzamos una exepcion.
     * @param jwt
     * @return
     */
    public static String isUserAuthenticated(String jwt) {
        String subject = null;
        try {
            subject = JWT.require(Algorithm.HMAC256(SeguridadBl.JWT_SECRET))
                    .build()
                    .verify(jwt)
                    .getSubject();
        } catch (JWTVerificationException e){
            throw new SpException("Usuario no autenticado");
        }
        return subject;


    }

    public static String getTokenFromHeader(Map<String, String> headers) {
        if (headers.get("Authorization") == null && headers.get("authorization") == null){
            throw new SpException("No se ha enviado el token de autorización");
        }
        // se acostumbra que cuando se envia el token, se lo envia en sigueinte formato
        // Authorization: Bearer <token>
        String jwt = "";
        if (headers.get("Authorization") != null){
            jwt = headers.get("Authorization").split(" ")[1];
        }else{
            jwt = headers.get("authorization").split(" ")[1];
        }
        return jwt;
    }


    /**
     * Recibimos el token jwt y verificamos si tiene un rol en aprticular.
     * @param jwt
     * @param role
     * @return true si tiene el rol, false si no tiene el rol.
     */

    // Este metodo valida un token jwt y retorna si contiene o no el rol
    public static boolean tokenHasRole(String jwt, String role){
        List<String> roles = JWT.require(Algorithm.HMAC256(SeguridadBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("roles").asList(String.class);
        return roles.contains(role);
    }

    /**
     * Recibimos el token jwt y verificamos si tiene un rol en aprticular. si no lo tiene se lanza exepcion
     * @param jwt
     * @param role
     */
    public static void verifyHasRole(String jwt, String role){
        List<String> roles = JWT.require(Algorithm.HMAC256(SeguridadBl.JWT_SECRET))
                .build()
                .verify(jwt)
                .getClaim("roles").asList(String.class);
        if(!roles.contains(role)){
            throw new SpException("No tiene permisos para realizar esta acción");
        }
    }

}
