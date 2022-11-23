package bo.edu.ucb.spapp.Sports.App.api;


import bo.edu.ucb.spapp.Sports.App.bl.CuentaBl;
import bo.edu.ucb.spapp.Sports.App.bl.SeguridadBl;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.CuentaDto;
import bo.edu.ucb.spapp.Sports.App.dto.RespuestaDto;
import bo.edu.ucb.spapp.Sports.App.entity.EtyCuentaPersona;
import bo.edu.ucb.spapp.Sports.App.util.AuthUtil;
import bo.edu.ucb.spapp.Sports.App.util.SpException;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/cuenta")
public class CuentaApi {
    private CuentaBl cuentaBl;

    private SeguridadBl seguridadBl;

    public CuentaApi (CuentaBl cuentaBl, SeguridadBl seguridadBl) {

        this.cuentaBl = cuentaBl;
        this.seguridadBl = seguridadBl;
    }

    // Metodo para verificar que los campos no esten vacios
    @PostMapping
    public RespuestaDto<CrearCuentaDto> crearCuenta(@RequestBody CrearCuentaDto crearCuentaDto){
        if (crearCuentaDto != null && crearCuentaDto.getIdPersona()!= null && crearCuentaDto.getIdDeporte() != null && crearCuentaDto.getCorreo() != null && crearCuentaDto.getContrasenia() != null){
            this.cuentaBl.crearCuenta(crearCuentaDto);
            return new RespuestaDto<>(crearCuentaDto, "Cuenta creada correctamente", true);
        }
        else {
            return new RespuestaDto<>(null, "Credenciales incorrectas", false);
        }
    }
    // Metodo para obtener un usuario por su id.
    /**
     * Endpoint para probar la busqueda por llave primaria.
     * @param idCuenta
     * @return
     */
    @GetMapping("/{idCuenta}")
    public RespuestaDto<EtyCuentaPersona> getUserFromToken(@RequestHeader Map<String, String> headers){
        try{
            String correo = AuthUtil.isUserAuthenticated(AuthUtil.getTokenFromHeader(headers));
            return new RespuestaDto<>(this.cuentaBl.findByCorreo(correo), null, true);
        }catch (SpException e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }
    // Metodo de autorizacion para super usuario de la aplicacion que permite crear cuentas de usuario.

    @PostMapping
    public RespuestaDto<String> crearCuenta(@RequestHeader Map<String, String> headers, @RequestBody CrearCuentaDto crearCuentaDto){
        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            // Si no tiene el rol de super usuario, no puede crear cuentas. Y se lanzara una excepcion.
            AuthUtil.verifyHasRole(jwt, "Agregar entrenamientos"); // Autorizacion para crear cuentas de usuario.
            cuentaBl.crearCuenta(crearCuentaDto);
            return new RespuestaDto<>("Cuenta creada correctamente", null, true);
        } catch (SpException e){
            return new RespuestaDto<>(null, e.getMessage(), false);
        }

    }


}
