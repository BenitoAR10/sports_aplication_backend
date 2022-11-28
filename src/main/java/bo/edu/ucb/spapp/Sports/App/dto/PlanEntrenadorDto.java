package bo.edu.ucb.spapp.Sports.App.dto;

import java.math.BigDecimal;

public class PlanEntrenadorDto {
    private int idPlanEntrenador;
    private int idEntrenador;
    private int cantidadMeses;
    private BigDecimal costo;
    private boolean estado;
    private String txCorreo;
    private String txHost;

    public PlanEntrenadorDto() {
    }

    public PlanEntrenadorDto(int idPlanEntrenador, int idEntrenador, int cantidadMeses, BigDecimal costo, boolean estado, String txCorreo, String txHost) {
        this.idPlanEntrenador = idPlanEntrenador;
        this.idEntrenador = idEntrenador;
        this.cantidadMeses = cantidadMeses;
        this.costo = costo;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txHost = txHost;
    }

    public int getIdPlanEntrenador() {
        return idPlanEntrenador;
    }

    public void setIdPlanEntrenador(int idPlanEntrenador) {
        this.idPlanEntrenador = idPlanEntrenador;
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

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }
}
