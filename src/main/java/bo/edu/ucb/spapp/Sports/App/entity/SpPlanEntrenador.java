
package bo.edu.ucb.spapp.Sports.App.entity;
import java.sql.Date;

public class SpPlanEntrenador {
    private int idPlanEntrenador;
    private int idEntrenador;
    private double costo;
    private int cantidadMeses;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpPlanEntrenador() {
    }

    public SpPlanEntrenador(int idPlanEntrenador, int idEntrenador, double costo, int cantidadMeses, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idPlanEntrenador = idPlanEntrenador;
        this.idEntrenador = idEntrenador;
        this.costo = costo;
        this.cantidadMeses = cantidadMeses;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public int getIdPlanEntrenador() {
        return idPlanEntrenador;
    }

    public void setIdPlanEntrenador(int idPlanEntrenador) {
        this.idPlanEntrenador = idPlanEntrenador;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
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
