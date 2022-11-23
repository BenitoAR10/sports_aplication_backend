package bo.edu.ucb.spapp.Sports.App.entity;

import java.util.Date;

public class SpOfertas {
    private int idOfertas;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpOfertas() {
    }

    public SpOfertas(int idOfertas, String descripcion, Date fechaInicio, Date fechaFin, String estado, String tx_correo, String tx_fecha, String tx_host) {
        this.idOfertas = idOfertas;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public int getIdOfertas() {
        return idOfertas;
    }

    public void setIdOfertas(int idOfertas) {
        this.idOfertas = idOfertas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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

    public String getTx_fecha() {
        return tx_fecha;
    }

    public void setTx_fecha(String tx_fecha) {
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
        return "SpOfertas{" + "idOfertas=" + idOfertas + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado=" + estado + ", tx_correo=" + tx_correo + ", tx_fecha=" + tx_fecha + ", tx_host=" + tx_host + '}';
    }
}
