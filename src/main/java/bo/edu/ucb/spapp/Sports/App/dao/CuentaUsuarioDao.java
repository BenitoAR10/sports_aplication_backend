package bo.edu.ucb.spapp.Sports.App.dao;


import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface CuentaUsuarioDao {

    @Insert(
            """
            INSERT INTO sp_cuenta_grupos
            (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, 1, true, 'anonymous', now(), 'localhost')
            """)
    void cuentaGrupoUsuario(Integer idCuenta);
}
