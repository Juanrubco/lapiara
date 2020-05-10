package servlet;

import java.sql.Connection;


public abstract class AbstractDB 
{
    protected Connection conn;
    
    public AbstractDB()
    {
        ConexionDB x = new ConexionDB();
        this.conn = x.getConn();
    }
}