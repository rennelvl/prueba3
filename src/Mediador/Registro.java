
package Mediador;

import database.Conexion;
import tablas.Alumnos;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tablas.Docentes;

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
    
    public Alumnos buscarporrut(int rut){
        Alumnos alumno = new Alumnos();
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "SELECT * FROM alumnos  WHERE rut =?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, rut);
            
            ResultSet resu = stmt.executeQuery();
            
            if (resu.next()) {
                alumno.setIdAlumno(resu.getInt("idalumno"));
                alumno.setRut(resu.getInt("rut"));
                alumno.setNombre(resu.getString("nombre"));
                alumno.setApellido(resu.getString("apellido"));
                alumno.setCurso(resu.getString("curso"));
                alumno.setPase_movilidad(resu.getBoolean("pase_movilidad"));             
                              
                            
            }
            resu.close();
            stmt.close();
            conn.close();
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al listar ");
            
        } return alumno;
    }    
    public List<Alumnos> buscarTodos(){
        
        List<Alumnos> lista = new ArrayList<>(){};
        
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "SELECT * FROM alumnos";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            
            
            ResultSet resu = stmt.executeQuery();
            
            while (resu.next()) {
                Alumnos alumno = new Alumnos();

                
                alumno.setIdAlumno(resu.getInt("idalumno"));
                alumno.setRut(resu.getInt("rut"));
                alumno.setNombre(resu.getString("nombre"));
                alumno.setApellido(resu.getString("apellido"));
                alumno.setCurso(resu.getString("curso"));
                alumno.setPase_movilidad(resu.getBoolean("pase_movilidad"));             
                
                lista.add(alumno);
                            
            }
            resu.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al listar alumnos");
        }
        return lista;    
        
        
       
            
            
            
            
        
 
 }   
    
     public boolean agregarDocente(Docentes docente){
    
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "INSERT INTO docentes(rutdocente,nombredocente,apellidodocente,especialidad,pase_docente) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, docente.getRutDocente());
            stmt.setString(2, docente.getNombreDocente());
            stmt.setString(3, docente.getApellidoDocente());
            stmt.setString(4, docente.getEspecialidad());
            stmt.setBoolean(5, docente.isPase_docente());
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;
                      
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al agregar Docente");                      
            return false;
        } catch (Exception e){
            System.out.println("Error al agregar Docente ");
            return false;
        }
    
      
    
    
    
    }
    
    
    public boolean actualizarDocente(Docentes docente){
    
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "UPDATE Docentes SET rutdocente= ?,nombredocente= ?,apellidodocente= ?,especialidad=?,pase_docente=? WHERE = iddocente";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, docente.getRutDocente());
            stmt.setString(2, docente.getNombreDocente());
            stmt.setString(3, docente.getApellidoDocente());
            stmt.setString(4, docente.getEspecialidad());
            stmt.setBoolean(5, docente.isPase_docente());
            stmt.setInt(6, docente.getIdDocente());
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;
            
            
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar Docente");                      
            return false;
        } catch (Exception e){
            System.out.println("Error al actualizar Docente ");
            return false;
        }
        
    
    
    
    }
    public boolean eliminarDocente(int idDocente){
    
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "DELETE FROM Docentes  WHERE iddocente =?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, idDocente);
            
            stmt.executeUpdate();
            stmt.close();
            conn.close();
            return true;
            
            
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar Docente");                      
            return false;
        } catch (Exception e){
            System.out.println("Error al eliminar Docente ");
            return false;
        }
    
    
    
    }
    
    public Docentes buscarporrutDocente(int rutDocente){
        Docentes docente = new Docentes();
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "SELECT * FROM docentes  WHERE rutdocente =?";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setInt(1, rutDocente);
            
            ResultSet resu = stmt.executeQuery();
            
            if (resu.next()) {
                docente.setIdDocente(resu.getInt("iddocente"));
                docente.setRutDocente(resu.getInt("rutDocente"));
                docente.setNombreDocente(resu.getString("nombredocente"));
                docente.setApellidoDocente(resu.getString("spellidodocente"));
                docente.setEspecialidad(resu.getString("especialidad"));
                docente.setPase_docente(resu.getBoolean("pase_docente"));             
                              
                            
            }
            resu.close();
            stmt.close();
            conn.close();
            
            
            
        } catch (SQLException e) {
            System.out.println("Error al listar ");
            
        } return docente;
    }    
    public List<Docentes> buscarTodosDocentes(){
        
        List<Docentes> lista2 = new ArrayList<>(){};
        
        try {
            Conexion conect = new Conexion();
            Connection conn = conect.tenerConexion();
            
            String query = "SELECT * FROM Docentes";
            PreparedStatement stmt = conn.prepareStatement(query);
            
            
            
            ResultSet resu = stmt.executeQuery();
            
            while (resu.next()) {
                Docentes docente = new Docentes();

                
                docente.setIdDocente(resu.getInt("iddocente"));
                docente.setRutDocente(resu.getInt("rutDocente"));
                docente.setNombreDocente(resu.getString("nombredocente"));
                docente.setApellidoDocente(resu.getString("spellidodocente"));
                docente.setEspecialidad(resu.getString("especialidad"));
                docente.setPase_docente(resu.getBoolean("pase_docente"));             
                
                lista2.add(docente);
                            
            }
            resu.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al listar");
        }
        return lista2;    
        
        
       
            
            
            
            
        
 
 }   
    
}
