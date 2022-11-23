package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.ProductoBl;
import bo.edu.ucb.spapp.Sports.App.dto.ProductoDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTiendaOferta;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/producto")
public class ProductoApi {
    ProductoBl productoBl;

    //Constructor
    public ProductoApi(ProductoBl productoBl) {
        this.productoBl = productoBl;
    }

    @GetMapping("/{idProducto}")
    public List<EtyProductoTiendaOferta> productoTiendaOfertasApi(@PathVariable(name = "idProducto") Integer idProducto){
        return productoBl.mostrarTopProductos(idProducto);
    }
}
