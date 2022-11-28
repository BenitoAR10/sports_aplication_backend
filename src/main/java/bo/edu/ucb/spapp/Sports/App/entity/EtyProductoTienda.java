package bo.edu.ucb.spapp.Sports.App.entity;

public class EtyProductoTienda {
    private String nombreTienda;
    private String fotoTienda;
    private String telefono;
    private String direccion;
    private double latitud;
    private double longitud;
    private String nombre;
    private String imagen;
    private String marca;
    private Boolean genero;
    private double peso;
    private int amortiguacion;
    private double talla;
    private double precio;
    private Boolean estado;

    public EtyProductoTienda() {
    }

    public EtyProductoTienda(String nombreTienda, String fotoTienda, String telefono, String direccion, double latitud, double longitud, String nombre, String imagen, String marca, Boolean genero, double peso, int amortiguacion, double talla, double precio, Boolean estado) {
        this.nombreTienda = nombreTienda;
        this.fotoTienda = fotoTienda;
        this.telefono = telefono;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.nombre = nombre;
        this.imagen = imagen;
        this.marca = marca;
        this.genero = genero;
        this.peso = peso;
        this.amortiguacion = amortiguacion;
        this.talla = talla;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getFotoTienda() {
        return fotoTienda;
    }

    public void setFotoTienda(String fotoTienda) {
        this.fotoTienda = fotoTienda;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Boolean getGenero() {
        return genero;
    }

    public void setGenero(Boolean genero) {
        this.genero = genero;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EtyProductoTienda{" + "nombreTienda=" + nombreTienda + ", fotoTienda=" + fotoTienda + ", telefono=" + telefono + ", direccion=" + direccion + ", latitud=" + latitud + ", longitud=" + longitud + ", nombre=" + nombre + ", imagen=" + imagen + ", marca=" + marca + ", genero=" + genero + ", peso=" + peso + ", amortiguacion=" + amortiguacion + ", talla=" + talla + ", precio=" + precio + ", estado=" + estado + '}';
    }
}
