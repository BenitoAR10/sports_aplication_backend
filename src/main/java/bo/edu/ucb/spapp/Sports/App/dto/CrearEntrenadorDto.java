package bo.edu.ucb.spapp.Sports.App.dto;
// CLase dto CrearEntradorDto que representa los datos que se enviaran al API para crear un entrenador
public class CrearEntrenadorDto {
    private Integer idCuenta;
    private String fotoEntrenador;
    private String nit;
    private String correo;

    public CrearEntrenadorDto() {
    }

    public CrearEntrenadorDto(Integer idCuenta, String fotoEntrenador, String nit, String correo) {
        this.idCuenta = idCuenta;
        this.fotoEntrenador = fotoEntrenador;
        this.nit = nit;
        this.correo = correo;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getFotoEntrenador() {
        return fotoEntrenador;
    }

    public void setFotoEntrenador(String fotoEntrenador) {
        this.fotoEntrenador = fotoEntrenador;
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

    @Override
    public String toString() {
        return "CrearEntrenadorDto{" +
                "idCuenta='" + idCuenta + '\'' +
                ", fotoEntrenador='" + fotoEntrenador + '\'' +
                ", nit='" + nit + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
