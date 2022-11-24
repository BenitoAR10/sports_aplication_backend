package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpTienda;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface SpTiendaDao {

    @Insert("""
            INSERT INTO sp_tienda 
                (id_cuenta, nombre_tienda, nombre_propietario, apellido_propietario, nit, telefono, correo, foto_tienda, direccion, estado, tx_correo, tx_fecha, tx_host)
            VALUES
                (#{idCuenta}, #{nombreTienda}, #{nombrePropietario}, #{apellidoPropietario}, #{nit}, #{telefono}, #{correo}, #{fotoTienda}, #{direccion}, true, 'anonymous', now(), 'localhost')
            """)
    void crearTienda(SpTienda spTienda);

}
