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
    name = "AceptarOfertas", 
    urlPatterns = {"/AceptarOfertas"}
    )
public class AceptarOfertas extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException 
    {
        MySingleton tempo = MySingleton.laconstructora();
        String dato = req.getParameter("busc1");
        String valor = req.getParameter("Kelly");
        if (valor.equals("Aceptar")) {
            tempo.aceptarOferta(dato);
        resp.sendRedirect("MenuV.html");
        }else{
            tempo.negarOferta(dato);
        resp.sendRedirect("MenuV.html");
        }
        

     }
}   
