package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpProductoTiendaOfertaDao;
import bo.edu.ucb.spapp.Sports.App.dto.ProductoDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTiendaOferta;
import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoBl {

    private SpProductoTiendaOfertaDao spProductoTiendaOfertaDao;

    public ProductoBl(SpProductoTiendaOfertaDao spProductoTiendaOfertaDao) {

        this.spProductoTiendaOfertaDao = spProductoTiendaOfertaDao;
    }

    public List<EtyProductoTiendaOferta> mostrarTopProductos(int idProducto) {
        List<EtyProductoTiendaOferta> etyProductoTiendaOferta = spProductoTiendaOfertaDao.findTop3ProductosMasVistos(idProducto);
        return etyProductoTiendaOferta;
    }

    public void crearProducto(ProductoDto productoDto){
        SpProducto spCrearProducto = new SpProducto();

    }


}
