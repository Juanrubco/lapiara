package servlet;

import java.util.*;

public  class  MySingleton 
{
    // Creacion de los arraylist
    private static MySingleton instancia = null;
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    private ArrayList<Comprador> compradores = new ArrayList<Comprador>();
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Oferta> ofertas = new ArrayList<Oferta>();

    public static MySingleton laconstructora() 
    {
        if (instancia == null)
         {
            instancia = new MySingleton();
        }
        return instancia;

    }
    // metodos de validacion
    public Boolean validacion (String  nom, String ape , String doc , String cor , String con){
        boolean ok = true;

        if (nom == "") {
            ok = false;

            if (ape == "") {
                ok = false;

                if (doc == "") {
                    ok = false;

                    if (cor == "") {
                        ok = false;

                        if (con == "") {
                            ok = false;

                            return ok;
                        }
                        
                    }
                    
                }
                
            }
            
        }
        return ok;
    }
// Metodo para registar un vendedor o un comprador
    public void agregarVendedor(String nom, String ape, String doc, String cor, String con)
    {
        Vendedor tempo = new Vendedor(nom,ape,doc,cor,con);
        vendedores.add(tempo);

    }
    public void agregarComprador(String nom, String ape, String doc, String cor, String con){
        Comprador tempo = new Comprador(nom,ape,doc,cor,con);
        compradores.add(tempo);
    }
// Metodos para iniciar sesion como comprador o vendedor
    public Boolean inicioVendedor(String mail,String code)
    {    boolean ok = false;
        for (Vendedor venderor : vendedores ) 
        {
          if (venderor.getCorreo().equals(mail) && venderor.getContraseña().equals(code)) {
               ok = true;
              

                
            }  
        }
       return ok; 
    }
    public Boolean inicioComprador(String mail, String code)
    {
        boolean ok = false;
        for (Comprador comprador : compradores ) 
        {
         if (comprador.getCorreo().equals(mail) && comprador.getContraseña().equals(code)) {

                ok= true;
                
            }   
        }
        return ok;
    }
   

    
//metodos para agregar productos  y relaciones
    public void agregarProducto(String nom, String cod, int can, String fecha, String prec, String des, String doc, String lug  ){

        Producto tempo = new Producto(nom,cod,can,fecha,prec,des,doc,lug);
        productos.add(tempo);

    }

    
    public void agregarOferta(String docC,String nom, String cod, int can, String fecha, String prec, String des, String doc, String lug, String estadoOferta ){
        Oferta tempo = new Oferta(docC,nom,cod,can,fecha,prec,des,doc,lug,estadoOferta);
        ofertas.add(tempo);
    }

// Metodo para la busqueda de productos
    ArrayList<Producto> Rarray(){
        return productos;
    }

    ArrayList<Oferta> volver(){
        return ofertas;
    }


     public void aceptarOferta(String docC){
        
        for (Oferta oferta : ofertas) {
            if (oferta.getDocC().equals(docC)) {
                int ven = oferta.getCantidad();
                oferta.setEstadoOferta("Aceptada");
                String cod = oferta.getCodigo();
                for (Producto producto : productos ) {
                    if(producto.getCodigo().equals(cod)){
                        int can = producto.getCantidad();
                        producto.setCantidad(can-ven);
                    }
                    
                }
                    
                }
                
            }
            
        }

        public void negarOferta(String docC){
            for (Oferta oferta : ofertas ) {
                if (oferta.getDocC().equals(docC)){
                    oferta.setEstadoOferta("Negada");
                }
                
            }
        }
     
}
