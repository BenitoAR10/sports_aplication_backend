package bo.edu.ucb.spapp.Sports.App.dto;

public class LugarEntrenamientoSucursalDto {
    private int idLugarEntrenamientoSucursal;
    private String nombre;
    private String logo;
    private String direccion;

    public LugarEntrenamientoSucursalDto() {
    }

    public LugarEntrenamientoSucursalDto(int idLugarEntrenamientoSucursal, String nombre, String logo, String direccion) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
        this.nombre = nombre;
        this.logo = logo;
        this.direccion = direccion;
    }

    public int getIdLugarEntrenamientoSucursal() {
        return idLugarEntrenamientoSucursal;
    }

    public void setIdLugarEntrenamientoSucursal(int idLugarEntrenamientoSucursal) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamientoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
