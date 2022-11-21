package bo.edu.ucb.spapp.Sports.App.dao;
import bo.edu.ucb.spapp.Sports.App.entity.EtyLugarEntrenamiento;
import bo.edu.ucb.spapp.Sports.App.entity.SpLugarEntrenamiento;
import bo.edu.ucb.spapp.Sports.App.entity.SpLugarEntrenamientoSucursal;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

public interface SpLugarEntrenamientoSucursalDao {
    @Select("""
            select s.id_lugar_entrenamiento_sucursal,sle.nombre_lugar, sle.logo_lugar, s.direccion
            from sp_lugar_entrenamiento_sucursal s
                inner join sp_lugar_entrenamiento sle on s.id_lugar_entrenamiento = sle.id_lugar_entrenamiento
            where s.id_cuenta = #{idCuenta}
            """)
    EtyLugarEntrenamiento encontrarDatosLugar(Integer idCuenta);



}
