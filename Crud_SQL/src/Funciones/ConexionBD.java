package Funciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexionBD {
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    public ConexionBD(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //base local
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_sql","root","root"); 
            
            System.out.println("[OK] Conexion a BD exitosa");
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo establecer conexion a la BD");
        }
    }
    
}
