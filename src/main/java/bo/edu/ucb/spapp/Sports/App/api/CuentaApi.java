package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.CuentaBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cuenta")
public class CuentaApi {
    private CuentaBl cuentaBl;

    public CuentaApi (CuentaBl cuentaBl){
        this.cuentaBl = cuentaBl;
    }
    @PostMapping
    public Map crearCuenta(@RequestBody CrearCuentaDto crearCuentaDto){
        cuentaBl.crearCuenta(crearCuentaDto);
        return Map.of("message", "Cuenta creada");
    }
}
