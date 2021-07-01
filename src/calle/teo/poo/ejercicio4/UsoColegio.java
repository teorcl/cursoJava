package calle.teo.poo.ejercicio4;

import com.company.Main;

public class UsoColegio {

    public static void main(String[] args) {

        Colegio agricola = new Colegio("Agricola",200);
        agricola.nuevoAlumno("Juan",4.5);
        agricola.nuevoAlumno("Esteban",5.9);
        agricola.getDatosAlumno("Juan");
        agricola.setNotaMedia("Juan",9);
        //agricola.expulsaAlumno("Esteban");
        //agricola.getTodosAlumnos();

    }

}
