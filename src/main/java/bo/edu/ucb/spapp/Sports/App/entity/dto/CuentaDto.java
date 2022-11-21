package bo.edu.ucb.spapp.Sports.App.entity.dto;
// Creamos una clase DTO para los datos que queremos retornar al cliente via API.
public class CuentaDto {
    private Integer idCuenta;
    private Integer idPersona;
    private Integer idDeporte;
    private String correo;
    // Constructor vacio.
    public CuentaDto() {
    }

    public CuentaDto(Integer idCuenta, Integer idPersona, Integer idDeporte, String correo) {
        this.idCuenta = idCuenta;
        this.idPersona = idPersona;
        this.idDeporte = idDeporte;
        this.correo = correo;
    }

    // Constructor con todos los parametros.
    // Metodos Getters y Setters.

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


    // Metodo toString para mostrar los datos de la clase.


    @Override
    public String toString() {
        return "CuentaDto{" +
                "idCuenta=" + idCuenta +
                ", idPersona=" + idPersona +
                ", idDeporte=" + idDeporte +
                ", correo='" + correo + '\'' +
                '}';
    }
}
