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
    //forma correcta de hacerlo
    @GetMapping("/{idCuenta}")
    public RespuestaDto<LugarEntrenamientoSucursalDto> LugarEntrenamientoApit1(@PathVariable(name = "idCuenta") Integer idCuenta){
        try{
            LugarEntrenamientoSucursalDto lugarEntrenamientoSucursalDto = lugarEntrenamientoSucursalBl.encontrarDatosLugar(idCuenta);
            return new RespuestaDto<>(lugarEntrenamientoSucursalDto, null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }


    //hecho
    @GetMapping("/{idCuenta}/clientes")
    public RespuestaDto<List<EtyClientesLugarEntrenamiento>> clientesLugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        try{
            List<EtyClientesLugarEntrenamiento> etyClientesLugarEntrenamiento = lugarEntrenamientoSucursalBl.encontrarDatosCliente(idCuenta);
            return new RespuestaDto<>(etyClientesLugarEntrenamiento, null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }
    //hecho
    @GetMapping("/{idCuenta}/cliente/{idCliente}")
    public RespuestaDto<List<EtyHistorialClienteLugarEntrenamiento>> historialClienteLugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta, @PathVariable(name = "idCliente") Integer idCliente){
        try{
            List<EtyHistorialClienteLugarEntrenamiento> etyHistorialClienteLugarEntrenamiento = lugarEntrenamientoSucursalBl.encontrarHistorialCliente(idCuenta, idCliente);
            return new RespuestaDto<>(etyHistorialClienteLugarEntrenamiento, null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }
    //hecho
    @GetMapping("/{idCuenta}/planes")
    public RespuestaDto<List<EtyPlanesEntrenamiento>> planesLugarEntrenamientoApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        try{
            List<EtyPlanesEntrenamiento> etyPlanesEntrenamiento = lugarEntrenamientoSucursalBl.encontrarPlanes(idCuenta);
            return new RespuestaDto<>(etyPlanesEntrenamiento, null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }
    //hecho
    @PostMapping("/plan")
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
