package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.apache.ibatis.annotations.Select;
// Creamos una interfaz para poder usar MyBatis y poder hacer consultas a la base de datos de manera mas sencilla.
public interface SpCuentaDao {
    @Select("""
            SELECT id_cuenta, id_persona, id_deporte,
               correo, contrasenia, estado, tx_correo, tx_fecha, tx_host
            FROM sp_cuenta
            WHERE id_cuenta = #{idCuenta}
            """)
    SpCuenta findByPrimarykey(Integer idCuenta); // Metodo para buscar una cuenta por su id.
}