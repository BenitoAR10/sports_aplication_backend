package bo.edu.ucb.spapp.Sports.App.api;

import bo.edu.ucb.spapp.Sports.App.bl.CuentaTiendaBl;
import bo.edu.ucb.spapp.Sports.App.bl.TiendaBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.CrearTiendaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.util.AuthUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cuenta/tienda")
public class CuentaTiendaApi {

    private CuentaTiendaBl cuentaTiendaBl;

    private TiendaBl tiendaBl;

    public CuentaTiendaApi(CuentaTiendaBl cuentaTiendaBl, TiendaBl tiendaBl) {
        this.cuentaTiendaBl = cuentaTiendaBl;
        this.tiendaBl = tiendaBl;
    }
    @PostMapping
    public RespuestaDto<String> crearCuentaUsuario(@RequestBody CrearCuentaDto crearCuentaDto){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        try{
            cuentaTiendaBl.crearCuentaTienda(crearCuentaDto);
            return new RespuestaDto<>("Cuenta creada correctamente", null, true);
        } catch (Exception e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }
    }


}
