package bo.edu.ucb.spapp.Sports.App.entity;

public class SpProducto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private String imagen;
    private String marca;
    private Boolean genero;
    private double peso;
    private int amortiguacion;
    private int pisada;
    private int numero_de_vistas;
    private int numero_de_comparaciones;
    private String tipo_producto;
    private Boolean estado;
    private String tx_correo;
    private String tx_fecha;
    private String tx_host;
    private String color;
    private Double talla;

    public SpProducto() {
    }

    public SpProducto(int idProducto, String nombre, String descripcion, String imagen, String marca, Boolean genero, double peso, int amortiguacion, int pisada, int numero_de_vistas, int numero_de_comparaciones, String tipo_producto, Boolean estado, String tx_correo, String tx_fecha, String tx_host, String color, Double talla) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.marca = marca;
        this.genero = genero;
        this.peso = peso;
        this.amortiguacion = amortiguacion;
        this.pisada = pisada;
        this.numero_de_vistas = numero_de_vistas;
        this.numero_de_comparaciones = numero_de_comparaciones;
        this.tipo_producto = tipo_producto;
        this.estado = estado;
        this.tx_correo = tx_correo;
        this.tx_fecha = tx_fecha;
        this.tx_host = tx_host;
        this.color = color;
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

    public int getPisada() {
        return pisada;
    }

    public void setPisada(int pisada) {
        this.pisada = pisada;
    }

    public int getNumero_de_vistas() {
        return numero_de_vistas;
    }

    public void setNumero_de_vistas(int numero_de_vistas) {
        this.numero_de_vistas = numero_de_vistas;
    }

    public int getNumero_de_comparaciones() {
        return numero_de_comparaciones;
    }

    public void setNumero_de_comparaciones(int numero_de_comparaciones) {
        this.numero_de_comparaciones = numero_de_comparaciones;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getTx_correo() {
        return tx_correo;
    }

    public void setTx_correo(String tx_correo) {
        this.tx_correo = tx_correo;
    }

    public String getTx_fecha() {
        return tx_fecha;
    }

    public void setTx_fecha(String tx_fecha) {
        this.tx_fecha = tx_fecha;
    }

    public String getTx_host() {
        return tx_host;
    }

    public void setTx_host(String tx_host) {
        this.tx_host = tx_host;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }


    @Override
    public String toString() {
        return "SpProducto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", marca=" + marca + ", genero=" + genero + ", peso=" + peso + ", amortiguacion=" + amortiguacion + ", pisada=" + pisada + ", numero_de_vistas=" + numero_de_vistas + ", numero_de_comparaciones=" + numero_de_comparaciones + ", tipo_producto=" + tipo_producto + ", estado=" + estado + ", tx_correo=" + tx_correo + ", tx_fecha=" + tx_fecha + ", tx_host=" + tx_host + ", color=" + color + ", talla=" + talla + '}';
    }

}
