package bo.edu.ucb.spapp.Sports.App.dto;

public class LugarComidaDto {
    private Integer idLugarComida;
    private String nombreLugar;
    private String logo;
    private String direccion;

    public LugarComidaDto() {
    }

    public LugarComidaDto(Integer idLugarComida, String nombreLugar, String logo, String direccion) {
        this.idLugarComida = idLugarComida;
        this.nombreLugar = nombreLugar;
        this.logo = logo;
        this.direccion = direccion;
    }

    public Integer getIdLugarComida() {
        return idLugarComida;
    }

    public void setIdLugarComida(Integer idLugarComida) {
        this.idLugarComida = idLugarComida;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
