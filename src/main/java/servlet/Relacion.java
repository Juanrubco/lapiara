package servlet;


public class Relacion {
    
    private String codigo, documento,lugar;

    public Relacion() {
        this.codigo = "";
        this.documento = "";
        this.lugar = "";
        
        

    }
    public Relacion(String cod, String doc,String lug)
    {
        this.codigo = cod;
        this.documento = doc;
        this.lugar = lug;
        
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Relacion{" + "codigo=" + codigo + ", documento=" + documento + ", lugar=" + lugar + '}';
    }

   
}
