package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "Login", 
        urlPatterns = {"/InicioSesion"}
    )
public class InicioSesion extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException 
            {
        MySingleton tempo = MySingleton.laconstructora();
        String valor = req.getParameter("2");
        if (valor.equals("com")) 
        { 
            if (tempo.inicioComprador(req.getParameter("IC"),req.getParameter("IP"))) 
            {
            
                String datos = "Inicio Sesion como comprador";
                resp.sendRedirect("MenuC.html");
            	  ServletOutputStream out = resp.getOutputStream();
                  out.write(datos.getBytes());


                	 out.flush();
        			out.close();
                }
                else
                {
                     String datos = "Contraseña o correo incorrectos";
                  ServletOutputStream out = resp.getOutputStream();
                  out.write(datos.getBytes());


                     out.flush();
                    out.close();
                }
            }
            else if (valor.equals("ven")) 
            {
                if (tempo.inicioVendedor(req.getParameter("IC"), req.getParameter("IP"))) 
                {
                    String datos = "Inicio Sesion como vendedor";
                    resp.sendRedirect("MenuV.html");
                  ServletOutputStream out = resp.getOutputStream();
                  out.write(datos.getBytes());


                     out.flush();
                    out.close();
                
            }
            else
            {
                 String datos = "Contraseña o correo incorrectos";
                  ServletOutputStream out = resp.getOutputStream();
                  out.write(datos.getBytes());


                     out.flush();
                    out.close();

            }
            	
            	
            }

}
}