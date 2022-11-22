package bo.edu.ucb.spapp.Sports.App.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class PlanesEntrenamientoDto {

    private Integer idLugarEntrenamientoSucursal;
    private BigDecimal costo;
    private Integer cantidadMeses;
    private Boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public PlanesEntrenamientoDto() {
    }

    public PlanesEntrenamientoDto(Integer idLugarEntrenamientoSucursal, BigDecimal costo, Integer cantidadMeses, Boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.costo = costo;
        this.cantidadMeses = cantidadMeses;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public Integer getIdLugarEntrenamientoSucursal() {
        return idLugarEntrenamientoSucursal;
    }

    public void setIdLugarEntrenamientoSucursal(Integer idLugarEntrenamientoSucursal) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public Integer getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(Integer cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
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
