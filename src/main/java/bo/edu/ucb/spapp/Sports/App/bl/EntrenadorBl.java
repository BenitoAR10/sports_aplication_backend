package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpEntrenadorDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearEntrenadorDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpEntrenador;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorBl {

    private SpEntrenadorDao spEntrenadorDao;
    private SpCuentaDao spCuentaDao;

    public EntrenadorBl(SpEntrenadorDao spEntrenadorDao, SpCuentaDao spCuentaDao) {
        this.spEntrenadorDao = spEntrenadorDao;
        this.spCuentaDao = spCuentaDao;
    }


    // Metodo para crear entrenador
    public void cargarDatosEntrenador(String correo, CrearEntrenadorDto crearEntrenadorDto){
        SpEntrenador entrenador = new SpEntrenador();
        entrenador.setIdCuenta(spCuentaDao.findIdByCorreo(correo));
        entrenador.setNit(crearEntrenadorDto.getNit());
        entrenador.setFotoEntrenador(crearEntrenadorDto.getFotoEntrenador());
        entrenador.setCorreo(crearEntrenadorDto.getCorreo());
        this.spEntrenadorDao.crearEntrenador(entrenador);
    }

    /*
    public void crearEntrenador(CrearEntrenadorDto crearEntrenadorDto){
        SpEntrenador spCrearEntrenador = new SpEntrenador();
        spCrearEntrenador.setIdCuenta(crearEntrenadorDto.getIdCuenta());
        spCrearEntrenador.setNit(crearEntrenadorDto.getNit());
        spCrearEntrenador.setFotoEntrenador(crearEntrenadorDto.getFotoEntrenador());
        spCrearEntrenador.setCorreo(crearEntrenadorDto.getCorreo());
        this.spEntrenadorDao.crearEntrenador(spCrearEntrenador);
    }
     */
}
