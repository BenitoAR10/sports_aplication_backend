package bo.edu.ucb.spapp.Sports.App.dao;


import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTienda;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

@Controller
public interface SpProductoTiendaDao {
    @Select("""
            SELECT t.nombre_tienda, t.foto_tienda, t.telefono, t.direccion, t.latitud, t.longitud,
                   p.nombre,p.imagen,p.marca, p.genero, p.peso, p.amortiguacion, p.talla,pt.precio, p.estado
            FROM sp_producto p
            INNER JOIN sp_producto_tienda pt ON p.id_producto = pt.id_producto
            INNER JOIN sp_tienda t ON t.id_tienda = pt.id_tienda
            WHERE p.estado = true
            and p.id_producto = #{idProducto}
            """)
    EtyProductoTienda findProductoTienda(Integer idProducto);
}
