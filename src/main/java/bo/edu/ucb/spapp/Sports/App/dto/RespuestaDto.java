package bo.edu.ucb.spapp.Sports.App.dto;

public class RespuestaDto<T> {
    private T datos;
    private String mensaje;
    private Boolean estado;

    public RespuestaDto() {
    }

    public RespuestaDto(T datos, String mensaje, Boolean estado) {
        this.datos = datos;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "RespuestaDto{" +
                "datos=" + datos +
                ", mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                '}';
    }
}
