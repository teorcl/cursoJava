package calle.teo.flujo;

public class Ejemplo_For {

    public static void main(String[] args) {
        /*Imprimir 10 veces hola alumnos*/
        for(int i=0;i<10;i++){
            System.out.println("Hola alumnos");
            System.out.println(i);
            //Salir del bucle cuando i sea igual a 4
            if(i==4) break;
        }
    }

}
