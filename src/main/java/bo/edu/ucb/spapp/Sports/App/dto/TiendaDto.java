package bo.edu.ucb.spapp.Sports.App.dto;

public class TiendaDto {
    private int idTienda;
    private int idCuenta;
    private String nombre_tienda;
    private String correo;
    private String telefono;
    private String direccion;
    private String latitud;
    private String longitud;

    public TiendaDto() {
    }

    public TiendaDto(int idTienda, int idCuenta, String nombre_tienda, String correo, String telefono, String direccion, String latitud, String longitud) {
        this.idTienda = idTienda;
        this.idCuenta = idCuenta;
        this.nombre_tienda = nombre_tienda;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    //toString
    @Override
    public String toString() {
        return "TiendaDto [idTienda=" + idTienda + ", idCuenta=" + idCuenta + ", nombre_tienda=" + nombre_tienda + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud=" + longitud + "]";
    }
}
