<<<<<<< HEAD
<<<<<<< HEAD
package bo.edu.ucb.spapp.Sports.App.entity;public class SpCompraPlan {
=======
=======
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpCompraPlan {
    private int idCompraPlan;
    private int idTipoPlan;
    private int idCuenta;
    private double costo;
    private String detalleComida;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpCompraPlan() {
    }

    public SpCompraPlan(int idCompraPlan, int idTipoPlan, int idCuenta, double costo, String detalleComida, Date fechaInicio, Date fechaFin, boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idCompraPlan = idCompraPlan;
        this.idTipoPlan = idTipoPlan;
        this.idCuenta = idCuenta;
        this.costo = costo;
        this.detalleComida = detalleComida;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public int getIdCompraPlan() {
        return idCompraPlan;
    }

    public void setIdCompraPlan(int idCompraPlan) {
        this.idCompraPlan = idCompraPlan;
    }

    public int getIdTipoPlan() {
        return idTipoPlan;
    }

    public void setIdTipoPlan(int idTipoPlan) {
        this.idTipoPlan = idTipoPlan;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDetalleComida() {
        return detalleComida;
    }

    public void setDetalleComida(String detalleComida) {
        this.detalleComida = detalleComida;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTx_correo() {
        return tx_correo;
    }

    public void setTx_correo(String tx_correo) {
        this.tx_correo = tx_correo;
    }

    public Date getTx_fecha() {
        return tx_fecha;
    }

    public void setTx_fecha(Date tx_fecha) {
        this.tx_fecha = tx_fecha;
    }

    public String getTx_host() {
        return tx_host;
    }

    public void setTx_host(String tx_host) {
        this.tx_host = tx_host;
    }
<<<<<<< HEAD
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
=======
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
}
