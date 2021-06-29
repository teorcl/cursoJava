package calle.teo.poo.ejercicio4;

public class Alumno {

    /**--Propiedades--**/
    private String nombreAlumno;
    private double nota;
    private int IdAlumnos ;
    private static int IdAlumnoSiguiente = 1;


    /**--Metodos--**/
    public Alumno(String nombreAlumno, double nota){
        this.nombreAlumno = nombreAlumno;
        this.nota = nota;
        IdAlumnos = IdAlumnoSiguiente;
        IdAlumnoSiguiente++;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public String getNombreAlumno(){
        return nombreAlumno;
    }

    public int getIdAlumnos(){
        return IdAlumnos;
    }
    public double getNota(){
        return nota;
    }

}
