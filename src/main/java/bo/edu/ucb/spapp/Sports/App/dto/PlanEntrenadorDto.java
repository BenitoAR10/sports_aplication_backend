package bo.edu.ucb.spapp.Sports.App.dto;

public class PlanEntrenadorDto {
    private int idPlanEntrenador;
    private int cantidadMeses;
    private double costo;
    private boolean estado;
    private String txCorreo;
    private String txHost;

    public PlanEntrenadorDto() {
    }

    public PlanEntrenadorDto(int idPlanEntrenador, int cantidadMeses, double costo, boolean estado, String txCorreo, String txHost) {
        this.idPlanEntrenador = idPlanEntrenador;
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
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
}
