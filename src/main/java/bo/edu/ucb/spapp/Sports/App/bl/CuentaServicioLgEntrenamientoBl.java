package bo.edu.ucb.spapp.Sports.App.bl;

import bo.edu.ucb.spapp.Sports.App.dao.CuentaServicioLgEntrenamientoDao;
import bo.edu.ucb.spapp.Sports.App.dao.SpCuentaDao;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CuentaServicioLgEntrenamientoBl {

    private CuentaServicioLgEntrenamientoDao cuentaServicioLgEntrenamientoDao;

    public CuentaServicioLgEntrenamientoBl(CuentaServicioLgEntrenamientoDao cuentaServicioLgEntrenamientoDao) {
        this.cuentaServicioLgEntrenamientoDao = cuentaServicioLgEntrenamientoDao;
    }


}
