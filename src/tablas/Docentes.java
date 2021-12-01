
package tablas;

/**
 *
 * @author renne
 */
public class Docentes {
    
    private int idDocente;
    private int rutDocente;
    private String nombreDocente;
    private String apellidoDocente;
    private String especialidad;
    private boolean pase_docente;

    public Docentes() {
    }

    public Docentes(int idDocente, int rutDocente, String nombreDocente, String apellidoDocente, String especialidad, boolean pase_docente) {
        this.idDocente = idDocente;
        this.rutDocente = rutDocente;
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
        this.especialidad = especialidad;
        this.pase_docente = pase_docente;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public int getRutDocente() {
        return rutDocente;
    }

    public void setRutDocente(int rutDocente) {
        this.rutDocente = rutDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isPase_docente() {
        return pase_docente;
    }

    public void setPase_docente(boolean pase_docente) {
        this.pase_docente = pase_docente;
    }
    
    
    
    
    
    
}
