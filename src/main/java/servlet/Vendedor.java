package servlet;

public class Vendedor {

    private String nombre,apellido,documento,correo,contraseña;

    public Vendedor() {
        this.nombre = "";
        this.apellido = "";
        this.documento = "";
        this.correo = "";
        this.contraseña = "";

    }

    public Vendedor( String nom,String ape, String doc, String cor, String con) {
        this.nombre = nom;
        this.apellido =ape ;
        this.documento = doc;
        this.correo = cor;
        this.contraseña = con;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", correo=" + correo + ", contrasena=" + contraseña + '}';
    }

}