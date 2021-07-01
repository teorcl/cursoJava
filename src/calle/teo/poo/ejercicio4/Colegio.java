package calle.teo.poo.ejercicio4;

import java.util.ArrayList;

public class Colegio {

    /**--Propiedades o campos--**/
    private static String nombreColegio;
    private int numAlumnos;
    private ArrayList<Alumno>listaAlumnos =new ArrayList<Alumno>();


    /**--Metodos--**/
    //Constructor
    public Colegio(String nombreColegio, int numAlumnos){
        this.nombreColegio = nombreColegio;
        this.numAlumnos = numAlumnos;

    }

    //Setter
    public void nuevoAlumno(String nombreAlumno, double nota){
        listaAlumnos.add(new Alumno(nombreAlumno,nota));
    }

    //Getter
    public static String getNombreColegio(){
        return nombreColegio;
    }

    public void getTodosAlumnos(){
        for (Alumno e:listaAlumnos) {
            System.out.println("Nombre alumno: "+e.getNombreAlumno());
            System.out.println("# alumno: "+e.getIdAlumnos());
            System.out.println("Colegio: "+ Colegio.getNombreColegio());
            System.out.println("Nota media: "+e.getNota());
            System.out.println();
        }
    }

    public void getDatosAlumno(String nombre){
        /*boolean encontrado = false;
        int i = 0;

        while (encontrado == false && i < listaAlumnos.size()){
            if(listaAlumnos.get(i).getNombreAlumno().compareToIgnoreCase(nombre)==0){
                encontrado = true;
            }else i++;
        }
        if(encontrado){
            System.out.println("Nombre alumno: "+listaAlumnos.get(i).getNombreAlumno());
            System.out.println("# alumno: "+listaAlumnos.get(i).getIdAlumnos());
            System.out.println("Colegio: "+ Colegio.getNombreColegio());
            System.out.println("Nota media: "+listaAlumnos.get(i).getNota());
            System.out.println();
            return false;
        }else return true;*/

        System.out.println( "Nombre alumno: "+listaAlumnos.get(getBuscarNombre(nombre)).getNombreAlumno()+
                "\n# alumno: "+listaAlumnos.get(getBuscarNombre(nombre)).getIdAlumnos()+
                "\nColegio: "+ Colegio.getNombreColegio()+
                "Nota media: "+listaAlumnos.get(getBuscarNombre(nombre)).getNota());
        System.out.println();
    }

    public void expulsaAlumno(String nomAlumnoAxpulsar){
        /*************************/
        listaAlumnos.remove(getBuscarNombre(nomAlumnoAxpulsar));
        /*boolean encontrado = false;
        int i = 0;

        while (encontrado == false && i < listaAlumnos.size()){
            if(listaAlumnos.get(i).getNombreAlumno().compareToIgnoreCase(nomAlumnoAxpulsar)==0){
                encontrado = true;
            }else i++;
        }
        if(encontrado){
            listaAlumnos.remove(i);
            return false;
        }else return true;*/

        /************************/
    }

    public void setNotaMedia(String nombre, double nota){
        /*************************/
        listaAlumnos.get(getBuscarNombre(nombre)).setNota(nota);

        /*boolean encontrado = false;
        int i = 0;

        while (encontrado == false && i < listaAlumnos.size()){
            if(listaAlumnos.get(i).getNombreAlumno().compareToIgnoreCase(nombre)==0){
                encontrado = true;
            }else i++;
        }
        if(encontrado){
            listaAlumnos.get(i).setNota(nota);

        }*/

        /************************/
    }

    public int getBuscarNombre(String nombre){
        //Corregir cuando no lo encuentra dado que i=0
        boolean encontrado = false;
        int i = 0;

        while (encontrado == false && i < listaAlumnos.size()){
            if(listaAlumnos.get(i).getNombreAlumno().compareToIgnoreCase(nombre)==0){
                encontrado = true;
            }else i++;
        }
        if(encontrado) {
            encontrado = false;
            return i;
        }else {
            encontrado = true;
            return i;
        }

    }



}
