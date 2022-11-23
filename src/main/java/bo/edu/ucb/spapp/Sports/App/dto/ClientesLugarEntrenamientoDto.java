package bo.edu.ucb.spapp.Sports.App.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class ClientesLugarEntrenamientoDto {
    private Integer idCuenta;
    private String nombres;
    private String apellidos;
    private Integer duracion;
    private Date fechaCompra;
    private Date fechaFin;
    private Double costo;

    public ClientesLugarEntrenamientoDto(Integer idCuenta, String nombres, String apellidos, Integer duracion, Date fechaCompra, Date fechaFin, Double costo) {
        this.idCuenta = idCuenta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.duracion = duracion;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
        this.costo = costo;
    }

    public ClientesLugarEntrenamientoDto() {
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "ClientesLugarEntrenamientoDto{" +
                "idCuenta=" + idCuenta +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", duracion=" + duracion +
                ", fechaCompra=" + fechaCompra +
                ", fechaFin=" + fechaFin +
                ", costo=" + costo +
                '}';
    }
}
