package bo.edu.ucb.spapp.Sports.App.bl;


import bo.edu.ucb.spapp.Sports.App.dao.SpProductoDao;
import bo.edu.ucb.spapp.Sports.App.dto.ProductoDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpProducto;
import org.springframework.stereotype.Service;

@Service
public class ProductoBl {
    private SpProductoDao spProductoDao;

    public ProductoBl(SpProductoDao spProductoDao) {

        this.spProductoDao = spProductoDao;
    }
    public void crearProducto(ProductoDto productoDto){
        SpProducto spCrearProducto = new SpProducto();
        spCrearProducto.setNombre(productoDto.getNombre());
        spCrearProducto.setDescripcion(productoDto.getDescripcion());
        spCrearProducto.setPrecio(productoDto.getPrecio());
        spCrearProducto.setFoto(productoDto.getFoto());

    }

}
