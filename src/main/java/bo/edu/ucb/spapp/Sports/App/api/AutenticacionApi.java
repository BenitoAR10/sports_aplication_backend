package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.dto.SoliAutenticacionDto;
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
    // Metodo para obtener un usuario por su id.
    @GetMapping("/{idCuenta}")
    public CuentaDto test(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.seguridadBl.getUserByPk(idCuenta);
    }

    @PostMapping()
    public RespAutenticacionDto authentication(@RequestBody SoliAutenticacionDto soliAutenticacionDto){
        return seguridadBl.authentication(soliAutenticacionDto);
    }
}
