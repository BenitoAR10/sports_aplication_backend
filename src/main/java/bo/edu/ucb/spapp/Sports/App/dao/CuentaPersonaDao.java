package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.EtyCuentaPersona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface CuentaPersonaDao {

    /**
     * Buscar cuenta y nombre
     */
    @Select("""
            SELECT nombres, apellidos, correo
                FROM sp_cuenta          
            WHERE correo = #{correo}
              AND estado = true
            """)
    public EtyCuentaPersona findByCorreo(String correo);

}
