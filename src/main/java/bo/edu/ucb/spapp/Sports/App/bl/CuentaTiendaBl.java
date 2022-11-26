package bo.edu.ucb.spapp.Sports.App.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.CuentaTiendaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;


@Service
public class CuentaTiendaBl {

    private SpCuentaDao spCuentaDao;

    private CuentaTiendaDao cuentaTiendaDao;

    public CuentaTiendaBl(SpCuentaDao spCuentaDao, CuentaTiendaDao cuentaTiendaDao) {
        this.spCuentaDao = spCuentaDao;
        this.cuentaTiendaDao = cuentaTiendaDao;
    }

    public void crearCuentaTienda(CrearCuentaDto crearCuentaDto){
        SpCuenta spCuenta = new SpCuenta();
        spCuenta.setIdDeporte(crearCuentaDto.getIdDeporte());
        spCuenta.setCorreo(crearCuentaDto.getCorreo());
        spCuenta.setNombres(crearCuentaDto.getNombre());
        spCuenta.setApellidos(crearCuentaDto.getApellido());
        spCuenta.setNumeroTelefono(crearCuentaDto.getNumeroTelefono());
        String contrasenia = BCrypt.withDefaults().hashToString(12, crearCuentaDto.getContrasenia().toCharArray());
        crearCuentaDto.getContrasenia();
        spCuenta.setContrasena(contrasenia);
        this.spCuentaDao.crearCuenta(spCuenta);

        Integer idCuenta = spCuentaDao.findIdByCorreo(crearCuentaDto.getCorreo());
        this.cuentaTiendaDao.cuentaGrupoTienda(idCuenta);
    }
}
