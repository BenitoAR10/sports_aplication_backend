package bo.edu.ucb.spapp.Sports.App.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class EtyHistorialEntrenador {
    private String nombres;
    private String apellidos;
    private int cantidadMeses;
    private BigDecimal costo;
    private Date fechaCompra;
    private Date fechaFin;


    public EtyHistorialEntrenador() {
    }

    public EtyHistorialEntrenador(String nombres, String apellidos, int cantidadMeses, BigDecimal costo, Date fechaCompra, Date fechaFin) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cantidadMeses = cantidadMeses;
        this.costo = costo;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
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

    public int getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(int cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
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

    @Override
    public String toString() {
        return "EtyHistorialEntrenador{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", cantidadMeses=" + cantidadMeses +
                ", costo=" + costo +
                ", fechaCompra=" + fechaCompra +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
