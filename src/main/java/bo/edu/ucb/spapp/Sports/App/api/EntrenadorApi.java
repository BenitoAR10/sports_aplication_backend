package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.EntrenadorBl;
import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.util.AuthUtil;
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




    // Registro de entrenador
    @PostMapping()
    public RespuestaDto<String> cargarDatosEntrenador(@RequestHeader Map<String, String> headers, @RequestBody CrearEntrenadorDto crearEntrenadorDto){
        if(crearEntrenadorDto.validarDatos()){
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            try{
                String jwt = AuthUtil.getTokenFromHeader(headers);
                String correo = AuthUtil.isUserAuthenticated(jwt);
                entrenadorBl.cargarDatosEntrenador(correo, crearEntrenadorDto);
                return new RespuestaDto<>("Datos cargados correctamente", null, true);
            } catch (Exception e){
                return new RespuestaDto<>(null, e.getMessage(), false);
            }
        }else{
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }
    }

    // Metodo de autorizacion para crear un entrenamiento
    /*
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

      // Metodo para verificar si los campos estan vacios o no y si no estan vacios, se crea el entrenador.
    @PostMapping
    public RespuestaDto<CrearEntrenadorDto> crearEntrenador(@RequestBody CrearEntrenadorDto crearEntrenadorDto){
        if (crearEntrenadorDto != null && crearEntrenadorDto.getIdCuenta() != null && crearEntrenadorDto.getFotoEntrenador() != null && crearEntrenadorDto.getNit() != null && crearEntrenadorDto.getCorreo() != null){
            this.entrenadorBl.crearEntrenador(crearEntrenadorDto);
            return new RespuestaDto<>(crearEntrenadorDto, "Entrenador creado correctamente", true);
        }else{
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }
    }
    */


}
