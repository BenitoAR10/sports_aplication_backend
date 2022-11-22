package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpServicioComidaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearServicioComidaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpServicioComida;
import org.springframework.stereotype.Service;

@Service
public class ServicioComidaBl {

    private SpServicioComidaDao spServicioComidaDao;

    public ServicioComidaBl(SpServicioComidaDao spServicioComidaDao) {
        this.spServicioComidaDao = spServicioComidaDao;
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
}
