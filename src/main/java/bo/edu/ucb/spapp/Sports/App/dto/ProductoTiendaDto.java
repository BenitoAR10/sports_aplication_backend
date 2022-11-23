package bo.edu.ucb.spapp.Sports.App.dto;

public class ProductoTiendaDto {
    private int idTiendaProducto;
    private int idProducto;
    private int idTienda;
    private double precio;
    private Boolean estado;

    public ProductoTiendaDto() {
    }

    public ProductoTiendaDto(int idTiendaProducto, int idProducto, int idTienda, double precio, Boolean estado) {
        this.idTiendaProducto = idTiendaProducto;
        this.idProducto = idProducto;
        this.idTienda = idTienda;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdTiendaProducto() {
        return idTiendaProducto;
    }

    public void setIdTiendaProducto(int idTiendaProducto) {
        this.idTiendaProducto = idTiendaProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    //toString
    @Override
    public String toString() {
        return "ProductoTiendaDto{" + "idTiendaProducto=" + idTiendaProducto + ", idProducto=" + idProducto + ", idTienda=" + idTienda + ", precio=" + precio + ", estado=" + estado + '}';
    }
}
