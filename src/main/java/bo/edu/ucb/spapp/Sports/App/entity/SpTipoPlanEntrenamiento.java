
package bo.edu.ucb.spapp.Sports.App.entity;
import java.sql.Date;

public class SpTipoPlanEntrenamiento {
    private int idTipoPlanEntrenamiento;
    private int idPlanComida;
    private int idPlanLugarEntrenamiento;
    private int idPlanEntrenador;
    private int duracion;
    private boolean estado;
    private String tipoPlan;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpTipoPlanEntrenamiento() {
    }

    public SpTipoPlanEntrenamiento(int idTipoPlanEntrenamiento, int idPlanComida, int idPlanLugarEntrenamiento, int idPlanEntrenador, int duracion, boolean estado, String tipoPlan, String txCorreo, Date txFecha, String txHost) {
        this.idTipoPlanEntrenamiento = idTipoPlanEntrenamiento;
        this.idPlanComida = idPlanComida;
        this.idPlanLugarEntrenamiento = idPlanLugarEntrenamiento;
        this.idPlanEntrenador = idPlanEntrenador;
        this.duracion = duracion;
        this.estado = estado;
        this.tipoPlan = tipoPlan;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
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

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
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
