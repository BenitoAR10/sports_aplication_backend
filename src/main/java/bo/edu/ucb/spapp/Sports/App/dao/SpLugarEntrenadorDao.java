package bo.edu.ucb.spapp.Sports.App.dao;
import bo.edu.ucb.spapp.Sports.App.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SpLugarEntrenadorDao {
    @Select(
            """
            select s.id_cuenta, p.nombres, p.apellidos, s.foto_entrenador, c.correo
            from sp_entrenador s
            inner join sp_cuenta c on s.id_cuenta = c.id_cuenta
            inner join sp_persona p on c.id_persona = p.id_persona
            where s.id_cuenta = #{idCuenta}
            """
    )
    EtyLugarEntrenador obtenerEntrenadorPorIdCuenta(int idCuenta);
    @Select(
            """
            select t.id_plan_entrenador,t.cantidad_meses, CAST(t.costo as decimal(10,2)), t.estado
            from sp_plan_entrenador t
            inner join sp_entrenador s on t.id_entrenador = s.id_entrenador
            where s.id_cuenta = #{idCuenta}
            and  t.estado = true
            """
    )
    List<SpPlanEntrenador> obtenerPlanEntrenadorPorIdCuenta(int idCuenta);
    @Select(
            """
            select c.nombres, c.apellidos, t.cantidad_meses, CAST(t.costo as decimal(10,2)), cp.fecha_compra, cp.fecha_fin
            from sp_cuenta cu
            inner join sp_persona c on cu.id_persona = c.id_persona
            inner join sp_compra_plan cp on cu.id_cuenta = cp.id_cuenta
            inner join sp_plan_entrenador t on cp.id_plan_entrenador = t.id_plan_entrenador
            inner join sp_entrenador se on t.id_plan_entrenador= se.id_entrenador
            where cu.id_cuenta = #{idCliente}
            and se.id_cuenta = #{idEntrenador}
            """
    )
    List<EtyHistorialEntrenador> obtenerPlanesAdquiridosPorUnaCuenta(int idEntrenador, int idCliente);

}
