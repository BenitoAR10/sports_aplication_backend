package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.LugarEntrenadorBl;

import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.dto.PlanEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyHistorialEntrenador;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController // Indica que es un controlador de tipo REST
@RequestMapping("/api/v1/Entrenador")
public class LugarEntrenadorApi {
    LugarEntrenadorBl lugarEntrenadorBl;

    public LugarEntrenadorApi(LugarEntrenadorBl lugarEntrenadorBl){
        this.lugarEntrenadorBl = lugarEntrenadorBl;
    }

    @GetMapping("/{idCuenta}/planes")
    public RespuestaDto<List<PlanEntrenadorDto>> datosEntrenadorApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        try {
            List<PlanEntrenadorDto> lista = lugarEntrenadorBl.encontrarPlanEntrenador(idCuenta);
            return new RespuestaDto<>(lista, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }

    @GetMapping("/{idEntrenador}/cliente/{idCliente}")
    public RespuestaDto<List<EtyHistorialEntrenador>> historialdelcliente(@PathVariable(name = "idEntrenador") Integer idEntrenador, @PathVariable(name = "idCliente") Integer idCliente){
        try {
            List<EtyHistorialEntrenador> lista = lugarEntrenadorBl.historialDeCliente(idEntrenador, idCliente);
            return new RespuestaDto<>(lista, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }
    @GetMapping("/{idCuenta}")
    public RespuestaDto<LugarEntrenadorDto> datosEntrenador(@PathVariable(name = "idCuenta") Integer idCuenta){
        try {
            LugarEntrenadorDto lugarEntrenadorDto = lugarEntrenadorBl.encontrarDatosEntrenador(idCuenta);
            return new RespuestaDto<>(lugarEntrenadorDto, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }

    @GetMapping("/{idEntrenador}/clientesActivos")
    public RespuestaDto<List<EtyHistorialEntrenador>> clientesActivosEntrenador(@PathVariable(name = "idEntrenador") Integer idEntrenador){
        try {
            List<EtyHistorialEntrenador> lista = lugarEntrenadorBl.todosLosClientes(idEntrenador);
            return new RespuestaDto<>(lista, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }

    @PostMapping("/plan")
    public RespuestaDto<PlanEntrenadorDto> CrearPlanEntrenador (@RequestBody PlanEntrenadorDto planEntrenadorDto) {
        if (planEntrenadorDto.getCosto()!= null && planEntrenadorDto.getCantidadMeses() >0) {
            this.lugarEntrenadorBl.agregarPlanesEntrenador(planEntrenadorDto);
            return new RespuestaDto<>(planEntrenadorDto, "Plan creado correctamente", true);
        }else {
            return new RespuestaDto<>(null, "Error al crear el plan", false);
        }
    }

}
