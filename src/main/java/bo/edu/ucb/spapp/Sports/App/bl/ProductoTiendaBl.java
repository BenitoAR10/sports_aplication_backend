package bo.edu.ucb.spapp.Sports.App.bl;


import bo.edu.ucb.spapp.Sports.App.dao.SpProductoTiendaDao;
import bo.edu.ucb.spapp.Sports.App.entity.EtyProductoTienda;
import org.springframework.stereotype.Service;

@Service
public class ProductoTiendaBl {

    private SpProductoTiendaDao spProductoTiendaDao;

    public ProductoTiendaBl(SpProductoTiendaDao spProductoTiendaDao) {
        this.spProductoTiendaDao = spProductoTiendaDao;
    }

    public EtyProductoTienda mostrarProductoTienda(int idProducto) {
        EtyProductoTienda etyProductoTienda = spProductoTiendaDao.findProductoTienda(idProducto);
        return etyProductoTienda;
    }
}
