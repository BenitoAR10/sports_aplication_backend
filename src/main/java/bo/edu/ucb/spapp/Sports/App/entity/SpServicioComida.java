package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpServicioComida {
    private int idServicioComida;
    private int idCuenta;
    private String nombreLugar;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String telefono;
    private String correo;
    private String nit;
    private String logo;
    private String direccion;
    private double latitud;
    private double longitud;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;

    public SpServicioComida() {
    }

    public SpServicioComida(int idServicioComida, int idCuenta, String nombreLugar, String nombrePropietario, String apellidoPropietario, String telefono, String correo, String nit, String logo, String direccion, double latitud, double longitud, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idServicioComida = idServicioComida;
        this.idCuenta = idCuenta;
        this.nombreLugar = nombreLugar;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.telefono = telefono;
        this.correo = correo;
        this.nit = nit;
        this.logo = logo;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }

    public int getIdServicioComida() {
        return idServicioComida;
    }

    public void setIdServicioComida(int idServicioComida) {
        this.idServicioComida = idServicioComida;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    @Override
    public String toString() {
        return "SpServicioComida{" +
                "idServicioComida=" + idServicioComida +
                ", idCuenta=" + idCuenta +
                ", nombreLugar='" + nombreLugar + '\'' +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidoPropietario='" + apellidoPropietario + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", nit='" + nit + '\'' +
                ", logo='" + logo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", estado=" + estado +
                ", txCorreo='" + txCorreo + '\'' +
                ", txFecha=" + txFecha +
                ", txHost='" + txHost + '\'' +
                '}';
    }
}
