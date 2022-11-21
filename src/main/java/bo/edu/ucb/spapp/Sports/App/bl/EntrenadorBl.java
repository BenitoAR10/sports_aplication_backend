package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpEntrenadorDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpEntrenador;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorBl {

    private SpEntrenadorDao spEntrenadorDao;

    public EntrenadorBl(SpEntrenadorDao spEntrenadorDao) {
        this.spEntrenadorDao = spEntrenadorDao;
    }

    public void crearEntrenador(CrearEntrenadorDto crearEntrenadorDto){
        SpEntrenador spCrearEntrenador = new SpEntrenador();
        spCrearEntrenador.setIdCuenta(crearEntrenadorDto.getIdCuenta());
        spCrearEntrenador.setNit(crearEntrenadorDto.getNit());
        spCrearEntrenador.setFoto(crearEntrenadorDto.getFotoEntrenador());
        spCrearEntrenador.setCorreo(crearEntrenadorDto.getCorreo());
        this.spEntrenadorDao.crearEntrenador(spCrearEntrenador);
    }
}
