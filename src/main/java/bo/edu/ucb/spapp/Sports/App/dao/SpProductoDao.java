package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface SpProductoDao {
    @Select("""
            SELECT id_producto, nombre, marca, genero, peso, amortiguacion, talla
            FROM
                sp_producto
            WHERE
                id_producto = #{idProducto}
                AND estado = true
            """)
    SpProducto findByPrimarykey(Integer idProducto);

    @Select("""
            SELECT id_producto, nombre, marca, genero, peso, amortiguacion, talla
            FROM
                sp_producto
            WHERE
                id_producto = #{idProducto}
                AND estado = true
            """)
    public List<SpProducto> findByIdProducto(Integer idProducto);


}
