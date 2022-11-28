package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpProductoDao;
import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoBl {
<<<<<<< HEAD

    private SpProductoDao spProductoDao;
    //Constructor
    public ProductoBl(SpProductoDao spProductoDao) {
        this.spProductoDao = spProductoDao;
    }
    public List<SpProducto> mostrarProducto (int idProducto) {
        List<SpProducto> spProducto = spProductoDao.findAll(idProducto);
        return spProducto;
    }

=======

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


>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
}
