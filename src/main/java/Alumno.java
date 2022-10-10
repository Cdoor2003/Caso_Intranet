public class Alumno {
    private String nombre;
    private String apellido;
    private String rut;
    private String numeroMatricula;

    public Alumno(String nombre, String apellido, String rut, String numeroMatricula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.numeroMatricula = numeroMatricula;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getRut(){
        return rut;
    }
    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public  String toString(){
        return "Nombre. "+nombre+apellido+" Rut: "+rut+" Matricula: "+numeroMatricula;
    }
}
