package servlet;

public class Producto {
    
    private String nombre,codigo,fecha,precio,descripcion,documento,lugar;
    private int cantidad;
    
    public Producto(){
        this.nombre ="";
        this.codigo ="";
        this.cantidad =0;
        this.fecha ="";
        this.precio ="";
        this.descripcion ="";
        this.documento ="";
        this.lugar = "";
    }
    
    public Producto (String nom, String cod, int can, String fecha, String pre, String des,String doc, String lug){
        this.nombre = nom;
        this.codigo = cod;
        this.cantidad = can;
        this.fecha = fecha;
        this.precio = pre;
        this.descripcion = des;
        this.documento = doc;
        this.lugar = lug;

        
    }
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantidad=" + cantidad + ", fecha=" + fecha + ", precio=" + precio + ", descripcion=" + descripcion + ", documento="+ documento + ", lugar="+ lugar +'}';
    }
    
    
    
}
