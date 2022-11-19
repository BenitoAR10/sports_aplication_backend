package bo.edu.ucb.spapp.Sports.App.dto;

import java.util.Date;

public class CrearCuentaDto {

    private String nombres;
    private String apellidos;
    private String numero_telefono;
    private String correo;
    private String contrasenia;
    private Boolean genero;
    private Date fecha_nacimiento;
    private Double altura;
    private Double peso;
    private String deporte;

    public CrearCuentaDto() {
    }

    public CrearCuentaDto(String nombres, String apellidos, String numero_telefono, String correo, String contrasenia, Boolean genero, Date fecha_nacimiento, Double altura, Double peso, String deporte) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numero_telefono = numero_telefono;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.altura = altura;
        this.peso = peso;
        this.deporte = deporte;
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

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
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

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
