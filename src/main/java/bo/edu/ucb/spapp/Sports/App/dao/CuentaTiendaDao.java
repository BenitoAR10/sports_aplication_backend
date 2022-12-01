package bo.edu.ucb.spapp.Sports.App.dao;


import bo.edu.ucb.spapp.Sports.App.entity.SpTienda;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface CuentaTiendaDao {
    // Insert para asignar el rol de agregar tienda a una cuenta
    @Insert(
            """
            INSERT INTO sp_cuenta_grupos
            (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, 3, true, 'anonymous', now(), 'localhost')
            """)
    void cuentaGrupoTienda(Integer idCuenta);

    // Insert para llenar los datos de  sp_tienda

    @Insert("""
            INSERT INTO sp_tienda
            (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, foto_tienda, correo, telefono, nit, direccion, latitud, longitud, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, #{nombreTienda}, #{nombrePropietario}, #{apellidoPropietario}, #{fotoTienda}, #{correo}, #{telefono}, #{nit}, #{direccion}, 16164512, 16164512, true, 'anonymous', now(), 'localhost')
            """)

    void datosTienda(SpTienda spTienda);
}
