
package bo.edu.ucb.spapp.Sports.App.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class SpPlanLugarEntrenamiento {
    private int idPlanLugarEntrenamiento;
    private int idLugarEntrenamientoSucursal;
    private BigDecimal costo;
    private int cantidadMeses;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpPlanLugarEntrenamiento() {
    }

    public SpPlanLugarEntrenamiento(int idPlanLugarEntrenamiento, int idLugarEntrenamientoSucursal, BigDecimal costo, int cantidadMeses, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idPlanLugarEntrenamiento = idPlanLugarEntrenamiento;
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.costo = costo;
        this.cantidadMeses = cantidadMeses;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public int getIdPlanLugarEntrenamiento() {
        return idPlanLugarEntrenamiento;
    }

    public void setIdPlanLugarEntrenamiento(int idPlanLugarEntrenamiento) {
        this.idPlanLugarEntrenamiento = idPlanLugarEntrenamiento;
    }

    public int getIdLugarEntrenamientoSucursal() {
        return idLugarEntrenamientoSucursal;
    }

    public void setIdLugarEntrenamientoSucursal(int idLugarEntrenamientoSucursal) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
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
