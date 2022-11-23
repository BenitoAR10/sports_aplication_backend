package bo.edu.ucb.spapp.Sports.App.bl;
import bo.edu.ucb.spapp.Sports.App.dao.SpLugarServicioComidaDao;

import bo.edu.ucb.spapp.Sports.App.dto.LugarComidaDto;
import bo.edu.ucb.spapp.Sports.App.dto.PlanesComidaDto;
import bo.edu.ucb.spapp.Sports.App.entity.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LugarServicioComidaBl {
    private final SpLugarServicioComidaDao spLugarServicioComidaDao;

    public LugarServicioComidaBl(SpLugarServicioComidaDao spLugarServicioComidaDao) {
        this.spLugarServicioComidaDao = spLugarServicioComidaDao;
    }
    public LugarComidaDto encontrarDatosLugar(int idCuenta) {
        SpServicioComida spServicioComida = spLugarServicioComidaDao.encontrarServicioComida(idCuenta);
        LugarComidaDto lugarComidaDto = new LugarComidaDto();
        lugarComidaDto.setIdLugarComida(spServicioComida.getIdServicioComida());
        lugarComidaDto.setNombreLugar(spServicioComida.getNombreLugar());
        lugarComidaDto.setLogo(spServicioComida.getLogo());
        lugarComidaDto.setDireccion(spServicioComida.getDireccion());

        return lugarComidaDto;

    }
    public List<EtyClientesServicioComida> encontrarDatosClientes(int idCuenta) {
        List<EtyClientesServicioComida> etyClientesLugarComida = spLugarServicioComidaDao.encontrarClientesServicioComida(idCuenta);


        return etyClientesLugarComida;
    }

    public List<EtyClientesServicioComida> encontrarDatosServicioComida(int idCuenta, int idComida) {
        List<EtyClientesServicioComida> etyServicioComida = spLugarServicioComidaDao.encontrarServiciosComidaCliente(idCuenta, idComida);

        return etyServicioComida;
    }
    public List<PlanesComidaDto> encontrarDatosPlanesComida(int idCuenta) {
        List<SpPlanComida> spPlanComida = spLugarServicioComidaDao.encontrarPlanesComida(idCuenta);
        ArrayList<PlanesComidaDto> planesComidaDtos = new ArrayList<>();
        for (SpPlanComida spPlanComida1 : spPlanComida) {
            PlanesComidaDto planesComidaDto1 = new PlanesComidaDto();
            planesComidaDto1.setIdPlanComida(spPlanComida1.getIdPlanComida());
            planesComidaDto1.setNombrePlan(spPlanComida1.getNombrePlan());
            planesComidaDto1.setCostoMes(spPlanComida1.getCostoMes());
            planesComidaDto1.setDescripcion(spPlanComida1.getDescripcion());
            planesComidaDtos.add(planesComidaDto1);
        }

        return planesComidaDtos;
    }
    public void crearPlanComida(PlanesComidaDto planesComidaDto) {
        SpPlanComida spPlanComida = new SpPlanComida();
        spPlanComida.setIdServicioComida(planesComidaDto.getIdServicioComida());
        spPlanComida.setNombrePlan(planesComidaDto.getNombrePlan());
        spPlanComida.setCostoMes(planesComidaDto.getCostoMes());
        spPlanComida.setDescripcion(planesComidaDto.getDescripcion());

        this.spLugarServicioComidaDao.crearPlanComida(spPlanComida);
    }





}
