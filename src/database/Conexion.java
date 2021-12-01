
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author renne
 */
public class Conexion {
    
    public Connection tenerConexion(){
    
    Connection connection = null;
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio","root","");
            System.out.println("Connection succesful");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexion"+ e.getMessage());
        }
    return connection;
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
