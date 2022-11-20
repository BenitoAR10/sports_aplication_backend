package bo.edu.ucb.spapp.Sports.App.bl;


import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;

@Service // Lo marcamos como service para que Spring lo pueda inyectar.
public class CuentaBl {
    private SpCuentaDao spCuentaDao;

    // Inyectamos el dao para poder usarlo.
    public CuentaBl(SpCuentaDao spCuentaDao) {
        this.spCuentaDao = spCuentaDao;
    }
    public void crearCuenta(CrearCuentaDto crearCuentaDto){
        SpCuenta spCuenta = new SpCuenta();
        spCuenta.setIdPersona(crearCuentaDto.getIdPersona());
        spCuenta.setIdDeporte(crearCuentaDto.getIdDeporte());
        spCuenta.setCorreo(crearCuentaDto.getCorreo());
        String contrasenia = BCrypt.withDefaults().hashToString(12, crearCuentaDto.getContrasenia().toCharArray());
        crearCuentaDto.getContrasenia();
        spCuenta.setSecret(contrasenia);
        this.spCuentaDao.crearCuenta(spCuenta);
    }
}
