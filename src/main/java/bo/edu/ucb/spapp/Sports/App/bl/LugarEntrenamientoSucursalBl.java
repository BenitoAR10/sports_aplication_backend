package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpLugarEntrenamientoSucursalDao;

import bo.edu.ucb.spapp.Sports.App.dto.CrearLugarEntrenamientoSucursalDto;
import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;

import bo.edu.ucb.spapp.Sports.App.dto.PlanesEntrenamientoDto;
import bo.edu.ucb.spapp.Sports.App.entity.*;

import bo.edu.ucb.spapp.Sports.App.entity.EtyLugarEntrenamiento;


import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LugarEntrenamientoSucursalBl {
    private final SpLugarEntrenamientoSucursalDao spLugarEntrenamientoSucursalDao;
    private SpCuentaDao spCuentaDao;


    public LugarEntrenamientoSucursalBl(SpLugarEntrenamientoSucursalDao spLugarEntrenamientoSucursalDao, SpCuentaDao spCuentaDao) {
        this.spLugarEntrenamientoSucursalDao = spLugarEntrenamientoSucursalDao;
        this.spCuentaDao = spCuentaDao;

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


        this.spLugarEntrenamientoSucursalDao.insertarPlanEntrenamiento(spPlanLugarEntrenamiento);
    }

    public void cargarDatosSucursal(String correo, CrearLugarEntrenamientoSucursalDto crearLugarEntrenamientoSucursalDto){
        SpLugarEntrenamientoSucursal spLugarEntrenamientoSucursal = new SpLugarEntrenamientoSucursal();
        spLugarEntrenamientoSucursal.setIdCuenta(spCuentaDao.findIdByCorreo(correo));
        spLugarEntrenamientoSucursal.setNombreEncargado(crearLugarEntrenamientoSucursalDto.getNombre_encargado());
        spLugarEntrenamientoSucursal.setApellidoEncargado(crearLugarEntrenamientoSucursalDto.getApellido_encargado());
        spLugarEntrenamientoSucursal.setTelefonoSucursal(crearLugarEntrenamientoSucursalDto.getTelefono_sucursal());
        spLugarEntrenamientoSucursal.setDireccion(crearLugarEntrenamientoSucursalDto.getDireccion());
        this.spLugarEntrenamientoSucursalDao.cargarDatosSucursal(spLugarEntrenamientoSucursal);
    }
}
