
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpLugarEntrenamiento {
    private Integer idLugarEntrenamiento;
    private String nombre;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String correo;
    private String nit;
    private String logo;
    private boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpLugarEntrenamiento() {
    }
    public SpLugarEntrenamiento(Integer idLugarEntrenamiento, String nombre, String nombrePropietario, String apellidoPropietario, String correo, String nit, String logo, Boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idLugarEntrenamiento = idLugarEntrenamiento;
        this.nombre = nombre;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.correo = correo;
        this.nit = nit;
        this.logo = logo;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public Integer getIdLugarEntrenamiento() {
        return idLugarEntrenamiento;
    }

    public void setIdLugarEntrenamiento(Integer idLugarEntrenamiento) {
        this.idLugarEntrenamiento = idLugarEntrenamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getEstado() {
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

    @Override
    public String toString() {
        return "SpLugarEntrenamiento{" +
                "idLugarEntrenamiento=" + idLugarEntrenamiento +
                ", nombre='" + nombre + '\'' +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidoPropietario='" + apellidoPropietario + '\'' +
                ", correo='" + correo + '\'' +
                ", nit='" + nit + '\'' +
                ", logo='" + logo + '\'' +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha=" + tx_fecha +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }

}
