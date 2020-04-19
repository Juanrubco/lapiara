package servlet;


public class Oferta extends Producto{
    private String docC, estadoOferta;
    public Oferta(){
        super();
        this.docC="";
        this.estadoOferta="";


    }

    public Oferta(String docC, String nom, String cod, int can, String fecha, String pre, String des, String doc, String lug,String estadoOferta) {
        super(nom, cod, can, fecha, pre, des, doc, lug);
        this.docC = docC;
        this.estadoOferta = estadoOferta;
    }

    public String getDocC() {
        return docC;
    }

    public void setDocC(String docC) {
        this.docC = docC;
    }

    public String getEstadoOferta(){
        return estadoOferta;
    }

    public void setEstadoOferta(String estadoOferta){
        this.estadoOferta = estadoOferta;

    }
    


     public String toString() {
        return "Oferta{" + "nombre=" + this.getNombre() + ", codigo=" + this.getCodigo() + ", cantidad=" + this.getCantidad() + ", fecha=" + this.getFecha() + ", precio=" + this.getPrecio() + ", descripcion=" + this.getDescripcion() + ", documento="+ this.getDocumento() + ", lugar="+ this.getLugar() + ", Documento comprador="+ docC + ", Estado de la oferta="+ estadoOferta +'}';
    }
    
}