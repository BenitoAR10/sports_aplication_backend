package bo.edu.ucb.spapp.Sports.App.entity;

public class SpOfertaProducto {
    private int idOfertaProducto;
    private int idOfertas;
    private int idProducto;
    private int idTienda;
    private double precioOferta;
    private Boolean estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpOfertaProducto() {
    }

    public SpOfertaProducto(int idOfertaProducto, int idOfertas, int idProducto, int idTienda, double precioOferta, Boolean estado, String tx_correo, String tx_fecha, String tx_host) {
        this.idOfertaProducto = idOfertaProducto;
        this.idOfertas = idOfertas;
        this.idProducto = idProducto;
        this.idTienda = idTienda;
        this.precioOferta = precioOferta;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
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
        return "SpOfertaProducto{" + "idOfertaProducto=" + idOfertaProducto + ", idOfertas=" + idOfertas + ", idProducto=" + idProducto + ", idTienda=" + idTienda + ", precioOferta=" + precioOferta + ", estado=" + estado + ", tx_correo=" + tx_correo + ", tx_fecha=" + tx_fecha + ", tx_host=" + tx_host + '}';
    }
}
