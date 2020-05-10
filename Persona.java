package servlet;

public class Persona {

    private String nombre,apellido,cargo,usuario,pass;
    private int idpersona;
    public Persona() {
        this.idpersona=0;
        this.nombre = "";
        this.apellido = "";
        this.cargo = "";
        this.usuario = "";
        this.pass = "";

    }

    public Persona(int id, String nom,String ape, String car, String user, String pas) {
        this.idpersona=id;
        this.nombre = nom;
        this.apellido =ape ;
        this.cargo = car;
        this.usuario = user;
        this.pass = pas;

    }

    public int getID()
    {
        return idpersona;
    }

    public void setID(int idpersona)
    {
        this.idpersona= idpersona;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Persona{"+"ID= " + idpersona + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", usuario=" + usuario + ", contrasena=" + pass + '}';
    }

}