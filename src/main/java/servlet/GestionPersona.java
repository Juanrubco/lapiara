package servlet;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GestionPersona extends AbstractDB
{

	public GestionPersona()
	{
		super();
	}
	public static Persona Login(String user, String pass)
	{
		String sql="select*from persona where usuario=? and pass=?";
		ResultSet rst;
		Usuario usuario=null;
		try
		{
			Connection conn = ConexionDB.getConn();
			PreparedStatement pstm=this.conn.prepareStatement(sql);
			pstm.setString(1,user);
			pstm.setString(2,pass);
			rst=pstm.excuteQuery();

			while(rst.next())
			{
				usuario=new Usuario();
				usuario.setID(rst.getString("idpersona"));
				usuario.setNombre(rst.getString("nombre"));
				usuario.setApellido(rst.getString("apellido"));
				usuario.setCargo(rst.getString("cargo"));
				usuario.setUser(rst.getString("ususario"));
				usuario.setPass(rst.getString("pass"));
			}
			rst.close();

		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return usuario;
	}
	public void cierraConexion() 
	{
        try 
        {
            this.conn.close();
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }
}