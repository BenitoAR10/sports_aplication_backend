package bo.edu.ucb.spapp.Sports.App.entity;

public class EtyLugarEntrenador {
    private int idEntrenador;
    private int idCuenta;
    private String nombres;
    private String apellidos;
    private String fotoEntrenador;
    private String correo;
    private boolean estado;
    private String txCorreo;
    private String txHost;

    public EtyLugarEntrenador() {
    }

    public EtyLugarEntrenador(int idEntrenador, int idCuenta, String nombres, String apellidos, String fotoEntrenador, String correo, boolean estado, String txCorreo, String txHost) {
        this.idEntrenador = idEntrenador;
        this.idCuenta = idCuenta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fotoEntrenador = fotoEntrenador;
        this.correo = correo;
        this.estado = estado;
        this.txCorreo = txCorreo;
        this.txHost = txHost;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFotoEntrenador() {
        return fotoEntrenador;
    }

    public void setFotoEntrenador(String fotoEntrenador) {
        this.fotoEntrenador = fotoEntrenador;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }
}
