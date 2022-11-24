package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.dto.SoliAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.util.SpException;
import org.springframework.web.bind.annotation.*;

// Creamos una clase API para las peticiones de autenticaion de usuarios.

@RestController // Restcontroller nos indica que esta clase es una API.
@RequestMapping("/api/v1/auth") // Indicamos la ruta de la API.
public class AutenticacionApi {

    SeguridadBl seguridadBl;
    // Constructor de la clase.
    public AutenticacionApi(SeguridadBl seguridadBl){
        this.seguridadBl = seguridadBl;
    }

    /**
     * Endpoint para autenticar un usuario.
     * @param soliAutenticacionDto
     * @return
     */
    @PostMapping()
    public RespuestaDto<RespAutenticacionDto> authentication(@RequestBody SoliAutenticacionDto soliAutenticacionDto){
        if (soliAutenticacionDto != null && soliAutenticacionDto.getCorreo() != null && soliAutenticacionDto.getContrasenia() != null) {
            // retorna los tokens, null porque no hay erro y true porque fue exitoso.
            try{
                return new RespuestaDto<>(seguridadBl.authenticate(soliAutenticacionDto), null, true);
            }catch (SpException e){
                return new RespuestaDto<>(null, e.getMessage(), false);
            }

        }else{
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }
    }
}
