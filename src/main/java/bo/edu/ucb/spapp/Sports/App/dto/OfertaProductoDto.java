package bo.edu.ucb.spapp.Sports.App.dto;

public class OfertaProductoDto {
    private int idOfertaProducto;
    private int idOfertas;
    private int idProducto;
    private int idTienda;
    private double precio_oferta;

    public OfertaProductoDto() {
    }

    public OfertaProductoDto(int idOfertaProducto, int idOfertas, int idProducto, int idTienda, double precio_oferta) {
        this.idOfertaProducto = idOfertaProducto;
        this.idOfertas = idOfertas;
        this.idProducto = idProducto;
        this.idTienda = idTienda;
        this.precio_oferta = precio_oferta;
    }

    public int getIdOfertaProducto() {
        return idOfertaProducto;
    }

    public void setIdOfertaProducto(int idOfertaProducto) {
        this.idOfertaProducto = idOfertaProducto;
    }

    public int getIdOfertas() {
        return idOfertas;
    }

    public void setIdOfertas(int idOfertas) {
        this.idOfertas = idOfertas;
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

    public double getPrecio_oferta() {
        return precio_oferta;
    }

    public void setPrecio_oferta(double precio_oferta) {
        this.precio_oferta = precio_oferta;
    }

    //toString
    @Override
    public String toString() {
        return "OfertaProductoDto{" +
                "idOfertaProducto=" + idOfertaProducto +
                ", idOfertas=" + idOfertas +
                ", idProducto=" + idProducto +
                ", idTienda=" + idTienda +
                ", precio_oferta=" + precio_oferta +
                '}';
    }
}
