package bo.edu.ucb.spapp.Sports.App.entity;
import java.sql.Date;

public class SpPlanEntrenador {
    private int idPlanEntrenador;
    private int idEntrenador;
    private double costo;
    private int cantidadMeses;
    private boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpPlanEntrenador() {
    }

    public SpPlanEntrenador(int idPlanEntrenador, int idEntrenador, double costo, int cantidadMeses, boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idPlanEntrenador = idPlanEntrenador;
        this.idEntrenador = idEntrenador;
        this.costo = costo;
        this.cantidadMeses = cantidadMeses;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
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
