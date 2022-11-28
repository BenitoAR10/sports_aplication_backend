package bo.edu.ucb.spapp.Sports.App.entity;

public class EtyClientesServicioComida {
    private int idCuenta;
    private String nombres;
    private String apellidos;
    private double costoMes;
    private String fechaCompra;
    private String fechaFin;
    private String nombrePlan;
    private String detalleComida;
    private String estado;


    public EtyClientesServicioComida() {
    }

    public EtyClientesServicioComida(int idCuenta, String nombres, String apellidos, double costoMes, String fechaCompra, String fechaFin, String nombrePlan, String detalleComida, String estado) {
        this.idCuenta = idCuenta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.costoMes = costoMes;
        this.fechaCompra = fechaCompra;
        this.fechaFin = fechaFin;
        this.nombrePlan = nombrePlan;
        this.detalleComida = detalleComida;
        this.estado = estado;
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

    public double getCostoMes() {
        return costoMes;
    }

    public void setCostoMes(double costoMes) {
        this.costoMes = costoMes;
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

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getDetalleComida() {
        return detalleComida;
    }

    public void setDetalleComida(String detalleComida) {
        this.detalleComida = detalleComida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
