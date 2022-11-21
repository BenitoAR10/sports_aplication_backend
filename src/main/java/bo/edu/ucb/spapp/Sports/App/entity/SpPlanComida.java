package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpPlanComida {
    private int idPlan;
    private int idServicioComida;
    private String nombrePlan;
    private String descripcion;
    private double costoMes;
    private boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpPlanComida() {
    }

    public SpPlanComida(int idPlan, int idServicioComida, String nombrePlan, String descripcion, double costoMes, boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idPlan = idPlan;
        this.idServicioComida = idServicioComida;
        this.nombrePlan = nombrePlan;
        this.descripcion = descripcion;
        this.costoMes = costoMes;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getIdServicioComida() {
        return idServicioComida;
    }

    public void setIdServicioComida(int idServicioComida) {
        this.idServicioComida = idServicioComida;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoMes() {
        return costoMes;
    }

    public void setCostoMes(double costoMes) {
        this.costoMes = costoMes;
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
}
