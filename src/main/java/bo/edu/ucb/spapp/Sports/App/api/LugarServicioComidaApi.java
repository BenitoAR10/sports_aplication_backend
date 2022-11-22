package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.LugarServicioComidaBl;
import bo.edu.ucb.spapp.Sports.App.dto.LugarComidaDto;
import org.springframework.web.bind.annotation.*;

@RestController // Restcontroller nos indica que esta clase es una API.
@RequestMapping("/api/v1/LugarComida")
public class LugarServicioComidaApi {
    LugarServicioComidaBl lugarServicioComidaBl;

    public LugarServicioComidaApi(LugarServicioComidaBl lugarServicioComidaBl){
        this.lugarServicioComidaBl = lugarServicioComidaBl;
    }

    @GetMapping("/{idCuenta}")
    public LugarComidaDto LugarComidaApi(@PathVariable(name = "idCuenta") Integer idCuenta){
           return this.lugarServicioComidaBl.encontrarDatosLugar(idCuenta);

    }
}
