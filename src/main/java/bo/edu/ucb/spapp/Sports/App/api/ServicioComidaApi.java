package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.bl.ServicioComidaBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearServicioComidaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/comida")
public class ServicioComidaApi {

    private ServicioComidaBl servicioComidaBl;

    private SeguridadBl seguridadBl;

    public ServicioComidaApi(ServicioComidaBl servicioComidaBl, SeguridadBl seguridadBl) {
        this.servicioComidaBl = servicioComidaBl;
        this.seguridadBl = seguridadBl;
    }

    @PostMapping
    public Map crearServicioComida(@RequestHeader Map<String, String> headers, @RequestBody CrearServicioComidaDto crearServicioComidaDto){
        if (headers.get("Authorization") == null && headers.get("authorization") == null){
            return Map.of("message", "No se ha enviado el token de autorización");
        }
        String jwt = "";
        if (headers.get("Authorization") != null) {
            jwt = headers.get("Authorization").split(" ")[1];
        } else {
            jwt = headers.get("authorization").split(" ")[1];
        }

        if (this.seguridadBl.tokenHasRole(jwt, "Agregar comida")) {
            servicioComidaBl.crearServicioComida(crearServicioComidaDto);
            return Map.of("message", "Servicio de comida creado");
        }else {
            return Map.of("message", "El usuario no tiene permisos para crear un servicio de comida");
        }
    }

}
