package bo.edu.ucb.spapp.Sports.App.dto;

import java.math.BigDecimal;

public class PlanesComidaDto {
    private int idServicioComida;
    private int idPlanComida;
    private String nombrePlan;
    private BigDecimal costoMes;
    private String descripcion;
    private boolean estado;

    public PlanesComidaDto() {
    }

    public PlanesComidaDto(int idServicioComida, int idPlanComida, String nombrePlan, BigDecimal costoMes, String descripcion, boolean estado) {
        this.idServicioComida = idServicioComida;
        this.idPlanComida = idPlanComida;
        this.nombrePlan = nombrePlan;
        this.costoMes = costoMes;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdServicioComida() {
        return idServicioComida;
    }

    public void setIdServicioComida(int idServicioComida) {
        this.idServicioComida = idServicioComida;
    }

    public int getIdPlanComida() {
        return idPlanComida;
    }

    public void setIdPlanComida(int idPlanComida) {
        this.idPlanComida = idPlanComida;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public BigDecimal getCostoMes() {
        return costoMes;
    }

    public void setCostoMes(BigDecimal costoMes) {
        this.costoMes = costoMes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
