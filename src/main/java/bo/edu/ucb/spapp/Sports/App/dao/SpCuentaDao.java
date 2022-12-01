package bo.edu.ucb.spapp.Sports.App.dao;


import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import bo.edu.ucb.spapp.Sports.App.entity.SpGrupo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
// Creamos una interfaz para poder usar MyBatis y poder hacer consultas a la base de datos de manera mas sencilla.

@Component
public interface SpCuentaDao {
    // Buscar por id
    @Select("""
            SELECT id_cuenta, id_deporte,
               correo, contrasenia, estado, tx_correo, tx_fecha, tx_host
            FROM
                sp_cuenta
            WHERE
                id_cuenta = #{idCuenta}
                AND estado = true
            """)
    SpCuenta findByPrimarykey(Integer idCuenta);
    // Buscar por de id por su correo
    @Select("""
            SELECT id_cuenta
            FROM
                sp_cuenta
            WHERE
                correo = #{correo}
                AND estado = true
            """)
    Integer findIdByCorreo(String correo);

    // Busqueda de contraseña por el correo de la cuenta
    @Select("""
            SELECT contrasenia
            FROM
                sp_cuenta
            WHERE
                correo = #{correo}
                AND estado = true
            """)
    String findSecretByCorreo(String correo);

    // Busqueda de usuario por el correo de la cuenta

    @Select("""
            SELECT id_cuenta, id_deporte, nombres, apellidos, numero_telefono, genero, ciudad,
               correo, contrasenia, estado, tx_correo, tx_fecha, tx_host
            FROM
                sp_cuenta
            WHERE
                correo = #{correo}
                AND estado = true
            """)
    SpCuenta findByCorreo(String correo);


    // Creacion de una cuenta con los campos obligatorios

    @Insert("""
            INSERT INTO sp_cuenta
               (id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host, nombres, apellidos, numero_telefono)
            VALUES
                (#{idDeporte}, #{correo}, #{contrasenia}, true, 'anonymous', now(), 'localhost', #{nombres}, #{apellidos}, #{numeroTelefono})
            """)


    void crearCuenta(SpCuenta spCuenta);

    // Obtener grupo de la cuenta
    @Select("""
            SELECT grupo FROM sp_grupos
                JOIN sp_cuenta_grupos ON sp_grupos.id_grupos = sp_cuenta_grupos.id_grupos
                JOIN sp_cuenta ON sp_cuenta_grupos.id_cuenta = sp_cuenta.id_cuenta
            WHERE sp_cuenta.correo = #{correo}
              AND sp_grupos.estado = true
              AND sp_cuenta_grupos.estado = true
              AND sp_cuenta.estado = true
            """)
    List<String>findGruposByCorreo(String correo);




}
