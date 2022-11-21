package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpLugarEntrenamientoSucursalDao;
import bo.edu.ucb.spapp.Sports.App.dto.LugarEntrenamientoSucursalDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyLugarEntrenamiento;
import org.springframework.stereotype.Service;

@Service
public class LugarEntrenamientoSucursalBl {
    private SpLugarEntrenamientoSucursalDao spLugarEntrenamientoSucursalDao;


    public LugarEntrenamientoSucursalBl(SpLugarEntrenamientoSucursalDao spLugarEntrenamientoSucursalDao) {
        this.spLugarEntrenamientoSucursalDao = spLugarEntrenamientoSucursalDao;

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
}
