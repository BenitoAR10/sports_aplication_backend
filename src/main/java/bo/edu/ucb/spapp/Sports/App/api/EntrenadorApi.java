package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.EntrenadorBl;
import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearEntrenadorDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/entrenador")
public class EntrenadorApi {

    private EntrenadorBl entrenadorBl;

    private SeguridadBl seguridadBl;

    public EntrenadorApi(EntrenadorBl entrenadorBl, SeguridadBl seguridadBl) {
        this.entrenadorBl = entrenadorBl;
        this.seguridadBl = seguridadBl;
    }

    @PostMapping
    public Map crearEntrenador(@RequestHeader Map<String, String> headers, @RequestBody CrearEntrenadorDto crearEntrenadorDto) {
        if (headers.get("Authorization") == null && headers.get("authorization") == null) {
            return Map.of("message", "No se ha enviado el token de autorización");
        }
        String jwt = "";
        if (headers.get("Authorization") != null) {
            jwt = headers.get("Authorization").split(" ")[1];
        } else {
            jwt = headers.get("authorization").split(" ")[1];
        }
        if (this.seguridadBl.tokenHasRole(jwt, "Agregar entrenamientos")) {
            entrenadorBl.crearEntrenador(crearEntrenadorDto);
            return Map.of("message", "Entrenador creado");
        } else {
            return Map.of("message", "El usuario no tiene permisos para crear un entrenador");
        }
    }

}
