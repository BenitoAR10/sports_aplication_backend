package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.LugarEntrenadorBl;

import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.dto.PlanEntrenadorDto;
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
    public List<PlanEntrenadorDto> datosEntrenadorApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenadorBl.encontrarPlanEntrenador(idCuenta);
    }

    @GetMapping("/{idEntrenador}/cliente/{idCliente}")
    public List<EtyHistorialEntrenador> historialdelcliente(@PathVariable(name = "idEntrenador") Integer idEntrenador, @PathVariable(name = "idCliente") Integer idCliente){
        return this.lugarEntrenadorBl.historialDeCliente(idEntrenador, idCliente);
    }
    @GetMapping("/{idCuenta}")
    public LugarEntrenadorDto datosEntrenador(@PathVariable(name = "idCuenta") Integer idCuenta){
        return this.lugarEntrenadorBl.encontrarDatosEntrenador(idCuenta);
    }


}
