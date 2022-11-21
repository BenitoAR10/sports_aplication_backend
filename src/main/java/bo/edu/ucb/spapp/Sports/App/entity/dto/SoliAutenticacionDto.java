package bo.edu.ucb.spapp.Sports.App.entity.dto;
// Creamos una clase DTO para las peticiones de autenticaion de usuarios.

public class SoliAutenticacionDto{
   private String correo;
   private String contrasenia;

    public SoliAutenticacionDto() {
    }

    public SoliAutenticacionDto(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "SoliAutenticacionDto{" +
                "correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }
}



