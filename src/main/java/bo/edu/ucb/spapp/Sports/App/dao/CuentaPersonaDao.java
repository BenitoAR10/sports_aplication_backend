package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.EtyCuentaPersona;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface CuentaPersonaDao {

    /**
     * Buscar cuenta y nombre
     */
    @Select("""
            SELECT p.nombres, p. apellidos, c.correo
            FROM sp_cuenta c
                     INNER JOIN sp_persona p ON c.id_persona = p.id_persona
            WHERE c.correo = #{correo}
              AND c.estado = true
            """)
    public EtyCuentaPersona findByCorreo(String correo);
}
