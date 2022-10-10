import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curso {
    private ArrayList<Alumno> listaAlumnos;

    public Curso(){
        this.listaAlumnos = new ArrayList<>();
    }
    public boolean agregarAlumno(String nombre, String apellido, String rut, String nMatricula){
        if(buscarAlumno(nombre,rut) == null) {
            Alumno alumno = new Alumno(nombre, apellido, rut, nMatricula);
            this.listaAlumnos.add(alumno);
            return true;
        }
        else{
            return false;
        }
    }
    public Alumno buscarAlumno(String nombre, String rut ){
        for(Alumno alumno : this.listaAlumnos){
            if(alumno.getNombre().equals(nombre) && alumno.getRut().equals(rut)){
                return alumno;
            }
        }
        return null;
    }
    public boolean eliminarAlumno(String nombre, String rut){
        Alumno alumno= this.buscarAlumno(nombre,rut);
        if(alumno != null){
            this.listaAlumnos.remove(alumno);
            return true;
        }
        else {
            return false;
        }
    }
    public void mostrarAlumnos(){
        for(Alumno alumno : this.listaAlumnos){
            System.out.println(alumno.toString());
        }
    }
}
