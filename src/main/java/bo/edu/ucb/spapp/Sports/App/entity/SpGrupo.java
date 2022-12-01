package bo.edu.ucb.spapp.Sports.App.entity;

public class SpGrupo {

    private String grupo;
    private String descripcion;
    private Boolean estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;

    public SpGrupo(String grupo, String descripcion, Boolean estado, String tx_correo, String tx_fecha, String tx_host) {
        this.grupo = grupo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }



    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @Override
    public String toString() {
        return "SpGrupo{" +
                "grupo='" + grupo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha='" + tx_fecha + '\'' +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }
}
