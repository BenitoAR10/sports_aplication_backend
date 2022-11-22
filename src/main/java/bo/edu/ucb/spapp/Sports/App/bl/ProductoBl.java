package bo.edu.ucb.spapp.Sports.App.bl;


import bo.edu.ucb.spapp.Sports.App.dao.SpProductoDao;
import org.springframework.stereotype.Service;

@Service
public class ProductoBl {
    private SpProductoDao spProductoDao;

    public ProductoBl(SpProductoDao spProductoDao) {
        this.spProductoDao = spProductoDao;
    }
}
