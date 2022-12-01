package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpServicioComida;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component

public interface CuentaServicioComidaDao {
    // Insert para asiganar el rol de servicio de comida a una cuenta
    @Insert(
            """
            INSERT INTO sp_cuenta_grupos
            (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, 4, true, 'anonymous', now(), 'localhost')
            """)
    void cuentaGrupoServicioComida(Integer idCuenta);


    // Insert para la tabla sp_servicio_comida

    @Insert("""
            INSERT INTO sp_servicio_comida
            (id_cuenta, nombre_lugar, nombre_propietario, apellido_propietario, telefono, correo, nit, logo, latitud, direccion, longitud, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, #{nombreLugar}, #{nombrePropietario}, #{apellidoPropietario}, #{telefono}, #{correo}, #{nit}, #{logo}, #{latitud}, #{direccion}, #{longitud}, true, 'anonymous', now(), 'localhost')
            """)

    void datosServicioComida(SpServicioComida spServicioComida);
}
