package bo.edu.ucb.spapp.Sports.App.entity;

import java.sql.Date;
import java.util.Objects;

public class SpCuenta{
    private Integer idCuenta;
    private Integer idDeporte;
    private String correo;
    private String contrasenia;
    private String nombres;
    private String apellidos;
    private String numeroTelefono;
    private String genero;
    private String ciudad;
    private String fechaNacimiento;
    private String altura;
    private String peso;
    private String indiceMasaCorporal;
    private String foto;
    private Boolean estado;
    private String tx_correo;
    private Date tx_fecha;
    private String tx_host;

    public SpCuenta(){
    }

    public SpCuenta(Integer idCuenta, Integer idDeporte, String correo, String contrasenia, String nombres, String apellidos, String numeroTelefono, String genero, String ciudad, String fechaNacimiento, String altura, String peso, String indiceMasaCorporal, String foto, Boolean estado, String tx_correo, Date tx_fecha, String tx_host) {
        this.idCuenta = idCuenta;
        this.idDeporte = idDeporte;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroTelefono = numeroTelefono;
        this.genero = genero;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.indiceMasaCorporal = indiceMasaCorporal;
        this.foto = foto;
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

    public Integer getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasena(String contrasenia) {
        this.contrasenia = contrasenia;
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

    public void setIndiceMasaCorporal(String indiceMasaCorporal) {
        this.indiceMasaCorporal = indiceMasaCorporal;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
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
                ", idDeporte=" + idDeporte +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", genero='" + genero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                ", indiceMasaCorporal='" + indiceMasaCorporal + '\'' +
                ", foto='" + foto + '\'' +
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
        SpCuenta cuenta = (SpCuenta) o;
        return Objects.equals(idCuenta, cuenta.idCuenta) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCuenta);
    }
}