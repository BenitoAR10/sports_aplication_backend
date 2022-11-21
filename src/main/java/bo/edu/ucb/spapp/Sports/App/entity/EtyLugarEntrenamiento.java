package bo.edu.ucb.spapp.Sports.App.entity;

public class EtyLugarEntrenamiento {
    private int idLugarEntrenamientoSucursal;
    private String nombreLugar;
    private String logoLugar;
    private String direccion;

    public EtyLugarEntrenamiento() {
    }


    public EtyLugarEntrenamiento(int idLugarEntrenamiento, String nombreLugar, String logoLugar, String direccion) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamiento;
        this.nombreLugar = nombreLugar;
        this.logoLugar = logoLugar;
        this.direccion = direccion;
    }

    public int getIdLugarEntrenamiento() {
        return idLugarEntrenamientoSucursal;
    }

    public void setIdLugarEntrenamiento(int idLugarEntrenamiento) {
        this.idLugarEntrenamientoSucursal = idLugarEntrenamiento;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getLogoLugar() {
        return logoLugar;
    }

    public void setLogoLugar(String logoLugar) {
        this.logoLugar = logoLugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
