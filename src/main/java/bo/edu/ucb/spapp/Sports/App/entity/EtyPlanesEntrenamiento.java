package bo.edu.ucb.spapp.Sports.App.entity;

import java.math.BigDecimal;

public class EtyPlanesEntrenamiento {
    private int idLugarEntrenamientoSucursal;
    private int idPlanLugarEntrenamiento;
    private int cantidadMeses;
    private BigDecimal costo;

    public EtyPlanesEntrenamiento() {
    }

    public EtyPlanesEntrenamiento(int idLugarEntrenamientoSucursal, int idPlanLugarEntrenamiento, int cantidadMeses, BigDecimal costo) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.idPlanLugarEntrenamiento = idPlanLugarEntrenamiento;
        this.cantidadMeses = cantidadMeses;
        this.costo = costo;
    }

    public int getIdLugarEntrenamientoSucursal() {
        return idLugarEntrenamientoSucursal;
    }

    public void setIdLugarEntrenamientoSucursal(int idLugarEntrenamientoSucursal) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
    }

    public int getIdPlanLugarEntrenamiento() {
        return idPlanLugarEntrenamiento;
    }

    public void setIdPlanLugarEntrenamiento(int idPlanLugarEntrenamiento) {
        this.idPlanLugarEntrenamiento = idPlanLugarEntrenamiento;
    }

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
}
