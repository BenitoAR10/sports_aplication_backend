package bo.edu.ucb.spapp.Sports.App.dao;
import bo.edu.ucb.spapp.Sports.App.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface SpLugarEntrenamientoSucursalDao {
    //Visualizar los datos de la sucursal del negocio en la pantalla de inicio  HECHO
    @Select("""
            select s.id_lugar_entrenamiento_sucursal,sle.nombre_lugar, sle.logo_lugar, s.direccion
            from sp_lugar_entrenamiento_sucursal s
                inner join sp_lugar_entrenamiento sle on s.id_lugar_entrenamiento = sle.id_lugar_entrenamiento
            where s.id_cuenta = #{idCuenta}
            """)
    EtyLugarEntrenamiento encontrarDatosLugar(Integer idCuenta);
    //Visualizar los clientes de esa sucursal HECHO

    @Select("""
            select c.id_cuenta, c.nombres, c.apellidos, sple.cantidad_meses, sple.costo,cp.fecha_compra, cp.fecha_fin, cast (cp.costo_plan as decimal(10,2))
            from sp_cuenta c
                     inner join sp_compra_plan cp on c.id_cuenta = cp.id_cuenta
                     inner join sp_plan_lugar_entrenamiento sple on cp.id_plan_lugar_entrenamiento = sple.id_plan_lugar_entrenamiento
                     inner join sp_lugar_entrenamiento_sucursal sples on sple.id_lugar_entrenamiento_sucursal = sples.id_lugar_entrenamiento_sucursal
            where sples.id_cuenta = #{idCuenta}
            """)
    List<EtyClientesLugarEntrenamiento> encontrarClientesLugar(Integer idCuenta);
    //Visualizar el historial de planes comprados en esa sucursal por un cliente
    @Select("""
            select cu.nombres, cu.apellidos, sple.cantidad_meses, sple.costo, cp.fecha_compra, cp.fecha_fin, cp.estado
            from sp_cuenta cu
                     inner join sp_compra_plan cp on cu.id_cuenta = cp.id_cuenta
                     inner join sp_plan_lugar_entrenamiento sple on cp.id_plan_lugar_entrenamiento = sple.id_plan_lugar_entrenamiento
                     inner join sp_lugar_entrenamiento_sucursal sples on sple.id_lugar_entrenamiento_sucursal = sples.id_lugar_entrenamiento_sucursal
            where sples.id_cuenta = #{idCuenta} and cu.id_cuenta = #{idCliente}
            """)
    List<EtyHistorialClienteLugarEntrenamiento> encontrarHistorialCliente(Integer idCuenta, Integer idCliente);
    //Visualizar los planes que tiene esa sucursal

    @Select("""
            select s.id_lugar_entrenamiento_sucursal, t.id_plan_lugar_entrenamiento, t.cantidad_meses, CAST(t.costo as decimal(10,2))
            from sp_plan_lugar_entrenamiento t
                inner join sp_lugar_entrenamiento_sucursal s on t.id_lugar_entrenamiento_sucursal = s.id_lugar_entrenamiento_sucursal
            where s.id_cuenta = #{idCuenta}
            """)
    List<EtyPlanesEntrenamiento> encontrarPlanesLugar(Integer idCuenta);
    //insertar un nuevo plan de entrenamiento HECHO
    @Insert("""
            insert into sp_plan_lugar_entrenamiento (id_lugar_entrenamiento_sucursal, cantidad_meses, costo, estado, tx_correo, tx_fecha, tx_host)
            values (#{idLugarEntrenamientoSucursal}, #{cantidadMeses}, #{costo}, true, 'admin@gmail.com', now(), 'localhost')
            """)
    void insertarPlanEntrenamiento(SpPlanLugarEntrenamiento spPlanLugarEntrenamiento);
    //editar un plan de entrenamiento
    @Update("""
            update sp_plan_lugar_entrenamiento
            set cantidad_meses = #{cantidadMeses}, costo = #{costo}, tx_correo = #{txCorreo}, tx_fecha = now(), tx_host = #{txHost}
            where id_plan_lugar_entrenamiento = #{idPlanLugarEntrenamiento}
            """)
    void editarPlanEntrenamiento(SpPlanLugarEntrenamiento spPlanLugarEntrenamiento);



}
