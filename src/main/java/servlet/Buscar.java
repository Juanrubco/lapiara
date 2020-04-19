package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "Buscar", 
        urlPatterns = {"/Buscar"}
    )
public class Buscar extends HttpServlet{
	 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException 
            {
        MySingleton tempo = MySingleton.laconstructora();
        ArrayList<Producto> productor = new ArrayList<Producto>();
        productor= tempo.Rarray();
        ServletOutputStream out = resp.getOutputStream();
        String vacio ="";
        if(req.getParameter("busc1")!=vacio){

                for (Producto producto : productor ) {
            if (producto.getNombre().equals(req.getParameter("busc1"))) {
              


                
                  out.write(producto.toString().getBytes());


                     
                
            }
             
         } 
     }
     else if (req.getParameter("busc2")!= vacio) {
         
     
         

        for (Producto producto : productor ) {
            if (producto.getLugar().equals(req.getParameter("busc2"))) {
              


                
                  out.write(producto.toString().getBytes());


                     
                
            }
             
         } 
     }else if (req.getParameter("busc3") != vacio) {
         
     }
         for (Producto producto : productor ) {
            if (producto.getPrecio().equals(req.getParameter("busc3"))) {
              


                
                  out.write(producto.toString().getBytes());


                     
                
            }
             
         } 

             
         


         out.flush();
        out.close();


}

}