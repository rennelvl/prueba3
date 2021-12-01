/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author renne
 */
public class Alumnos {
    
    private int idAlumno;
    private int rut;
    private String nombre;
    private String apellido;
    private String curso;
    private boolean pase_movilidad;

    public Alumnos() {
    }

    public Alumnos(int idAlumno, int rut, String nombre, String apellido, String curso, boolean pase_movilidad) {
        this.idAlumno = idAlumno;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.pase_movilidad = pase_movilidad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isPase_movilidad() {
        return pase_movilidad;
    }

    public void setPase_movilidad(boolean pase_movilidad) {
        this.pase_movilidad = pase_movilidad;
    }
    
    
}
