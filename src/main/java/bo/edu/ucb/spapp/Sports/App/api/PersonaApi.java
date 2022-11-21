package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.PersonaBl;
import bo.edu.ucb.spapp.Sports.App.entity.dto.CrearPersonaDto;
import bo.edu.ucb.spapp.Sports.App.entity.dto.RespuestaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/persona")
public class PersonaApi {
    private PersonaBl personaBl;

    public PersonaApi(PersonaBl personaBl){

        this.personaBl = personaBl;
    }

    @PostMapping
    public RespuestaDto<CrearPersonaDto>  crearPersona(@RequestBody CrearPersonaDto crearPersonaDto){
        if (crearPersonaDto != null && crearPersonaDto.getNombres() != null && crearPersonaDto.getApellidos() != null && crearPersonaDto.getNumeroTelefono() != null){
            this.personaBl.crearPersona(crearPersonaDto);
            return new RespuestaDto<>(crearPersonaDto, "Persona creada correctamente", true);
        }
        else {
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }


    }
}
