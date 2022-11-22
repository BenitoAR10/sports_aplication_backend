
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpCompraPlan {
    private int idCompraPlan;
    private int idTipoPlanEntrenamiento;
    private int idCuenta;
    private double costoPlan;
    private String detalleComida;
    private Date fechaCompra;
    private Date fechaFin;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpCompraPlan() {
    }

    public SpCompraPlan(int idCompraPlan, int idTipoPlanEntrenamiento, int idCuenta, double costoPlan, String detalleComida, Date fechaCompra, Date fechaFin, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idCompraPlan = idCompraPlan;
        this.idTipoPlanEntrenamiento = idTipoPlanEntrenamiento;
        this.idCuenta = idCuenta;
        this.costoPlan = costoPlan;
        this.detalleComida = detalleComida;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public int getIdCompraPlan() {
        return idCompraPlan;
    }

    public void setIdCompraPlan(int idCompraPlan) {
        this.idCompraPlan = idCompraPlan;
    }

    public int getIdTipoPlanEntrenamiento() {
        return idTipoPlanEntrenamiento;
    }

    public void setIdTipoPlanEntrenamiento(int idTipoPlanEntrenamiento) {
        this.idTipoPlanEntrenamiento = idTipoPlanEntrenamiento;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public double getCostoPlan() {
        return costoPlan;
    }

    public void setCostoPlan(double costoPlan) {
        this.costoPlan = costoPlan;
    }

    public String getDetalleComida() {
        return detalleComida;
    }

    public void setDetalleComida(String detalleComida) {
        this.detalleComida = detalleComida;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
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

    public String getTxCorreo() {
        return txCorreo;
    }

    public void setTxCorreo(String txCorreo) {
        this.txCorreo = txCorreo;
    }

    public Date getTxFecha() {
        return txFecha;
    }

    public void setTxFecha(Date txFecha) {
        this.txFecha = txFecha;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

}
