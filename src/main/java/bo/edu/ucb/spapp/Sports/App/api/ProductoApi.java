package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.ProductoBl;
import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;
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
    public List<SpProducto> productoApi(@PathVariable(name = "idProducto") Integer idProducto){
        List<SpProducto> spProducto = productoBl.mostrarProducto(idProducto);
        return spProducto;
    }
}
