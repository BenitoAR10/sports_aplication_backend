package bo.edu.ucb.spapp.Sports.App.dto;
// Creamos una clase DTO para los datos que queremos retornar al cliente via API.
public class CuentaDto {
    private Integer idCuenta;
    private Integer idPersona;
    private Integer ipDerpote;
    private String correo;
    // Constructor vacio.
    public CuentaDto() {
    }
    // Constructor con todos los parametros.
    public CuentaDto(Integer idCuenta, Integer idPersona, Integer ipDerpote, String correo) {
        this.idCuenta = idCuenta;
        this.idPersona = idPersona;
        this.ipDerpote = ipDerpote;
        this.correo = correo;
    }
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

    public Integer getIpDerpote() {
        return ipDerpote;
    }

    public void setIpDerpote(Integer ipDerpote) {
        this.ipDerpote = ipDerpote;
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
                ", ipDerpote=" + ipDerpote +
                ", correo='" + correo + '\'' +
                '}';
    }
}
