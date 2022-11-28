package bo.edu.ucb.spapp.Sports.App.bl;


import at.favre.lib.crypto.bcrypt.BCrypt;
import bo.edu.ucb.spapp.Sports.App.dao.CuentaUsuarioDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import bo.edu.ucb.spapp.Sports.App.dto.CrearCuentaDto;
import bo.edu.ucb.spapp.Sports.App.entity.SpCuenta;
import org.springframework.stereotype.Service;

@Service
public class CuentaUsuarioBl {
   private SpCuentaDao spCuentaDao;
   private CuentaUsuarioDao cuentaUsuarioDao;

   // Constructor
   public CuentaUsuarioBl(SpCuentaDao spCuentaDao, CuentaUsuarioDao cuentaUsuarioDao) {
       this.spCuentaDao = spCuentaDao;
       this.cuentaUsuarioDao = cuentaUsuarioDao;
   }
   // Crear cuenta de usuario
   public void crearCuentaUsuario(CrearCuentaDto crearCuentaDto){
       SpCuenta spCuenta = new SpCuenta();
       spCuenta.setIdDeporte(crearCuentaDto.getIdDeporte());
       spCuenta.setCorreo(crearCuentaDto.getCorreo());
       spCuenta.setNombres(crearCuentaDto.getNombre());
       spCuenta.setApellidos(crearCuentaDto.getApellido());
       spCuenta.setNumeroTelefono(crearCuentaDto.getNumeroTelefono());
       String contrasenia = BCrypt.withDefaults().hashToString(12, crearCuentaDto.getContrasenia().toCharArray());
       crearCuentaDto.getContrasenia();
       spCuenta.setContrasena(contrasenia);
       this.spCuentaDao.crearCuenta(spCuenta);
       // Asiganmos el id de la cuenta al grupo de usuarios para la autorizacion
       Integer idCuenta = spCuentaDao.findIdByCorreo(crearCuentaDto.getCorreo());
       this.cuentaUsuarioDao.cuentaGrupoUsuario(idCuenta);
   }

}
