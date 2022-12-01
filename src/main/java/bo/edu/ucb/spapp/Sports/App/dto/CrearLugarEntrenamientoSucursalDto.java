package bo.edu.ucb.spapp.Sports.App.dto;

public class CrearLugarEntrenamientoSucursalDto {
    private Integer idCuenta;
    private String nombre_encargado;
    private String apellido_encargado;
    private String telefono_sucursal;
    private String direccion;
    private Double latitud;
    private Double longitud;

    public CrearLugarEntrenamientoSucursalDto() {
    }

    public CrearLugarEntrenamientoSucursalDto(Integer idCuenta, String nombre_encargado, String apellido_encargado, String telefono_sucursal, String direccion, Double latitud, Double longitud) {
        this.idCuenta = idCuenta;
        this.nombre_encargado = nombre_encargado;
        this.apellido_encargado = apellido_encargado;
        this.telefono_sucursal = telefono_sucursal;
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

    public String getNombre_encargado() {
        return nombre_encargado;
    }

    public void setNombre_encargado(String nombre_encargado) {
        this.nombre_encargado = nombre_encargado;
    }

    public String getApellido_encargado() {
        return apellido_encargado;
    }

    public void setApellido_encargado(String apellido_encargado) {
        this.apellido_encargado = apellido_encargado;
    }

    public String getTelefono_sucursal() {
        return telefono_sucursal;
    }

    public void setTelefono_sucursal(String telefono_sucursal) {
        this.telefono_sucursal = telefono_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "CrearLugarEntrenamientoSucursalDto{" +
                "idCuenta=" + idCuenta +
                ", nombre_encargado='" + nombre_encargado + '\'' +
                ", apellido_encargado='" + apellido_encargado + '\'' +
                ", telefono_sucursal='" + telefono_sucursal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }

    public boolean validarDatos(){
        if (idCuenta == null) {

            return false;
        }
        if (nombre_encargado == null) {

            return false;
        }
        if (apellido_encargado == null) {

            return false;
        }
        if (telefono_sucursal == null) {

            return false;
        }
        if (direccion == null) {

            return false;
        }
        if (latitud == null) {

            return false;
        }
        if (longitud == null) {

            return false;
        }
        return true;
    }
}
