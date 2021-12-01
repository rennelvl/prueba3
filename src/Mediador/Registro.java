
package Mediador;

import database.Conexion;
import tablas.Alumnos;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.SQLException;


/**
 *
 * @author renne
 */
public class Registro {
 
    public boolean agregar(Alumnos alumno){
    
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "INSERT INTO alumnos(rut,nombre,apellido,curso,pase_movilidad) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, alumno.getRut());
            stmt.setString(2, alumno.getNombre());
            stmt.setString(3, alumno.getApellido());
            stmt.setString(4, alumno.getCurso());
            stmt.setBoolean(5, alumno.isPase_movilidad());
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;
                      
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al agregar alumno");                      
            return false;
        } catch (Exception e){
            System.out.println("Error al agregar alumno ");
            return false;
        }
    
      
    
    
    
    }
    
    
    public boolean actualizar(Alumnos alumno){
    
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "UPDATE Alumnos SET rut= ?,nombre= ?,apellido= ?,curso=?,pase_movilidad=? WHERE = idalumno";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, alumno.getRut());
            stmt.setString(2, alumno.getNombre());
            stmt.setString(3, alumno.getApellido());
            stmt.setString(4, alumno.getCurso());
            stmt.setBoolean(5, alumno.isPase_movilidad());
            stmt.setInt(6, alumno.getIdAlumno());
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;
            
            
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar alumno");                      
            return false;
        } catch (Exception e){
            System.out.println("Error al actualizar alumno ");
            return false;
        }
        
    
    
    
    }
    public boolean eliminar(int idAlumno){
    
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "DELETE FROM alumnos  WHERE idalumno =?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, idAlumno);
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;
            
            
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar alumno");                      
            return false;
        } catch (Exception e){
            System.out.println("Error al eliminar alumno ");
            return false;
        }
    
    
    
    }
    
    
    
     
    
}
