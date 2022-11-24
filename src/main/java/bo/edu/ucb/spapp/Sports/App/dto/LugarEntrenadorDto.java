package bo.edu.ucb.spapp.Sports.App.dto;

public class LugarEntrenadorDto {
    private int idCuenta;
    private String nombres;
    private String apellidos;
    private String fotoEntrenador;
    private String correo;

    public LugarEntrenadorDto() {
    }

    public LugarEntrenadorDto(int idCuenta, String nombres, String apellidos, String fotoEntrenador, String correo) {
        this.idCuenta = idCuenta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fotoEntrenador = fotoEntrenador;
        this.correo = correo;
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
}
