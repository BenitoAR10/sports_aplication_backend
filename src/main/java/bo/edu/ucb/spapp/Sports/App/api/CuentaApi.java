package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cuenta")
public class CuentaApi {

    @PostMapping
    public Map crearCuenta(@RequestBody CrearCuentaDto crearCuentaDto){
        return null;
    }
}
