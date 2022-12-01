package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.ProductoBl;
import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyClientesLugarEntrenamiento;
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
/*
    @GetMapping("/{idProducto}")
    public List<SpProducto> productoApi(@PathVariable(name = "idProducto") Integer idProducto){
        List<SpProducto> spProducto = productoBl.mostrarProducto(idProducto);
        return spProducto;
    }

 */
    @GetMapping("/{idProducto}")
    public RespuestaDto<List<SpProducto>> productoApi(@PathVariable(name = "idProducto") Integer idProducto){
        try{
            List<SpProducto> spProducto = productoBl.mostrarProducto(idProducto);
            return new RespuestaDto<>(spProducto, null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }
}
