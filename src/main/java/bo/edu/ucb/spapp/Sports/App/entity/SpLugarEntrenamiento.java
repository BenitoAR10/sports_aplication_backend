package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpLugarEntrenamiento {
    private Integer idLugarEntrenamiento;
    private String nombreLugar;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String correo;
    private String nit;
    private String logoLugar;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpLugarEntrenamiento() {
    }

    public SpLugarEntrenamiento(Integer idLugarEntrenamiento, String nombreLugar, String nombrePropietario, String apellidoPropietario, String correo, String nit, String logoLugar, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idLugarEntrenamiento = idLugarEntrenamiento;
        this.nombreLugar = nombreLugar;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.correo = correo;
        this.nit = nit;
        this.logoLugar = logoLugar;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public Integer getIdLugarEntrenamiento() {
        return idLugarEntrenamiento;
    }

    public void setIdLugarEntrenamiento(Integer idLugarEntrenamiento) {
        this.idLugarEntrenamiento = idLugarEntrenamiento;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getLogoLugar() {
        return logoLugar;
    }

    public void setLogoLugar(String logoLugar) {
        this.logoLugar = logoLugar;
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
