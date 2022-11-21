
package bo.edu.ucb.spapp.Sports.App.entity;

public class SpEntrenador {
    private int idEntrenador;
    private int idCuenta;
    private String nit;
    private String correo;
    private String foto;
    private boolean estado;

    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpEntrenador() {
    }

    public SpEntrenador(int idEntrenador, int idCuenta, String nit, String correo, String foto, boolean estado, String tx_correo, String tx_fecha, String tx_host) {
        this.idEntrenador = idEntrenador;
        this.idCuenta = idCuenta;
        this.nit = nit;
        this.correo = correo;
        this.foto = foto;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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

    @Override
    public String toString() {
        return "SpEntrenador{" +
                "idEntrenador=" + idEntrenador +
                ", idCuenta=" + idCuenta +
                ", nit='" + nit + '\'' +
                ", correo='" + correo + '\'' +
                ", foto='" + foto + '\'' +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha='" + tx_fecha + '\'' +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }
}
