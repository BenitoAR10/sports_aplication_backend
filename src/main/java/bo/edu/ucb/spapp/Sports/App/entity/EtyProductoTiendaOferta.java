package bo.edu.ucb.spapp.Sports.App.entity;

public class EtyProductoTiendaOferta {
    private int idProducto;
    private int idTienda;
    private int idOfertas;
    private String marca;
    private double precio;
    private double precioOferta;
    private Boolean estado;

    public EtyProductoTiendaOferta() {
    }

public EtyProductoTiendaOferta(int idProducto, int idTienda, int idOfertas, String marca, double precio, double precioOferta, Boolean estado) {
        this.idProducto = idProducto;
        this.idTienda = idTienda;
        this.idOfertas = idOfertas;
        this.marca = marca;
        this.precio = precio;
        this.precioOferta = precioOferta;
        this.estado = estado;
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

    public int getIdOfertas() {
        return idOfertas;
    }

    public void setIdOfertas(int idOfertas) {
        this.idOfertas = idOfertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
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
        return "EtyProductoTiendaOferta{" + "idProducto=" + idProducto + ", idTienda=" + idTienda + ", idOfertas=" + idOfertas + ", marca=" + marca + ", precio=" + precio + ", precioOferta=" + precioOferta + ", estado=" + estado + '}';
    }


}
