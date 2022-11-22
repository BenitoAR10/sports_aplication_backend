package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    @Select("""
            select p.numero_de_vistas, p.nombre, p.marca, pt.precio,  op.precio_oferta
            from sp_producto p
              inner join sp_oferta_producto op on p.id_producto = op.id_producto
              inner join sp_producto_tienda pt on p.id_producto = pt.id_producto
            where op.estado = true
              and pt.estado = true
              and p.estado = true
            order by p.numero_de_vistas desc limit 3;
            """)
    public List<SpProducto> findTop3ProductosMasVistos();

}
