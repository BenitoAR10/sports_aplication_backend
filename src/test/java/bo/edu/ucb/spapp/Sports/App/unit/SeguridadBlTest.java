package bo.edu.ucb.spapp.Sports.App.unit;

import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.entity.dto.RespAutenticacionDto;
import bo.edu.ucb.spapp.Sports.App.entity.dto.SoliAutenticacionDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


// @SpringBootTest Esto me permite hacer pruebas de integracion con la base de datos.
public class SeguridadBlTest {
    @Test
    void succesfulAuthentication() {
        SpCuentaDao spCuentaDao = Mockito.mock(SpCuentaDao.class);
        SeguridadBl seguridadBl = new SeguridadBl(spCuentaDao);


        RespAutenticacionDto response = seguridadBl.authentication(new SoliAutenticacionDto("amirb@gmial.com", "123456"));
        Assertions.assertNotNull(response); // Verificamos que la respuesta no sea nula.
        Assertions.assertNotNull(response.getToken()); // Verificamos que el token no sea nulo.
        Assertions.assertNotNull(response.getRefresh()); // Verificamos que el refresh no sea nulo.
    }
}
