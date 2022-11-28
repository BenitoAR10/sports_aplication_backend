package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.ProductoTiendaOfertaBl;
import bo.edu.ucb.spapp.Sports.App.dao.SpProductoTiendaOfertaDao;
import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTiendaOferta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping ("/api/v1/productoTiendaOferta")
public class ProductoTiendaOfertaApi {

    private SpProductoTiendaOfertaDao spProductoTiendaOfertaDao;

    public ProductoTiendaOfertaApi(SpProductoTiendaOfertaDao spProductoTiendaOfertaDao) {
        this.spProductoTiendaOfertaDao = spProductoTiendaOfertaDao;
    }

    @GetMapping("/{idProducto}")
    public List<EtyProductoTiendaOferta> productoTiendaOfertasApi(@PathVariable(name = "idProducto") Integer idProducto){
        ProductoTiendaOfertaBl productoTiendaOfertaBl = new ProductoTiendaOfertaBl(spProductoTiendaOfertaDao);
        return productoTiendaOfertaBl.mostrarTopProducto(idProducto);
    }
}
