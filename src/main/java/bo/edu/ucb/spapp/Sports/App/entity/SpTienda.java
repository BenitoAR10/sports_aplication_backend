
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpTienda {


    private Integer idTienda;
    private Integer idCuenta;
    private String nombreTienda;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String fotoTienda;
<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
    private String correo;
    private String telefono;
    private String nit;
    private String direccion;

<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
    private double latitud;
    private double longitud;
    private Boolean estado;

<<<<<<< HEAD
=======




>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

<<<<<<< HEAD
 // Crear constructor vacio
    public SpTienda() {
    }
=======


    public SpTienda() {
    }


>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f

    // Crear constructor con todos los atributos

    public SpTienda(Integer idTienda, Integer idCuenta, String nombreTienda, String nombrePropietario, String apellidoPropietario, String fotoTienda, String correo, String telefono, String nit, String direccion, Double latitud, Double longitud, Boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
        this.idTienda = idTienda;
        this.idCuenta = idCuenta;
        this.nombreTienda = nombreTienda;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.fotoTienda = fotoTienda;
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

<<<<<<< HEAD
=======

    // Crear getters y setters


>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
    public Integer getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(Integer idTienda) {
        this.idTienda = idTienda;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
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

    public String getFotoTienda() {
        return fotoTienda;
    }

    public void setFotoTienda(String fotoTienda) {
        this.fotoTienda = fotoTienda;
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
<<<<<<< HEAD
=======






>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
        this.estado = estado;
    }

    public String getTx_correo() {
        return tx_correo;
    }
<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f

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

<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
    // Crear toString

    @Override
    public String toString() {
        return "SpTienda{" +
                "idTienda=" + idTienda +
                ", idCuenta=" + idCuenta +
                ", nombreTienda='" + nombreTienda + '\'' +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidoPropietario='" + apellidoPropietario + '\'' +
                ", fotoTienda='" + fotoTienda + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha=" + tx_fecha +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }
}
<<<<<<< HEAD
=======

>>>>>>> e3bb72bbde93653b787131aee73fb52d34fcd49f
