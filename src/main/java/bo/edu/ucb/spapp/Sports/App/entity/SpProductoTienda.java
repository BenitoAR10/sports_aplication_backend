package bo.edu.ucb.spapp.Sports.App.entity;

public class SpProductoTienda {
    private int idTiendaProducto;
    private int idProducto;
    private int idTienda;
    private double precio;
    private Boolean estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpProductoTienda() {
    }

    public SpProductoTienda(int idTiendaProducto, int idProducto, int idTienda, double precio, Boolean estado, String tx_correo, String tx_fecha, String tx_host) {
        this.idTiendaProducto = idTiendaProducto;
        this.idProducto = idProducto;
        this.idTienda = idTienda;
        this.precio = precio;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
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

    //toString
    @Override
    public String toString() {
        return "SpProductoTienda{" +
                "idTiendaProducto=" + idTiendaProducto +
                ", idProducto=" + idProducto +
                ", idTienda=" + idTienda +
                ", precio=" + precio +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha='" + tx_fecha + '\'' +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }
}
