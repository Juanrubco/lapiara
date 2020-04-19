package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "PrograVen", 
        urlPatterns = {"/ProgramarVen"}
    )
public class ProgramarVen extends HttpServlet{
	 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException 
            {
        MySingleton tempo = MySingleton.laconstructora();
        tempo.agregarProducto(req.getParameter("producto"),
        	req.getParameter("codpro"),Integer.parseInt(
        	req.getParameter("can")),
        	req.getParameter("fecha"),
        	req.getParameter("prec"),
        	req.getParameter("des"),
            req.getParameter("doc"),
            req.getParameter("lug")
        	);
       
        resp.sendRedirect("MenuV.html");


}

}