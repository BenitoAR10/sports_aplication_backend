package bo.edu.ucb.spapp.Sports.App.entity;

import java.util.Date;
import java.util.Objects;

public class SpCuenta {
    private Integer idCuenta;
    private Integer idPersona;
    private Integer ipDerpote;
    private String correo;
    private String secret;
    private Boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpCuenta() {
    }

    public SpCuenta(Integer idCuenta, Integer idPersona, Integer ipDerpote, String correo, String secret, Boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idCuenta = idCuenta;
        this.idPersona = idPersona;
        this.ipDerpote = ipDerpote;
        this.correo = correo;
        this.secret = secret;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIpDerpote() {
        return ipDerpote;
    }

    public void setIpDerpote(Integer ipDerpote) {
        this.ipDerpote = ipDerpote;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
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

    public Date getTx_fecha() {
        return tx_fecha;
    }

    public void setTx_fecha(Date tx_fecha) {
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
        return "SpCuenta{" +
                "idCuenta=" + idCuenta +
                ", idPersona=" + idPersona +
                ", ipDerpote=" + ipDerpote +
                ", correo='" + correo + '\'' +
                ", secret='" + secret + '\'' +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha=" + tx_fecha +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpCuenta spCuenta = (SpCuenta) o;
        return idCuenta.equals(spCuenta.idCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCuenta);
    }
}
