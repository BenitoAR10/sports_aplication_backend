package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.LugarEntrenamientoSucursalBl;
import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;
import org.springframework.web.bind.annotation.*;
@RestController // Restcontroller nos indica que esta clase es una API.
@RequestMapping("/api/v1/LugarEntrenamientoSucursal") // Indicamos la ruta de la API.
public class LugarEntrenamientoSucursalApi {

    LugarEntrenamientoSucursalBl lugarEntrenamientoSucursalBl;

    public LugarEntrenamientoSucursalApi(LugarEntrenamientoSucursalBl lugarEntrenamientoSucursalBl){
        this.lugarEntrenamientoSucursalBl = lugarEntrenamientoSucursalBl;
    }

    @GetMapping("/{idCuenta}")
    public LugarEntrenamientoSucursalDto test(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenamientoSucursalBl.encontrarDatosLugar(idCuenta);
    }


}
