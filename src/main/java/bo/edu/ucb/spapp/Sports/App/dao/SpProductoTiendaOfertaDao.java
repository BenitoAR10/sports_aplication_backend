package bo.edu.ucb.spapp.Sports.App.dao;


import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTiendaOferta;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface SpProductoTiendaOfertaDao {

    @Select("""
            select p.id_producto, pt.id_tienda, op.id_ofertas, p.marca, pt.precio,  op.precio_oferta, p.estado
            from sp_producto p
              inner join sp_oferta_producto op on p.id_producto = op.id_producto
              inner join sp_producto_tienda pt on p.id_producto = pt.id_producto
            where op.estado = true
              and pt.estado = true
              and p.estado = true
              and p.id_producto = #{idProducto}
            order by p.numero_de_vistas desc limit 3;
            """)
    public List<EtyProductoTiendaOferta> findTop3ProductosMasVistos(Integer idProducto);

}
