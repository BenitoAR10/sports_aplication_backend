<<<<<<< HEAD
<<<<<<< HEAD
package bo.edu.ucb.spapp.Sports.App.entity;public class SpEntrenador {
=======
=======
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
package bo.edu.ucb.spapp.Sports.App.entity;

public class SpEntrenador {
    private int idEntrenador;
    private int idCuenta;
    private String nit;
    private String correo;
    private String foto;
    private boolean estado;

    public SpEntrenador() {
    }

    public SpEntrenador(int idEntrenador, int idCuenta, String nit, String correo, String foto, boolean estado) {
        this.idEntrenador = idEntrenador;
        this.idCuenta = idCuenta;
        this.nit = nit;
        this.correo = correo;
        this.foto = foto;
        this.estado = estado;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
<<<<<<< HEAD
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
=======
>>>>>>> 3ae0e97316869906df40233a17b97468a36a42bd
}
