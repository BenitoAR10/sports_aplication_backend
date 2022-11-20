package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpCrearCuenta;
import bo.edu.ucb.spapp.Sports.App.entity.SpCrearPersona;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
// Creamos una interfaz para poder usar MyBatis y poder hacer consultas a la base de datos de manera mas sencilla.
public interface SpCuentaDao {
    @Select("""
            SELECT id_cuenta, id_persona, id_deporte,
               correo, contrasenia, estado, tx_correo, tx_fecha, tx_host
            FROM
                sp_cuenta
            WHERE
                id_cuenta = #{idCuenta}
                AND estado = true
            """)
    SpCuenta findByPrimarykey(Integer idCuenta);

    @Select("""
            SELECT contrasenia
            FROM
                sp_cuenta
            WHERE
                correo = #{correo}
                AND estado = true
            """)
    String findByCorreoAndContrasenia(String correo);


    @Insert("""
            INSERT INTO sp_persona (nombres, apellidos, genero, numero_telefono, ciudad, cat_persona_status, fecha_nacimiento, altura, peso, indice_masa_corporal, foto, estado, tx_correo, tx_fecha, tx_host)
            VALUES
                (#{nombres}, #{apellidos}, #{genero}, #{numeroTelefono}, #{ciudad}, #{catPersonaStatus}, #{fechaNacimiento}, #{altura}, #{peso}, #{indiceMasaCorporal}, #{foto}, true, 'anonymous', now(), 'localhost')
            """)

    void crearPersona(SpCrearPersona spCrearCuenta);

    @Insert("""
            INSERT INTO sp_cuenta
               (id_persona, id_deporte, correo, contrasenia, estado, tx_correo, tx_fecha, tx_host)
            VALUES
               (#{idPersona}, 1, #{correo}, #{contrasenia}, true, 'anonymous', now(), 'localhost')
            """)

    void crearCuenta(SpCrearCuenta spCrearCuenta);




}
