package bo.edu.ucb.spapp.Sports.App.entity;

public class EtyCuentaPersona {
    private String correo;
    private String nombres;
    private String apellidos;

    public EtyCuentaPersona() {
    }

    public EtyCuentaPersona(String correo, String nombres, String apellidos) {
        this.correo = correo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "EtyCuentaPersona{" +
                "correo='" + correo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
