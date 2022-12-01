package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpProductoTiendaOfertaDao;
import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTiendaOferta;

import java.util.List;

public class ProductoTiendaOfertaBl {

    private SpProductoTiendaOfertaDao spProductoTiendaOfertaDao;

    public ProductoTiendaOfertaBl(SpProductoTiendaOfertaDao spProductoTiendaOfertaDao) {
        this.spProductoTiendaOfertaDao = spProductoTiendaOfertaDao;
    }

    public List<EtyProductoTiendaOferta> mostrarTopProducto(int idProducto) {
        List<EtyProductoTiendaOferta> etyProductoTiendaOferta = spProductoTiendaOfertaDao.findTop3ProductosMasVistos(idProducto);
        return etyProductoTiendaOferta;
    }

}
