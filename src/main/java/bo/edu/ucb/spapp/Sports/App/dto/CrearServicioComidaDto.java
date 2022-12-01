package bo.edu.ucb.spapp.Sports.App.dto;
// clase dto CrearServicioComidaDto que representa los datos que se enviaran al API para crear un servicio de comida
public class CrearServicioComidaDto {
    private Integer idCuenta;
    private String nombreLugar;
    private String logo;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String nit;
    private String telefono;
    private String correo;
    private String direccion;
    private double latitud;
    private double longitud;

    public CrearServicioComidaDto() {
    }

    public CrearServicioComidaDto(Integer idCuenta, String nombreLugar, String logo, String nombrePropietario, String apellidoPropietario, String nit, String telefono, String correo, String direccion, double latitud, double longitud) {
        this.idCuenta = idCuenta;
        this.nombreLugar = nombreLugar;
        this.logo = logo;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nit = nit;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
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

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "CrearServicioComidaDto{" +
                "idCuenta=" + idCuenta +
                "nombreLugar='" + nombreLugar + '\'' +
                ", logo='" + logo + '\'' +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidoPropietario='" + apellidoPropietario + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }

    public boolean validarDatos(){
        if (this.nombreLugar == null || this.nombreLugar.isEmpty()){
            return false;
        }
        if (this.logo == null || this.logo.isEmpty()){
            return false;
        }
        if (this.nombrePropietario == null || this.nombrePropietario.isEmpty()){
            return false;
        }
        if (this.apellidoPropietario == null || this.apellidoPropietario.isEmpty()){
            return false;
        }
        if (this.nit == null || this.nit.isEmpty()){
            return false;
        }
        if (this.telefono == null || this.telefono.isEmpty()){
            return false;
        }
        if (this.correo == null || this.correo.isEmpty()){
            return false;
        }
        if (this.direccion == null || this.direccion.isEmpty()){
            return false;
        }
        if (this.latitud == 0){
            return false;
        }
        if (this.longitud == 0){
            return false;
        }
        return true;
    }
}
