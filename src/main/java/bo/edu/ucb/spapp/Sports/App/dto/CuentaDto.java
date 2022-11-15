package bo.edu.ucb.spapp.Sports.App.dto;

public class CuentaDto {
    private Integer idCuenta;
    private Integer idPersona;
    private Integer ipDerpote;
    private String correo;

    public CuentaDto() {
    }

    public CuentaDto(Integer idCuenta, Integer idPersona, Integer ipDerpote, String correo) {
        this.idCuenta = idCuenta;
        this.idPersona = idPersona;
        this.ipDerpote = ipDerpote;
        this.correo = correo;
    }

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
