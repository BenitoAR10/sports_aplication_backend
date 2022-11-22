package bo.edu.ucb.spapp.Sports.App.dto;

public class CrearTiendaDto {
    private Integer idCuenta;
    private String nombreTienda;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String nit;
    private String telefono;
    private String correo;
    private String foto;
    private String direccion;

    public CrearTiendaDto() {
    }

    public CrearTiendaDto(Integer idCuenta, String nombreTienda, String nombrePropietario, String apellidoPropietario, String nit, String telefono, String correo, String foto, String direccion) {
        this.idCuenta = idCuenta;
        this.nombreTienda = nombreTienda;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.nit = nit;
        this.telefono = telefono;
        this.correo = correo;
        this.foto = foto;
        this.direccion = direccion;
    }

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "CrearTiendaDto{" +
                "idCuenta=" + idCuenta +
                "nombreTienda='" + nombreTienda + '\'' +
                ", nombrePropietario='" + nombrePropietario + '\'' +
                ", apellidoPropietario='" + apellidoPropietario + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", foto='" + foto + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}