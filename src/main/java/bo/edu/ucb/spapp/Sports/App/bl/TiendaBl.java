package bo.edu.ucb.spapp.Sports.App.bl;


import bo.edu.ucb.spapp.Sports.App.dao.SpRolesDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpTiendaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearTiendaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpTienda;
import org.springframework.stereotype.Service;

@Service
public class TiendaBl {

    private SpTiendaDao spTiendaDao;


    public TiendaBl(SpTiendaDao spTiendaDao) {
        this.spTiendaDao = spTiendaDao;

    }

    public void crearTienda(CrearTiendaDto crearTiendaDto){
        SpTienda spCrearTienda = new SpTienda();
        spCrearTienda.setIdCuenta(crearTiendaDto.getIdCuenta());
        spCrearTienda.setNombreTienda(crearTiendaDto.getNombreTienda());
        spCrearTienda.setNombrePropietario(crearTiendaDto.getNombrePropietario());
        spCrearTienda.setApellidoPropietario(crearTiendaDto.getApellidoPropietario());
        spCrearTienda.setNit(crearTiendaDto.getNit());
        spCrearTienda.setTelefono(crearTiendaDto.getTelefono());
        spCrearTienda.setCorreo(crearTiendaDto.getCorreo());
        spCrearTienda.setFotoTienda(crearTiendaDto.getFoto());
        spCrearTienda.setDireccion(crearTiendaDto.getDireccion());
        this.spTiendaDao.crearTienda(spCrearTienda);

    }
}
