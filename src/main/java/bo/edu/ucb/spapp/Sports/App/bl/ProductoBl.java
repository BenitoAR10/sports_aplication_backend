package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpProductoDao;
import bo.edu.ucb.spapp.Sports.App.dto.ProductoDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoBl {

    private SpProductoDao spProductoDao;
    //Constructor
      public ProductoBl(SpProductoDao spProductoDao) {
            this.spProductoDao = spProductoDao;
        }
    public List<SpProducto> mostrarProducto (int idProducto) {
        List<SpProducto> spProducto = spProductoDao.findAll(idProducto);
        return spProducto;
    }

    public void crearProducto(ProductoDto productoDto){
        SpProducto spCrearProducto = new SpProducto();

    }
}
