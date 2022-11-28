package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.CuentaEntrenadorBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cuenta/entrenador")
public class CuentaEntrenadorApi {

    private CuentaEntrenadorBl cuentaEntrenadorBl;

    public CuentaEntrenadorApi(CuentaEntrenadorBl cuentaEntrenadorBl) {
        this.cuentaEntrenadorBl = cuentaEntrenadorBl;
    }

    @PostMapping
    public RespuestaDto<String> crearCuentaUsuario(@RequestBody CrearCuentaDto crearCuentaDto){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            cuentaEntrenadorBl.crearCuentaEntrenador(crearCuentaDto);
            return new RespuestaDto<>("Cuenta creada correctamente", null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }
}
