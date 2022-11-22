package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.LugarEntrenamientoSucursalBl;
import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;
import bo.edu.ucb.spapp.Sports.App.dto.PlanesEntrenamientoDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyClientesLugarEntrenamiento;
import bo.edu.ucb.spapp.Sports.App.entity.EtyHistorialClienteLugarEntrenamiento;
import bo.edu.ucb.spapp.Sports.App.entity.EtyPlanesEntrenamiento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Restcontroller nos indica que esta clase es una API.
@RequestMapping("/api/v1/LugarEntrenamiento") // Indicamos la ruta de la API.
public class LugarEntrenamientoSucursalApi {

    LugarEntrenamientoSucursalBl lugarEntrenamientoSucursalBl;

    public LugarEntrenamientoSucursalApi(LugarEntrenamientoSucursalBl lugarEntrenamientoSucursalBl){
        this.lugarEntrenamientoSucursalBl = lugarEntrenamientoSucursalBl;
    }

    @GetMapping("/{idCuenta}")
    public LugarEntrenamientoSucursalDto LugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenamientoSucursalBl.encontrarDatosLugar(idCuenta);
    }

    @GetMapping("/{idCuenta}/clientes")
    public List<EtyClientesLugarEntrenamiento> clientesLugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenamientoSucursalBl.encontrarDatosCliente(idCuenta);
    }

    @GetMapping("/clientes/cliente/{idCuenta}")
    public List<EtyHistorialClienteLugarEntrenamiento> historialClienteLugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenamientoSucursalBl.encontrarHistorialCliente(idCuenta);
    }

    @GetMapping("/{idCuenta}/planes")
    public List<EtyPlanesEntrenamiento> planesLugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenamientoSucursalBl.encontrarPlanes(idCuenta);
    }

    @PostMapping
    public RespuestaDto<PlanesEntrenamientoDto> crearPlanesEntrenamiento(@RequestBody PlanesEntrenamientoDto planesEntrenamientoDto){
        if (planesEntrenamientoDto != null && planesEntrenamientoDto.getCantidadMeses() != null && planesEntrenamientoDto.getCosto() != null){
            this.lugarEntrenamientoSucursalBl.insertarPlanEntrenamiento(planesEntrenamientoDto);
            return new RespuestaDto<>(planesEntrenamientoDto, "Plan de entrenamiento creado correctamente", true);
        }
        else {
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }

    }



}
