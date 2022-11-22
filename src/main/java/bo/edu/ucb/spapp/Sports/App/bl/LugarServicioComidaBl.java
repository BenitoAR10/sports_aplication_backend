package bo.edu.ucb.spapp.Sports.App.bl;
import bo.edu.ucb.spapp.Sports.App.dao.SpLugarServicioComidaDao;

import bo.edu.ucb.spapp.Sports.App.dto.LugarComidaDto;
import bo.edu.ucb.spapp.Sports.App.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarServicioComidaBl {
    private SpLugarServicioComidaDao spLugarServicioComidaDao;

    public LugarServicioComidaBl(SpLugarServicioComidaDao spLugarServicioComidaDao) {
        this.spLugarServicioComidaDao = spLugarServicioComidaDao;
    }
    public LugarComidaDto encontrarDatosLugar(int idCuenta) {
        SpServicioComida spServicioComida = spLugarServicioComidaDao.encontrarServicioComida(idCuenta);
        LugarComidaDto lugarComidaDto = new LugarComidaDto();
        lugarComidaDto.setNombreLugar(spServicioComida.getNombreLugar());
        lugarComidaDto.setLogo(spServicioComida.getLogo());
        lugarComidaDto.setDireccion(spServicioComida.getDireccion());

        return lugarComidaDto;

    }





}
