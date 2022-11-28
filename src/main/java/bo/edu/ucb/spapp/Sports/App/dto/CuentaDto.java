package bo.edu.ucb.spapp.Sports.App.dto;
// Creamos una clase DTO para los datos que queremos retornar al cliente via API.
public class CuentaDto {
    private Integer idCuenta;
    private Integer idDeporte;

    private String nombres;
    private String apellidos;
    private String correo;


    // Constructor vacio.
    public CuentaDto(Integer idCuenta, Integer idDeporte, String correo) {
    }

    public CuentaDto(Integer idCuenta, Integer idDeporte, String nombres, String apellidos, String correo) {
        this.idCuenta = idCuenta;
        this.idDeporte = idDeporte;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "CuentaDto{" +
                "idCuenta=" + idCuenta +
                ", idDeporte=" + idDeporte +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
