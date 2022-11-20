package bo.edu.ucb.spapp.Sports.App.dto;

import java.sql.Date;

public class CrearPersonaDto {
    private String nombres;
    private String apellidos;
    private Boolean genero;
    private String numeroTelefono;
    private String ciudad;
    private String catPersonaStatus;
    private Date fechaNacimiento;
    private Double altura;
    private Double peso;
    private Double indiceMasaCorporal;
    private String foto;

    public CrearPersonaDto() {
    }

    public CrearPersonaDto(String nombres, String apellidos, Boolean genero, String numeroTelefono, String ciudad, String catPersonaStatus, Date fechaNacimiento, Double altura, Double peso, Double indiceMasaCorporal, String foto) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.numeroTelefono = numeroTelefono;
        this.ciudad = ciudad;
        this.catPersonaStatus = catPersonaStatus;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.indiceMasaCorporal = indiceMasaCorporal;
        this.foto = foto;
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

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCatPersonaStatus() {
        return catPersonaStatus;
    }

    public void setCatPersonaStatus(String catPersonaStatus) {
        this.catPersonaStatus = catPersonaStatus;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public Double getIndiceMasaCorporal() {
        return indiceMasaCorporal;
    }

    public void setIndiceMasaCorporal(Double indiceMasaCorporal) {
        this.indiceMasaCorporal = indiceMasaCorporal;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "CrearPersonaDto{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", genero=" + genero +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", catPersonaStatus='" + catPersonaStatus + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", indiceMasaCorporal=" + indiceMasaCorporal +
                ", foto='" + foto + '\'' +
                '}';
    }
}
