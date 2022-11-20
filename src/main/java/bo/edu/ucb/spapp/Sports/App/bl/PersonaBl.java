package bo.edu.ucb.spapp.Sports.App.bl;


import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearPersonaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpPersona;
import org.springframework.stereotype.Service;


@Service
public class PersonaBl {

    private SpCuentaDao spCuentaDao;


    public PersonaBl(SpCuentaDao spCuentaDao) {
        this.spCuentaDao = spCuentaDao;
    }

    public void crearPersona(CrearPersonaDto crearPersonaDto){
        SpPersona spCrearPersona = new SpPersona();
        spCrearPersona.setNombres(crearPersonaDto.getNombres());
        spCrearPersona.setApellidos(crearPersonaDto.getApellidos());
        spCrearPersona.setGenero(crearPersonaDto.getGenero());
        spCrearPersona.setNumeroTelefono(crearPersonaDto.getNumeroTelefono());
        spCrearPersona.setCiudad(crearPersonaDto.getCiudad());
        spCrearPersona.setCatPersonaStatus(crearPersonaDto.getCatPersonaStatus());
        spCrearPersona.setFechaNacimiento(crearPersonaDto.getFechaNacimiento());
        spCrearPersona.setAltura(crearPersonaDto.getAltura());
        spCrearPersona.setPeso(crearPersonaDto.getPeso());
        spCrearPersona.setIndiceMasaCorporal(crearPersonaDto.getIndiceMasaCorporal());
        spCrearPersona.setFoto(crearPersonaDto.getFoto());
        this.spCuentaDao.crearPersona(spCrearPersona);
    }
}
