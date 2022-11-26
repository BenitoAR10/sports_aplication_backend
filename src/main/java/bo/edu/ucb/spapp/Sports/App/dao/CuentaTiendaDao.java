package bo.edu.ucb.spapp.Sports.App.dao;


import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface CuentaTiendaDao {
    @Insert(
            """
            INSERT INTO sp_cuenta_grupos
            (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, 3, true, 'anonymous', now(), 'localhost')
            """)
    void cuentaGrupoTienda(Integer idCuenta);
}
