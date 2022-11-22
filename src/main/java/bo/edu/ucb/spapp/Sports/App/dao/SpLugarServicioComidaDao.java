package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.*;
import org.apache.ibatis.annotations.Select;

public interface SpLugarServicioComidaDao {
    @Select(
            """
            select s.nombre_lugar, s.logo, s.direccion
                from sp_servicio_comida s
            where s.id_cuenta = #{idCuenta}
            """)
    SpServicioComida encontrarServicioComida(Integer idCuenta);


}
