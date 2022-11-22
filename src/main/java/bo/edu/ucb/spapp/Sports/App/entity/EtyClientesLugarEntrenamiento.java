package bo.edu.ucb.spapp.Sports.App.entity;

import java.math.BigDecimal;
import java.sql.Date;

public class EtyClientesLugarEntrenamiento {

    private int idCuenta;
    private String nombres;
    private String apellidos;
    private Integer cantidadMeses;
    private Date fechaCompra;
    private Date fechaFin;
    private BigDecimal costo;


    public EtyClientesLugarEntrenamiento() {
    }

    public EtyClientesLugarEntrenamiento(int idCuenta, String nombres, String apellidos, Integer cantidadMeses, Date fechaCompra, Date fechaFin, BigDecimal costo) {
        this.idCuenta = idCuenta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cantidadMeses = cantidadMeses;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
        this.costo = costo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
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

    public Integer getCantidadMeses() {
        return cantidadMeses;
    }

    public void setCantidadMeses(Integer cantidadMeses) {
        this.cantidadMeses = cantidadMeses;
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

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
}
