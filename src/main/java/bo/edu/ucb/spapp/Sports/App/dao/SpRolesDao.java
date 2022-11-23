package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpRoles;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SpRolesDao {
    @Select("""
            SELECT roles.id_roles, roles.rol, roles.descripcion, roles.estado, roles.tx_correo, roles.tx_fecha, roles.tx_host
            FROM sp_roles roles
                JOIN sp_grupo_roles grupo_roles ON grupo_roles.id_roles = roles.id_roles
                JOIN sp_cuenta_grupos cuenta_grupos ON cuenta_grupos.id_grupos = grupo_roles.id_grupos
                JOIN sp_cuenta cuenta ON cuenta.id_cuenta = cuenta_grupos.id_cuenta
            WHERE cuenta.correo = #{correo}
                AND roles.estado = true
                AND grupo_roles.estado = true
                AND cuenta_grupos.estado = true
                AND cuenta.estado = true
            """)
    public List<SpRoles> findRolesByCorreo(String correo);

}
