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
    name = "buscarOfertas", 
    urlPatterns = {"/buscarOfertas"}
    )
public class buscarOfertas extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException 
    {
        MySingleton tempo = MySingleton.laconstructora();
        ArrayList<Oferta> ofertor = new ArrayList<Oferta>();
        ofertor= tempo.volver();
        ServletOutputStream out = resp.getOutputStream();
        String vacio ="";
        if (req.getParameter("busc1")!= vacio) {
            for (Oferta oferta : ofertor ) {
                if (oferta.getDocumento().equals(req.getParameter("busc1"))) {
                    out.write(oferta.toString().getBytes());
                    
                }
                
            }
            
        }
      out.flush();
      out.close();

}

}
      
