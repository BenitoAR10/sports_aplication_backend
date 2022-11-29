package bo.edu.ucb.spapp.Sports.App.dto;
// Creamos una clase DTO para los datos que queremos retornar al cliente via API.
public class ProductoDto {
    private String nombre;
    private String descripcion;
    private String imagen;
    private String marca;
    private String tipoProducto;
    private Boolean estado;
    private String color;
    public ProductoDto() {
    }
    public ProductoDto(String nombre, String descripcion, String imagen, String marca, String tipoProducto, Boolean estado, String color) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.marca = marca;
        this.tipoProducto = tipoProducto;
        this.estado = estado;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipoProducto() {
        return tipoProducto;
    }
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //toString
    @Override
    public String toString() {
        return "ProductoDto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", marca=" + marca + ", tipoProducto=" + tipoProducto + ", estado=" + estado + ", color=" + color + '}';
    }
}
