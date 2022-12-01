package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.bl.ServicioComidaBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearServicioComidaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.util.AuthUtil;
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

    // Metodo para verificar si los campos no estan vacios
    @PostMapping
    public RespuestaDto<CrearServicioComidaDto> crearServicioComida(@RequestBody CrearServicioComidaDto crearServicioComidaDto){
        if(crearServicioComidaDto != null && crearServicioComidaDto.getIdCuenta() != null && crearServicioComidaDto.getNombreLugar() != null && crearServicioComidaDto.getNombrePropietario() != null && crearServicioComidaDto.getApellidoPropietario() != null && crearServicioComidaDto.getNit() != null && crearServicioComidaDto.getTelefono() != null && crearServicioComidaDto.getCorreo()!= null && crearServicioComidaDto.getDireccion() != null && crearServicioComidaDto.getLatitud() != 0 && crearServicioComidaDto.getLongitud() != 0 && crearServicioComidaDto.getIdCuenta() != 0){
            this.servicioComidaBl.crearServicioComida(crearServicioComidaDto);
            return new RespuestaDto<>(crearServicioComidaDto, "Servicio de comida creado correctamente", true);
        }else {
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }
    }

    // Registro de datos de servicio comida
    @PostMapping()
    public RespuestaDto<String> cargarDatosServicioComida(@RequestHeader Map<String, String> headers, @RequestBody CrearServicioComidaDto crearServicioComidaDto){
        if(crearServicioComidaDto.validarDatos()){
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            try{
                String jwt = AuthUtil.getTokenFromHeader(headers);
                String correo = AuthUtil.isUserAuthenticated(jwt);
                servicioComidaBl.cargarDatosServicioComida(correo, crearServicioComidaDto);
                return new RespuestaDto<>("Datos cargados correctamente", null, true);
            } catch (Exception e){
                return new RespuestaDto<>(null, e.getMessage(), false);
            }
        }else{
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }
    }



    // Metodo de autorizacion para crear un servicio de comida
    /*
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
    */


}
