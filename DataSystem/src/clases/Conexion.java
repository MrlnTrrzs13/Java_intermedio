package clases;
import java.sql.*;
public class Conexion {
    //Coneccion local
    public static Connection conect() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
            return cn;
        } catch(SQLException e) {
            System.out.println("ERROR! en la coneccion local " + e);
        }
        return (null);
    }
}
