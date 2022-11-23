
package bo.edu.ucb.spapp.Sports.App.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class SpPlanComida {
    private int idPlanComida;
    private int idServicioComida;
    private String nombrePlan;
    private String descripcion;
    private BigDecimal costoMes;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpPlanComida() {
    }

    public SpPlanComida(int idPlanComida, int idServicioComida, String nombrePlan, String descripcion, BigDecimal costoMes, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idPlanComida = idPlanComida;
        this.idServicioComida = idServicioComida;
        this.nombrePlan = nombrePlan;
        this.descripcion = descripcion;
        this.costoMes = costoMes;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public int getIdPlanComida() {
        return idPlanComida;
    }

    public void setIdPlanComida(int idPlanComida) {
        this.idPlanComida = idPlanComida;
    }

    public int getIdServicioComida() {
        return idServicioComida;
    }

    public void setIdServicioComida(int idServicioComida) {
        this.idServicioComida = idServicioComida;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getCostoMes() {
        return costoMes;
    }

    public void setCostoMes(BigDecimal costoMes) {
        this.costoMes = costoMes;
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
