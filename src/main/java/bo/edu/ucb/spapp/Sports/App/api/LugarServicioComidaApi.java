package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.LugarServicioComidaBl;
import bo.edu.ucb.spapp.Sports.App.dto.LugarComidaDto;
import bo.edu.ucb.spapp.Sports.App.dto.PlanesComidaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyClientesServicioComida;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Restcontroller nos indica que esta clase es una API.
@RequestMapping("/api/v1/LugarComida")
public class LugarServicioComidaApi {
    LugarServicioComidaBl lugarServicioComidaBl;

    public LugarServicioComidaApi(LugarServicioComidaBl lugarServicioComidaBl){
        this.lugarServicioComidaBl = lugarServicioComidaBl;
    }

    @GetMapping("/{idCuenta}")
    public LugarComidaDto LugarComidaApi(@PathVariable(name = "idCuenta") Integer idCuenta){
           return this.lugarServicioComidaBl.encontrarDatosLugar(idCuenta);

    }
    @GetMapping("/{idCuenta}/clientes")
    public List<EtyClientesServicioComida> LugarComidaClientesApi(@PathVariable(name = "idCuenta") Integer idCuenta){
           return this.lugarServicioComidaBl.encontrarDatosClientes(idCuenta);

    }

    @GetMapping("/{idComida}/cliente/{idCuenta}")
    public List<EtyClientesServicioComida> LugarComidaServicioComidaApi(@PathVariable(name = "idCuenta") Integer idCuenta, @PathVariable(name = "idComida") Integer idComida){
           return this.lugarServicioComidaBl.encontrarDatosServicioComida(idCuenta, idComida);

    }
    @GetMapping("/{idCuenta}/planes")
    public List<PlanesComidaDto> LugarComidaPlanesApi(@PathVariable(name = "idCuenta") Integer idCuenta){
           return this.lugarServicioComidaBl.encontrarDatosPlanesComida(idCuenta);

    }
    @PostMapping
    public RespuestaDto<PlanesComidaDto> LugarComidaPlanesApi(@RequestBody PlanesComidaDto planesComidaDto){
          if(planesComidaDto!=null && planesComidaDto.getNombrePlan() !=null && planesComidaDto.getCostoMes() != null){
              this.lugarServicioComidaBl.crearPlanComida(planesComidaDto);
                return new RespuestaDto<>(planesComidaDto, "Plan de comida creado correctamente", true);


          }else {
              return new RespuestaDto<>(null, "Error al crear el plan de comida", false);
          }

    }



}
