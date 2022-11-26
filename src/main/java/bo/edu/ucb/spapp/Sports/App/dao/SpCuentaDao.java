package bo.edu.ucb.spapp.Sports.App.dao;


import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
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

    @Select("""
            SELECT contrasenia
            FROM
                sp_cuenta
            WHERE
                correo = #{correo}
                AND estado = true
            """)
    String findSecretByCorreo(String correo);

    @Select("""
            SELECT id_cuenta, id_deporte,
               correo, contrasenia, estado, tx_correo, tx_fecha, tx_host
            FROM
                sp_cuenta
            WHERE
                correo = #{correo}
                AND estado = true
            """)
    SpCuenta findByCorreo(String correo);


    @Insert("""
            INSERT INTO sp_cuenta
               (id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host, nombres, apellidos, numero_telefono)
            VALUES
                (#{idDeporte}, #{correo}, #{contrasenia}, true, 'anonymous', now(), 'localhost', #{nombres}, #{apellidos}, #{numeroTelefono})
            """)


    void crearCuenta(SpCuenta spCuenta);




}
