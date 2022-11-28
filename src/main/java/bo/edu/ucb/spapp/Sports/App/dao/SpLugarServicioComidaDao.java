package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SpLugarServicioComidaDao {
    @Select(
            """
            select s.id_servicio_comida, s.nombre_lugar, s.logo, s.direccion
                from sp_servicio_comida s
            where s.id_cuenta = #{idCuenta}
            """)
    SpServicioComida encontrarServicioComida(Integer idCuenta);
    @Select(
            """
            select c.id_cuenta, c.nombres, c.apellidos, cast (t.costo_mes as decimal(10,2)), cp.fecha_compra, cp.fecha_fin, cp.estado
            from sp_cuenta c
                     inner join sp_compra_plan cp on c.id_cuenta = cp.id_cuenta
                     inner join sp_plan_comida t on cp.id_plan_comida = t.id_plan_comida
                     inner join sp_servicio_comida sc on t.id_servicio_comida = sc.id_servicio_comida
            where sc.id_cuenta = #{idCuenta}
            """)
    List<EtyClientesServicioComida> encontrarClientesServicioComida(Integer idCuenta);

    @Select(
            """
            select c.nombres, c.apellidos, cast(t.costo_mes as decimal(10,2)), t.nombre_plan, cp.fecha_compra, cp.fecha_fin, cp.detalle_comida
            from sp_cuenta cu
            inner join sp_persona c on cu.id_persona = c.id_persona
            inner join sp_compra_plan cp on cu.id_cuenta = cp.id_cuenta
            inner join sp_plan_comida t on cp.id_plan_comida = t.id_plan_comida
            inner join sp_servicio_comida sc on t.id_servicio_comida = sc.id_servicio_comida
            where cu.id_cuenta = #{idCuenta}
            and sc.id_cuenta = #{idComida};
            """)
    List<EtyClientesServicioComida> encontrarServiciosComidaCliente(Integer idCuenta, Integer idComida);

    @Select(
        """
        select t.id_plan_comida, t.nombre_plan, cast(t.costo_mes as decimal(10,2)), t.descripcion
        from sp_plan_comida t
        inner join sp_servicio_comida s on t.id_servicio_comida = s.id_servicio_comida
        where s.id_cuenta = #{idCuenta}
        """)
    List<SpPlanComida> encontrarPlanesComida(Integer idCuenta);

    @Insert(
            """
            INSERT INTO sp_plan_comida (id_servicio_comida, nombre_plan, descripcion, costo_mes,estado , tx_correo, tx_fecha, tx_host)
            values (#{idServicioComida}, #{nombrePlan}, #{descripcion}, #{costoMes}, true, 'dueño@email.com', now(), 'localhost')
            """)
    void crearPlanComida(SpPlanComida spServicioComida);



}
