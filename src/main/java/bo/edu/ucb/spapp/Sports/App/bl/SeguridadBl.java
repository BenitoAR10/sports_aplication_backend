package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;

// Creamos una clase que implemente la interfaz de la capa de acceso a datos y la interfaz de la capa de negocio.
@Service // Service nos indica que podremos inyectar esta clase en otras clases.
public class SeguridadBl {

    private SpCuentaDao spCuentaDao;
    // Constructor de la clase.
    public SeguridadBl(SpCuentaDao spCuentaDao){
        this.spCuentaDao = spCuentaDao;
    }
    // Metodo para obtener un usuario por su id.
    public CuentaDto getUserByPk(Integer idCuenta){
        SpCuenta spCuenta = spCuentaDao.findByPrimarykey(idCuenta);
        // Transformamos la entidad de bbdd a un DTO para
        // retornar al cliente via API (Data Transfer Object)
        CuentaDto cuentaDto = new CuentaDto(spCuenta.getIdCuenta(), spCuenta.getIdPersona(), spCuenta.getIdDeporte(), spCuenta.getCorreo());
        return cuentaDto;

    }
}
