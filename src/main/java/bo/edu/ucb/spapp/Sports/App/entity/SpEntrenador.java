
package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;

// Clase entidad SpEntrenador que representa la tabla sp_entrenador de la base de datos
public class SpEntrenador {
    private int idEntrenador;
    private int idCuenta;
    private String nit;
    private String correo;
    private String fotoEntrenador;
    private boolean estado;
    private String txCorreo;
    private Date txFecha;
    private String txHost;


    // Contructor sin parametros
    public SpEntrenador() {
    }
    // Contructor con parametros
    public SpEntrenador(int idEntrenador, int idCuenta, String nit, String correo, String fotoEntrenador, boolean estado, String txCorreo, Date txFecha, String txHost) {
        this.idEntrenador = idEntrenador;
        this.idCuenta = idCuenta;
        this.nit = nit;
        this.correo = correo;
        this.fotoEntrenador = fotoEntrenador;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txFecha = txFecha;
        this.txHost = txHost;
    }
    // Metodos get y set de todos los atributos de la clase.
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

    public String getFotoEntrenador() {
        return fotoEntrenador;
    }

    public void setFotoEntrenador(String fotoEntrenador) {
        this.fotoEntrenador = fotoEntrenador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTxCorreo() {
        return txCorreo;
    }

    public void setTxCorreo(String txCorreo) {
        this.txCorreo = txCorreo;
    }

    public Date getTxFecha() {
        return txFecha;
    }

    public void setTxFecha(Date txFecha) {
        this.txFecha = txFecha;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }
}
