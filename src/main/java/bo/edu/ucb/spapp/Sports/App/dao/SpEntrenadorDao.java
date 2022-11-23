package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpEntrenador;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

@Component
public interface SpEntrenadorDao {
    @Insert("""
            INSERT INTO sp_entrenador
                (id_cuenta, nit, correo, foto_entrenador, estado, tx_correo, tx_fecha, tx_host)
            VALUES
                (#{idCuenta}, #{nit}, #{correo}, #{foto}, true, 'anonymous', now(), 'localhost')
            """)
    void crearEntrenador(SpEntrenador spEntrenador);
}
