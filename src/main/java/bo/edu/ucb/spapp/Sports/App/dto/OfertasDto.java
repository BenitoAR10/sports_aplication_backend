package bo.edu.ucb.spapp.Sports.App.dto;

import java.util.Date;

public class OfertasDto {
    private int idOferta;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_fin;

    public OfertasDto() {
    }

    public OfertasDto(int idOferta, String descripcion, Date fecha_inicio, Date fecha_fin) {
        this.idOferta = idOferta;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    //toString

    @Override

    public String toString() {
        return "OfertasDto{" + "idOferta=" + idOferta + ", descripcion=" + descripcion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + '}';
    }
}
