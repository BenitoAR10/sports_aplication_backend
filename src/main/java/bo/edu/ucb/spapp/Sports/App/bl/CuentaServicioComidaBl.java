package bo.edu.ucb.spapp.Sports.App.bl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.CuentaServicioComidaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;

@Service
public class CuentaServicioComidaBl {

    private SpCuentaDao spCuentaDao;

    private CuentaServicioComidaDao cuentaServicioComidaDao;
    // Contructor
    public CuentaServicioComidaBl(SpCuentaDao spCuentaDao, CuentaServicioComidaDao cuentaServicioComidaDao) {
        this.spCuentaDao = spCuentaDao;
        this.cuentaServicioComidaDao = cuentaServicioComidaDao;
    }
    // Metodo para crear una cuenta de servicio de comida
    public void crearCuentaServicioComida(CrearCuentaDto crearCuentaDto){
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

        // Asiganmos el id de la cuenta al grupo de servicio de comida para la autorizacion
        Integer idCuenta = spCuentaDao.findIdByCorreo(crearCuentaDto.getCorreo());
        this.cuentaServicioComidaDao.cuentaGrupoServicioComida(idCuenta);


    }

}
