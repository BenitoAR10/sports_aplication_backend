package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpEntrenador;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;



@Component
public interface CuentaEntrenadorDao {
    // Insert para asiganar el rol de entrenador a una cuenta
    @Insert(
            """
            INSERT INTO sp_cuenta_grupos
            (id_cuenta, id_grupos, estado, tx_correo, tx_fecha, tx_host)
            VALUES
            (#{idCuenta}, 2, true, 'anonymous', now(), 'localhost')
            """)

    void cuentaGrupoEntrenador(Integer idCuenta);


}
