package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.bl.TiendaBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearTiendaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/tienda")
public class TiendaApi {
    private TiendaBl tiendaBl;

    private SeguridadBl  seguridadBl;

    public TiendaApi(TiendaBl tiendaBl, SeguridadBl seguridadBl) {
        this.tiendaBl = tiendaBl;
        this.seguridadBl = seguridadBl;
    }

    @PostMapping
    public Map crearTienda(@RequestHeader Map<String, String> headers, @RequestBody CrearTiendaDto crearTiendaDto){
        if (headers.get("Authorization") == null && headers.get("authorization") == null){
            return Map.of("message", "No se ha enviado el token de autorización");
        }
        String jwt = "";
        if (headers.get("Authorization") != null) {
            jwt = headers.get("Authorization").split(" ")[1];
        } else {
            jwt = headers.get("authorization").split(" ")[1];
        }

        if (this.seguridadBl.tokenHasRole(jwt, "Agregar tienda")) {
            tiendaBl.crearTienda(crearTiendaDto);
            return Map.of("message", "Tienda creada");
        }else {
            return Map.of("message", "El usuario no tiene permisos para crear una tienda");
        }

    }

}
