package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.ProductoTiendaBl;
import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTienda;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/productoTienda")
public class ProductoTiendaApi {

    ProductoTiendaBl productoTiendaBl;

    //Constructor
    public ProductoTiendaApi(ProductoTiendaBl productoTiendaBl) {
        this.productoTiendaBl = productoTiendaBl;
    }


    @GetMapping("/{idProducto}")
    public EtyProductoTienda productoTiendaApi(@PathVariable(name = "idProducto") Integer idProducto){
        return productoTiendaBl.mostrarProductoTienda(idProducto);
    }

}
