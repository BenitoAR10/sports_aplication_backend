package bo.edu.ucb.spapp.Sports.App.entity;

import java.util.Date;

public class SpTienda {

    private int idTienda;
    private int idCuenta;
    private String nombreTienda;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String foto_tienda;
    private String correo;
    private String telefono;
    private String nit;
    private String direccion;
    private double latitud;
    private double longitud;
    private String estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    // Crear constructor vacio
    public SpTienda() {
    }

    // Crear constructor con todos los atributos

    public SpTienda(int idTienda, int idCuenta, String nombreTienda, String nombrePropietario, String apellidoPropietario, String foto_tienda, String correo, String telefono, String nit, String direccion, double latitud, double longitud, String estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idTienda = idTienda;
        this.idCuenta = idCuenta;
        this.nombreTienda = nombreTienda;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.foto_tienda = foto_tienda;
        this.correo = correo;
        this.telefono = telefono;
        this.nit = nit;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    // Crear getters y setters

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
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

    public String getFoto_tienda() {
        return foto_tienda;
    }

    public void setFoto_tienda(String foto_tienda) {
        this.foto_tienda = foto_tienda;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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

    // Crear toString

    @Override
    public String toString() {
        return "SpTienda{" + "idTienda=" + idTienda + ", idCuenta=" + idCuenta + ", nombreTienda=" + nombreTienda + ", nombrePropietario=" + nombrePropietario + ", apellidoPropietario=" + apellidoPropietario + ", foto_tienda=" + foto_tienda + ", correo=" + correo + ", telefono=" + telefono + ", nit=" + nit + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud=" + longitud + ", estado=" + estado + ", tx_correo=" + tx_correo + ", tx_fecha=" + tx_fecha + ", tx_host=" + tx_host + '}';
    }

}
