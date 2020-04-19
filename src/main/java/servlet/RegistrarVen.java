package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "RegistrarVen", 
        urlPatterns = {"/RegistrarVen"}
    )
public class RegistrarVen extends HttpServlet{
	 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException 
            {
        MySingleton tempo = MySingleton.laconstructora();
        String valor = req.getParameter("1");
        if (tempo.validacion(req.getParameter("N"),req.getParameter("A"),req.getParameter("C"),req.getParameter("correo"),req.getParameter("H"))) 
        {
            
        
        if (valor.equals("com")) 
        {
            tempo.agregarComprador(req.getParameter("N"),req.getParameter("A"),req.getParameter("C"),req.getParameter("correo"),req.getParameter("H"));
            resp.sendRedirect("index.html");
        }
        else if (valor.equals("ven")) 
        {
            tempo.agregarVendedor(req.getParameter("N"),req.getParameter("A"),req.getParameter("C"),req.getParameter("correo"),req.getParameter("H"));
            resp.sendRedirect("index.html");
        }
        }
        else
        {
        resp.sendRedirect("RegistrarVen");
        }


}

}