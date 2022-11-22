package bo.edu.ucb.spapp.Sports.App.entity;

public class SpProductoCuenta {
    private int idProductoCuenta;
    private int idTiendaProducto;
    private int idCuenta;
    private Boolean estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpProductoCuenta() {
    }

    public SpProductoCuenta(int idProductoCuenta, int idTiendaProducto, int idCuenta, Boolean estado, String tx_correo, String tx_fecha, String tx_host) {
        this.idProductoCuenta = idProductoCuenta;
        this.idTiendaProducto = idTiendaProducto;
        this.idCuenta = idCuenta;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public int getIdProductoCuenta() {
        return idProductoCuenta;
    }

    public void setIdProductoCuenta(int idProductoCuenta) {
        this.idProductoCuenta = idProductoCuenta;
    }

    public int getIdTiendaProducto() {
        return idTiendaProducto;
    }

    public void setIdTiendaProducto(int idTiendaProducto) {
        this.idTiendaProducto = idTiendaProducto;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
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
        return "SpProductoCuenta{" +
                "idProductoCuenta=" + idProductoCuenta +
                ", idTiendaProducto=" + idTiendaProducto +
                ", idCuenta=" + idCuenta +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha='" + tx_fecha + '\'' +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }

}
