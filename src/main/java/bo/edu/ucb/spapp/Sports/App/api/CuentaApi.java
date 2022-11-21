package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.CuentaBl;
import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cuenta")
public class CuentaApi {
    private CuentaBl cuentaBl;

    private SeguridadBl seguridadBl;

    public CuentaApi (CuentaBl cuentaBl, SeguridadBl seguridadBl) {

        this.cuentaBl = cuentaBl;
        this.seguridadBl = seguridadBl;
    }
    @PostMapping
    public Map crearCuenta(@RequestHeader Map<String, String> headers, @RequestBody CrearCuentaDto crearCuentaDto){
        if (headers.get("Authorization") == null && headers.get("authorization") == null){
            return Map.of("message", "No se ha enviado el token de autorización");
        }
        // se acostumbra que cuando se envia el token, se lo envia en sigueinte formato
        // Authorization: Bearer <token>
        String jwt = "";
        if (headers.get("Authorization") != null){
            jwt = headers.get("Authorization").split(" ")[1];
        }else{
            jwt = headers.get("authorization").split(" ")[1];
        }

        if (this.seguridadBl.tokenHasRole(jwt, "Agregar entrenamientos")){
            cuentaBl.crearCuenta(crearCuentaDto);
            return Map.of("message", "Cuenta creada");
        }else{
            return Map.of("message", "El usuario no tiene permisos para crear una cuenta");
        }



    }
}
