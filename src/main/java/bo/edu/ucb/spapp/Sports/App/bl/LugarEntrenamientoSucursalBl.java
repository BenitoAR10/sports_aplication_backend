package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpLugarEntrenamientoSucursalDao;

import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;

import bo.edu.ucb.spapp.Sports.App.dto.PlanesEntrenamientoDto;
import bo.edu.ucb.spapp.Sports.App.entity.*;

import bo.edu.ucb.spapp.Sports.App.entity.EtyLugarEntrenamiento;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarEntrenamientoSucursalBl {
    private SpLugarEntrenamientoSucursalDao spLugarEntrenamientoSucursalDao;


    public LugarEntrenamientoSucursalBl(SpLugarEntrenamientoSucursalDao spLugarEntrenamientoSucursalDao) {
        this.spLugarEntrenamientoSucursalDao = spLugarEntrenamientoSucursalDao;

    }

    public LugarEntrenamientoSucursalDto encontrarDatosLugar(int idCuenta) {

        EtyLugarEntrenamiento etyLugarEntrenamiento = spLugarEntrenamientoSucursalDao.encontrarDatosLugar(idCuenta);
        LugarEntrenamientoSucursalDto lugarEntrenamientoSucursalDto = new LugarEntrenamientoSucursalDto();
        lugarEntrenamientoSucursalDto.setIdLugarEntrenamientoSucursal(etyLugarEntrenamiento.getIdLugarEntrenamiento());
        lugarEntrenamientoSucursalDto.setNombre(etyLugarEntrenamiento.getNombreLugar());
        lugarEntrenamientoSucursalDto.setLogo(etyLugarEntrenamiento.getLogoLugar());
        lugarEntrenamientoSucursalDto.setDireccion(etyLugarEntrenamiento.getDireccion());

        return lugarEntrenamientoSucursalDto;

    }
    public List<EtyClientesLugarEntrenamiento> encontrarDatosCliente(int idCuenta) {

        List<EtyClientesLugarEntrenamiento> etyClientesLugarEntrenamiento = spLugarEntrenamientoSucursalDao.encontrarClientesLugar(idCuenta);


        return etyClientesLugarEntrenamiento;

    }

    public List<EtyHistorialClienteLugarEntrenamiento> encontrarHistorialCliente(int idCuenta, int idCliente) {

        List<EtyHistorialClienteLugarEntrenamiento> etyHistorialClienteLugarEntrenamiento = spLugarEntrenamientoSucursalDao.encontrarHistorialCliente(idCuenta, idCliente);

        return etyHistorialClienteLugarEntrenamiento;
    }
    public List<EtyPlanesEntrenamiento> encontrarPlanes(int idCuenta) {

        List<EtyPlanesEntrenamiento> etyPlanesEntrenamiento = spLugarEntrenamientoSucursalDao.encontrarPlanesLugar(idCuenta);


        return etyPlanesEntrenamiento;
    }
    public void insertarPlanEntrenamiento (PlanesEntrenamientoDto planesEntrenamientoDto){
        SpPlanLugarEntrenamiento spPlanLugarEntrenamiento = new SpPlanLugarEntrenamiento();
        spPlanLugarEntrenamiento.setIdLugarEntrenamientoSucursal(planesEntrenamientoDto.getIdLugarEntrenamientoSucursal());
        spPlanLugarEntrenamiento.setCosto(planesEntrenamientoDto.getCosto());
        spPlanLugarEntrenamiento.setCantidadMeses(planesEntrenamientoDto.getCantidadMeses());
        spPlanLugarEntrenamiento.setTxCorreo(planesEntrenamientoDto.getTxCorreo());
        spPlanLugarEntrenamiento.setTxFecha(planesEntrenamientoDto.getTxFecha());
        spPlanLugarEntrenamiento.setTxHost(planesEntrenamientoDto.getTxHost());

        this.spLugarEntrenamientoSucursalDao.insertarPlanEntrenamiento(spPlanLugarEntrenamiento);
    }
}
