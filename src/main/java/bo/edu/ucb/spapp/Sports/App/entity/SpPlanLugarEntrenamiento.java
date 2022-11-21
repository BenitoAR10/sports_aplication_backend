package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpPlanLugarEntrenamiento {
    private int idPlan;
    private int idLugarEntrenamientoSucursal;
    private double costo;
    private int cantidadMeses;
    private boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpPlanLugarEntrenamiento() {
    }

    public SpPlanLugarEntrenamiento(int idPlan, int idLugarEntrenamientoSucursal, double costo, int cantidadMeses, boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idPlan = idPlan;
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.costo = costo;
        this.cantidadMeses = cantidadMeses;
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

    public int getIdLugarEntrenamientoSucursal() {
        return idLugarEntrenamientoSucursal;
    }

    public void setIdLugarEntrenamientoSucursal(int idLugarEntrenamientoSucursal) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
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
