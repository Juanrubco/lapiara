package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB
{
    private final String url;
    private Connection conn;

    public ConexionDB()
    {
        this.url ="jdbc:postgresql://ec2-52-86-73-86.compute-1.amazonaws.com:5432/d3conrtm1v0fbo?user=qcqumfeftmdbrg&password=d44dd5070d5f1d6598eb39e351045b04df87f889b8a3730ac9a7b81a34204ff4"
        try
        {
            Class.forName("org.postgresql.Driver").newInstance();

            this.conn = DriverManager.getConnection(url);
            if(this.conn!=null)
                System.out.println("Todo bien..estamos conectados..!!");
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();            
        }         
        catch (InstantiationException e) 
        {
            e.printStackTrace();
        }         
        catch (IllegalAccessException e) 
        {
            e.printStackTrace();
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }

        } 

    public Connection getConn()
    {
        return conn;
    }  
    public void cierraConexion()
    {
        try
        {
            this.conn.close();
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    }

