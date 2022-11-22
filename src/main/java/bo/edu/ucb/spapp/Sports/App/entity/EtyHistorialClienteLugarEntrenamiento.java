package bo.edu.ucb.spapp.Sports.App.entity;

import java.math.BigDecimal;

public class EtyHistorialClienteLugarEntrenamiento {
//select c.nombres, c.apellidos, t.cantidad_meses, t.costo, cp.fecha_compra, cp.fecha_fin
    String nombres;
    String apellidos;
    Integer cantidadMeses;
    BigDecimal costo;
    String fechaCompra;
    String fechaFin;
    Boolean estado;

    public EtyHistorialClienteLugarEntrenamiento(String nombres, String apellidos, Integer cantidadMeses, BigDecimal costo, String fechaCompra, String fechaFin, Boolean estado) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cantidadMeses = cantidadMeses;
        this.costo = costo;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
        this.estado = estado;
    }



    public EtyHistorialClienteLugarEntrenamiento() {
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

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
