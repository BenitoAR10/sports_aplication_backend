package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpLugarEntrenadorDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpLugarEntrenamientoSucursalDao;

import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;

import bo.edu.ucb.spapp.Sports.App.dto.PlanEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.dto.PlanesEntrenamientoDto;
import bo.edu.ucb.spapp.Sports.App.entity.*;

import bo.edu.ucb.spapp.Sports.App.entity.EtyLugarEntrenamiento;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Service
public class LugarEntrenadorBl {
    private final SpLugarEntrenadorDao spLugarEntrenadorDao;

    public LugarEntrenadorBl(SpLugarEntrenadorDao spLugarEntrenadorDao) {
        this.spLugarEntrenadorDao = spLugarEntrenadorDao;
    }

    public LugarEntrenadorDto encontrarDatosEntrenador(int idCuenta) {

        EtyLugarEntrenador etyLugarEntrenador = spLugarEntrenadorDao.obtenerEntrenadorPorIdCuenta(idCuenta);
        LugarEntrenadorDto lugarEntrenadorDto = new LugarEntrenadorDto();
        lugarEntrenadorDto.setIdEntrenador(etyLugarEntrenador.getIdEntrenador());
        lugarEntrenadorDto.setIdCuenta(etyLugarEntrenador.getIdCuenta());
        lugarEntrenadorDto.setNombres(etyLugarEntrenador.getNombres());
        lugarEntrenadorDto.setApellidos(etyLugarEntrenador.getApellidos());
        lugarEntrenadorDto.setFotoEntrenador(etyLugarEntrenador.getFotoEntrenador());
        lugarEntrenadorDto.setCorreo(etyLugarEntrenador.getCorreo());

        return lugarEntrenadorDto;

    }
    public List<PlanEntrenadorDto> encontrarPlanEntrenador(int idCuenta) {

        List<SpPlanEntrenador> spPlanEntrenador = spLugarEntrenadorDao.obtenerPlanEntrenadorPorIdCuenta(idCuenta);
        ArrayList<PlanEntrenadorDto> planEntrenadorDtolist = new ArrayList<>();
       for (SpPlanEntrenador planEntrenador : spPlanEntrenador) {
            PlanEntrenadorDto planEntrenadorDto = new PlanEntrenadorDto();
            planEntrenadorDto.setIdPlanEntrenador(planEntrenador.getIdPlanEntrenador());
            planEntrenadorDto.setCantidadMeses(planEntrenador.getCantidadMeses());
            planEntrenadorDto.setCosto(planEntrenador.getCosto());
            planEntrenadorDto.setEstado(planEntrenador.isEstado());
            planEntrenadorDtolist.add(planEntrenadorDto);
        }
        return planEntrenadorDtolist;

    }
    public List<EtyHistorialEntrenador> historialDeCliente(int idEntrenador, int idCliente) {
        System.out.println("idCliente: " + idCliente+ "idEntrenador: " + idEntrenador);
        List<EtyHistorialEntrenador> etyHistorialEntrenador = spLugarEntrenadorDao.obtenerPlanesAdquiridosPorUnaCuenta(idEntrenador, idCliente);

        return etyHistorialEntrenador;

    }
    public List<EtyHistorialEntrenador> todosLosClientes(int idEntrenador) {

        List<EtyHistorialEntrenador> etyHistorialEntrenador = spLugarEntrenadorDao.obtenerPlanesActivosEntrenador(idEntrenador);

        return etyHistorialEntrenador;

    }
    public void agregarPlanesEntrenador(PlanEntrenadorDto planEntrenadorDto) {
        SpPlanEntrenador spPlanEntrenador = new SpPlanEntrenador();
        spPlanEntrenador.setIdEntrenador(planEntrenadorDto.getIdEntrenador());
        spPlanEntrenador.setCantidadMeses(planEntrenadorDto.getCantidadMeses());
        spPlanEntrenador.setCosto(planEntrenadorDto.getCosto());
        this.spLugarEntrenadorDao.agregarPlanEntrenador(spPlanEntrenador);
    }




}
