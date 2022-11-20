package bo.edu.ucb.spapp.Sports.App.bl;


import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCrearCuenta;
import org.springframework.stereotype.Service;

@Service // Lo marcamos como service para que Spring lo pueda inyectar.
public class CuentaBl {
    private SpCuentaDao spCuentaDao;

    // Inyectamos el dao para poder usarlo.
    public CuentaBl(SpCuentaDao spCuentaDao) {
        this.spCuentaDao = spCuentaDao;
    }
    public void crearCuenta(CrearCuentaDto crearCuentaDto){
        SpCrearCuenta spCrearCuenta = new SpCrearCuenta();
        spCrearCuenta.setIdPersona(crearCuentaDto.getIdPersona());
        spCrearCuenta.setIdDeporte(crearCuentaDto.getIdDeporte());
        spCrearCuenta.setCorreo(crearCuentaDto.getCorreo());
        String contrasenia = BCrypt.withDefaults().hashToString(12, crearCuentaDto.getContrasenia().toCharArray());
        crearCuentaDto.getContrasenia();
        spCrearCuenta.setContrasenia(contrasenia);
        this.spCuentaDao.crearCuenta(spCrearCuenta);
    }
}
