<<<<<<< HEAD
package bo.edu.ucb.spapp.Sports.App.entity;public class SpLugarEntrenamientoSucursal {
=======
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

public class SpLugarEntrenamientoSucursal {
    private Integer idLugarEntrenamientoSucursal;
    private Integer idLugarEntrenamiento;
    private Integer idCuenta;
    private String nombreEncargado;
    private String apellidoEncargado;
    private String telefono;
    private String direccion;
    private double latitud;
    private double longitud;
    private boolean estadoSucursal;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpLugarEntrenamientoSucursal() {
    }

    public SpLugarEntrenamientoSucursal(Integer idLugarEntrenamientoSucursal, Integer idLugarEntrenamiento, Integer idCuenta, String nombreEncargado, String apellidoEncargado, String telefono, String direccion, double latitud, double longitud, boolean estadoSucursal, String tx_correo, Date tx_fecha, String tx_host) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.idLugarEntrenamiento = idLugarEntrenamiento;
        this.idCuenta = idCuenta;
        this.nombreEncargado = nombreEncargado;
        this.apellidoEncargado = apellidoEncargado;
        this.telefono = telefono;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estadoSucursal = estadoSucursal;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public boolean isEstadoSucursal() {
        return estadoSucursal;
    }

    public void setEstadoSucursal(boolean estadoSucursal) {
        this.estadoSucursal = estadoSucursal;
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
        return "SpLugarEntrenamientoSucursal{" +
                "idLugarEntrenamientoSucursal=" + idLugarEntrenamientoSucursal +
                ", idLugarEntrenamiento=" + idLugarEntrenamiento +
                ", idCuenta=" + idCuenta +
                ", nombreEncargado='" + nombreEncargado + '\'' +
                ", apellidoEncargado='" + apellidoEncargado + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", estadoSucursal=" + estadoSucursal +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha=" + tx_fecha +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
}
