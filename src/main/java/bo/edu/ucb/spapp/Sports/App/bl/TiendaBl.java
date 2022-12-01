package bo.edu.ucb.spapp.Sports.App.bl;


import bo.edu.ucb.spapp.Sports.App.dao.CuentaTiendaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpRolesDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpTiendaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearTiendaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpTienda;
import org.springframework.stereotype.Service;

@Service
public class TiendaBl {

    private SpTiendaDao spTiendaDao;
    private SpCuentaDao spCuentaDao;
    private CuentaTiendaDao cuentaTiendaDao;

    public TiendaBl(SpTiendaDao spTiendaDao, SpCuentaDao spCuentaDao, CuentaTiendaDao cuentaTiendaDao) {
        this.spTiendaDao = spTiendaDao;
        this.spCuentaDao = spCuentaDao;
        this.cuentaTiendaDao = cuentaTiendaDao;
    }

    public void crearTienda(CrearTiendaDto crearTiendaDto){
        SpTienda spCrearTienda = new SpTienda();


    }

    public void cargarDatosTienda(String correo, CrearTiendaDto crearTiendaDto){
        SpTienda tienda = new SpTienda();
        tienda.setIdCuenta(spCuentaDao.findIdByCorreo(correo));
        tienda.setNombreTienda(crearTiendaDto.getNombreTienda());
        tienda.setNombrePropietario(crearTiendaDto.getNombrePropietario());
        tienda.setApellidoPropietario(crearTiendaDto.getApellidoPropietario());
        tienda.setFotoTienda(crearTiendaDto.getFoto());
        tienda.setTelefono(crearTiendaDto.getTelefono());
        tienda.setNit(crearTiendaDto.getNit());
        tienda.setDireccion(crearTiendaDto.getDireccion());
        this.cuentaTiendaDao.datosTienda(tienda);
    }


}
