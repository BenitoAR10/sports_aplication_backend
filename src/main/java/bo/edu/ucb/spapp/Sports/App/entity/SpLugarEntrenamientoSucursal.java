
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpLugarEntrenamientoSucursal {
    private Integer idLugarEntrenamientoSucursal;
    private Integer idLugarEntrenamiento;
    private Integer idCuenta;
    private String nombreEncargado;
    private String apellidoEncargado;
    private String telefonoSucursal;
    private String direccion;
    private double latitud;
    private double longitud;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpLugarEntrenamientoSucursal() {
    }

    public SpLugarEntrenamientoSucursal(Integer idLugarEntrenamientoSucursal, Integer idLugarEntrenamiento, Integer idCuenta, String nombreEncargado, String apellidoEncargado, String telefonoSucursal, String direccion, double latitud, double longitud, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.idLugarEntrenamiento = idLugarEntrenamiento;
        this.idCuenta = idCuenta;
        this.nombreEncargado = nombreEncargado;
        this.apellidoEncargado = apellidoEncargado;
        this.telefonoSucursal = telefonoSucursal;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public Integer getIdLugarEntrenamiento() {
        return idLugarEntrenamiento;
    }

    public void setIdLugarEntrenamiento(Integer idLugarEntrenamiento) {
        this.idLugarEntrenamiento = idLugarEntrenamiento;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getApellidoEncargado() {
        return apellidoEncargado;
    }

    public void setApellidoEncargado(String apellidoEncargado) {
        this.apellidoEncargado = apellidoEncargado;
    }

    public String getTelefonoSucursal() {
        return telefonoSucursal;
    }

    public void setTelefonoSucursal(String telefonoSucursal) {
        this.telefonoSucursal = telefonoSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
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
