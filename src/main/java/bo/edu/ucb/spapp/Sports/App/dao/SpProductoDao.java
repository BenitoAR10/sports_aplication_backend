package bo.edu.ucb.spapp.Sports.App.dao;

import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface SpProductoDao {

    @Select("""
            SELECT id_producto, nombre, marca, genero, peso, amortiguacion, talla
            FROM
                sp_producto      
            """)
    public List<SpProducto> findAll(Integer idProducto);

    @Select("""
            SELECT id_producto, nombre, marca, genero, peso, amortiguacion, talla
            FROM
                sp_producto
            WHERE
                id_producto = #{idProducto}
                AND estado = true
            """)
    public List<SpProducto> findByListProducto(Integer idProducto);

    @Insert("""
            INSERT INTO sp_producto
                (id_producto, nombre, descripcion, marca, genero, peso, amortiguacion, pisada, numero_de_vistas, numero_de_comparaciones, tipo_producto, estado, tx_correo, tx_fecha, tx_host, color, talla)
            VALUES
                (#{idProducto}, #{nombre}, #{descripcion}, #{marca}, #{genero}, #{peso}, #{amortiguacion}, #{pisada}, #{numeroDeVistas}, #{numeroDeComparaciones}, #{tipoProducto}, #{estado}, #{txCorreo}, #{txFecha}, #{txHost}, #{color}, #{talla})
            """)
    void crearProducto(SpProducto spProducto);
}
