package bo.edu.ucb.spapp.Sports.App.dao;

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
}
