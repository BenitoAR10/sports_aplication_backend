package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpServicioComida;
import org.apache.ibatis.annotations.Insert;

public interface SpServicioComidaDao {

    @Insert("""
            INSERT INTO sp_servicio_comida
                (id_cuenta, nombre_lugar, nombre_propietario, apellido_propietario, telefono, correo, nit, logo, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host)
            VALUES
                (#{idCuenta}, #{nombreLugar}, #{nombrePropietario}, #{apellidoPropietario}, #{telefono}, #{correo}, #{nit}, #{logo}, #{direccion}, #{latitud}, #{longitud}, true, 'anonymous', now(), 'localhost')
            """)
    void crearServicioComida(SpServicioComida spServicioComida);
}
