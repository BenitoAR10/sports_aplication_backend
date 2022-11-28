package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.CuentaServicioLgEntrenamientoBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cuenta")
public class CuentaServicioLgEntrenamientoApi {

    private CuentaServicioLgEntrenamientoBl cuentaServicioLgEntrenamientoBl;

    public CuentaServicioLgEntrenamientoApi(CuentaServicioLgEntrenamientoBl cuentaServicioLgEntrenamientoBl) {
        this.cuentaServicioLgEntrenamientoBl = cuentaServicioLgEntrenamientoBl;
    }

    @PostMapping
    public RespuestaDto<String> crearCuentaUsuario(@RequestBody CrearCuentaDto crearCuentaDto){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            cuentaServicioLgEntrenamientoBl.crearCuentaServicioLgEntrenamiento(crearCuentaDto);
            return new RespuestaDto<>("Cuenta creada correctamente", null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }
}
