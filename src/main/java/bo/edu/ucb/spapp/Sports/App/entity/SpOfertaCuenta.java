package bo.edu.ucb.spapp.Sports.App.entity;

public class SpOfertaCuenta {
    private int idOfertaCuenta;
    private int idCuenta;
    private int idOfertaProducto;
    private Boolean estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpOfertaCuenta() {
    }

    public SpOfertaCuenta(int idOfertaCuenta, int idCuenta, int idOfertaProducto, Boolean estado, String tx_correo, String tx_fecha, String tx_host) {
        this.idOfertaCuenta = idOfertaCuenta;
        this.idCuenta = idCuenta;
        this.idOfertaProducto = idOfertaProducto;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public int getIdOfertaCuenta() {
        return idOfertaCuenta;
    }

    public void setIdOfertaCuenta(int idOfertaCuenta) {
        this.idOfertaCuenta = idOfertaCuenta;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getIdOfertaProducto() {
        return idOfertaProducto;
    }

    public void setIdOfertaProducto(int idOfertaProducto) {
        this.idOfertaProducto = idOfertaProducto;
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
        return "SpOfertaCuenta{" +
                "idOfertaCuenta=" + idOfertaCuenta +
                ", idCuenta=" + idCuenta +
                ", idOfertaProducto=" + idOfertaProducto +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha='" + tx_fecha + '\'' +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }

}
