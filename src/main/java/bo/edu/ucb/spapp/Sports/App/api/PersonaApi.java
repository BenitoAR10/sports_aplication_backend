package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.PersonaBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearPersonaDto;
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
    public Map crearPersona(@RequestBody CrearPersonaDto crearPersonaDto){
        personaBl.crearPersona(crearPersonaDto);
        return Map.of("message", "Persona creada");
    }
}
