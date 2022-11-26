package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.CuentaUsuarioBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cuenta/usuario")
public class CuentaUsuarioApi {
    private final CuentaUsuarioBl cuentaUsuarioBl;

    public CuentaUsuarioApi(CuentaUsuarioBl cuentaUsuarioBl) {
        this.cuentaUsuarioBl = cuentaUsuarioBl;
    }

    @PostMapping
    public RespuestaDto<String> crearCuentaUsuario(@RequestBody CrearCuentaDto crearCuentaDto){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            cuentaUsuarioBl.crearCuentaUsuario(crearCuentaDto);
            return new RespuestaDto<>("Cuenta creada correctamente", null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }
}
