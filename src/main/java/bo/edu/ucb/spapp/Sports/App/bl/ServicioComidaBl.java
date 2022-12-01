package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.CuentaServicioComidaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpServicioComidaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearServicioComidaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpServicioComida;
import org.springframework.stereotype.Service;

@Service
public class ServicioComidaBl {

    private SpServicioComidaDao spServicioComidaDao;
    private SpCuentaDao spCuentaDao;

    private CuentaServicioComidaDao cuentaServicioComidaDao;

    public ServicioComidaBl(SpServicioComidaDao spServicioComidaDao, SpCuentaDao spCuentaDao, CuentaServicioComidaDao cuentaServicioComidaDao) {
        this.spServicioComidaDao = spServicioComidaDao;
        this.spCuentaDao = spCuentaDao;
        this.cuentaServicioComidaDao = cuentaServicioComidaDao;
    }
    public void crearServicioComida(CrearServicioComidaDto crearServicioComidaDto) {
        SpServicioComida spCrearSercioComida = new SpServicioComida();
        spCrearSercioComida.setIdCuenta(crearServicioComidaDto.getIdCuenta());
        spCrearSercioComida.setNombreLugar(crearServicioComidaDto.getNombreLugar());
        spCrearSercioComida.setLogo(crearServicioComidaDto.getLogo());
        spCrearSercioComida.setNombrePropietario(crearServicioComidaDto.getNombrePropietario());
        spCrearSercioComida.setApellidoPropietario(crearServicioComidaDto.getApellidoPropietario());
        spCrearSercioComida.setNit(crearServicioComidaDto.getNit());
        spCrearSercioComida.setTelefono(crearServicioComidaDto.getTelefono());
        spCrearSercioComida.setCorreo(crearServicioComidaDto.getCorreo());
        spCrearSercioComida.setDireccion(crearServicioComidaDto.getDireccion());
        spCrearSercioComida.setLongitud(crearServicioComidaDto.getLongitud());
        spCrearSercioComida.setLatitud(crearServicioComidaDto.getLatitud());
        this.spServicioComidaDao.crearServicioComida(spCrearSercioComida);
    }

    public void cargarDatosServicioComida(String correo, CrearServicioComidaDto crearServicioComidaDto){
        SpServicioComida servicioComida = new SpServicioComida();
        servicioComida.setIdCuenta(spCuentaDao.findIdByCorreo(correo));
        servicioComida.setNombreLugar(crearServicioComidaDto.getNombreLugar());
        servicioComida.setLogo(crearServicioComidaDto.getLogo());
        servicioComida.setNombrePropietario(crearServicioComidaDto.getNombrePropietario());
        servicioComida.setApellidoPropietario(crearServicioComidaDto.getApellidoPropietario());
        servicioComida.setNit(crearServicioComidaDto.getNit());
        servicioComida.setTelefono(crearServicioComidaDto.getTelefono());
        servicioComida.setCorreo(crearServicioComidaDto.getCorreo());
        servicioComida.setDireccion(crearServicioComidaDto.getDireccion());
        servicioComida.setLongitud(crearServicioComidaDto.getLongitud());
        servicioComida.setLatitud(crearServicioComidaDto.getLatitud());
        this.cuentaServicioComidaDao.datosServicioComida(servicioComida);
    }

}
