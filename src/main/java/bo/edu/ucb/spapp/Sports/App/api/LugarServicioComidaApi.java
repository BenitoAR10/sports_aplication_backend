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
    public RespuestaDto<LugarComidaDto> LugarComidaApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        try {
            LugarComidaDto lugarComidaDto = lugarServicioComidaBl.encontrarDatosLugar(idCuenta);
            return new RespuestaDto<>(lugarComidaDto, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }
    @GetMapping("/{idCuenta}/clientes")
    public RespuestaDto<List<EtyClientesServicioComida>> LugarComidaClientesApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        try {
            List<EtyClientesServicioComida> lista = lugarServicioComidaBl.encontrarDatosClientes(idCuenta);
            return new RespuestaDto<>(lista, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }


    }

    @GetMapping("/{idComida}/cliente/{idCuenta}")
    public RespuestaDto<List<EtyClientesServicioComida>> LugarComidaServicioComidaApi(@PathVariable(name = "idCuenta") Integer idCuenta, @PathVariable(name = "idComida") Integer idComida){
        try {
            List<EtyClientesServicioComida> lista = lugarServicioComidaBl.encontrarDatosServicioComida(idCuenta, idComida);
            return new RespuestaDto<>(lista, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }
    @GetMapping("/{idCuenta}/planes")
    public RespuestaDto<List<PlanesComidaDto>> LugarComidaPlanesApi(@PathVariable(name = "idCuenta") Integer idCuenta){
        try {
            List<PlanesComidaDto> lista = lugarServicioComidaBl.encontrarDatosPlanesComida(idCuenta);
            return new RespuestaDto<>(lista, null, true);
        } catch (Exception e) {
            return new RespuestaDto<>(null, e.getMessage(), false);
        }


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
