
package bo.edu.ucb.spapp.Sports.App.entity;
import java.sql.Date;

public class SpTipoPlanEntrenamiento {
    private int idTipoPlanEntrenamiento;
    private int idPlanComida;
    private int idPlanLugarEntrenamiento;
    private int idPlanEntrenador;
    private int duracion;
    private boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpTipoPlanEntrenamiento() {
    }

    public int getIdTipoPlanEntrenamiento() {
        return idTipoPlanEntrenamiento;
    }

    public void setIdTipoPlanEntrenamiento(int idTipoPlanEntrenamiento) {
        this.idTipoPlanEntrenamiento = idTipoPlanEntrenamiento;
    }

    public int getIdPlanComida() {
        return idPlanComida;
    }

    public void setIdPlanComida(int idPlanComida) {
        this.idPlanComida = idPlanComida;
    }

    public int getIdPlanLugarEntrenamiento() {
        return idPlanLugarEntrenamiento;
    }

    public void setIdPlanLugarEntrenamiento(int idPlanLugarEntrenamiento) {
        this.idPlanLugarEntrenamiento = idPlanLugarEntrenamiento;
    }

    public int getIdPlanEntrenador() {
        return idPlanEntrenador;
    }

    public void setIdPlanEntrenador(int idPlanEntrenador) {
        this.idPlanEntrenador = idPlanEntrenador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
