package bo.edu.ucb.spapp.Sports.App.dto;
// Creamos una clase DTO para los datos que queremos retornar al cliente via API.
public class ProductoDto {
    private int idProducto;
    private String nombre;
    private String marca;
    private Boolean Genero;
    private double peso;
    private int amortiguacion;

    private double talla;

    public ProductoDto() {
    }

    public ProductoDto(int idProducto, String nombre, String marca, Boolean Genero, double peso, int amortiguacion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.Genero = Genero;
        this.peso = peso;
        this.amortiguacion = amortiguacion;
        this.talla = talla;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getGenero() {
        return Genero;
    }

    public void setGenero(Boolean Genero) {
        this.Genero = Genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAmortiguacion() {
        return amortiguacion;
    }

    public void setAmortiguacion(int amortiguacion) {
        this.amortiguacion = amortiguacion;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    //toString
    @Override
    public String toString() {
        return "ProductoDto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + ", Genero=" + Genero + ", peso=" + peso + ", amortiguacion=" + amortiguacion + ", talla=" + talla + '}';
    }

}
