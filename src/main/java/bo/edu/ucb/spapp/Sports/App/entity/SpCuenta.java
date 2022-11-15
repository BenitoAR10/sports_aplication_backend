package bo.edu.ucb.spapp.Sports.App.entity;

import java.util.Date;
import java.util.Objects;
// Creamos la clase SpCuenta con sus atributos, constructor y metodos get y set
public class SpCuenta {
    private Integer idCuenta;
    private Integer idPersona;
    private Integer ipDeporte;
    private String correo;
    private String secret;
    private Boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;
    // Constructor vacio de la clase.
    public SpCuenta() {
    }
    // Constructor con parametros de la clase.
    public SpCuenta(Integer idCuenta, Integer idPersona, Integer ipDeporte, String correo, String secret, Boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idCuenta = idCuenta;
        this.idPersona = idPersona;
        this.ipDeporte = ipDeporte;
        this.correo = correo;
        this.secret = secret;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
    }
    // Metodos get y ser para cada atributo de la clase.
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

    public Integer getIpDeporte() {
        return ipDeporte;
    }

    public void setIpDeporte(Integer ipDeporte) {
        this.ipDeporte = ipDeporte;
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
    // Metodo toString para mostrar los datos de la clase.
    @Override
    public String toString() {
        return "SpCuenta{" +
                "idCuenta=" + idCuenta +
                ", idPersona=" + idPersona +
                ", ipDeporte=" + ipDeporte +
                ", correo='" + correo + '\'' +
                ", secret='" + secret + '\'' +
                ", estado=" + estado +
                ", tx_correo='" + tx_correo + '\'' +
                ", tx_fecha=" + tx_fecha +
                ", tx_host='" + tx_host + '\'' +
                '}';
    }
    // Metodo equals para comparar los datos de la clase.
    // En este caso solo comparamos el idCuenta.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpCuenta spCuenta = (SpCuenta) o;
        return idCuenta.equals(spCuenta.idCuenta);
    }
    // Metodo hashCode para comparar el idCuenta.
    @Override
    public int hashCode() {
        return Objects.hash(idCuenta);
    }
} // Fin de la clase SpCuenta.
