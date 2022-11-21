package bo.edu.ucb.spapp.Sports.App.entity.dto;

public class CrearCuentaDto {
    private Integer idPersona;
    private Integer idDeporte;
    private String correo;
    private String contrasenia;


    public CrearCuentaDto() {
    }

    public CrearCuentaDto(Integer idPersona, Integer idDeporte, String correo, String contrasenia) {
        this.idPersona = idPersona;
        this.idDeporte = idDeporte;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
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

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "CrearCuentaDto{" +
                "idPersona=" + idPersona +
                ", idDeporte=" + idDeporte +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}
