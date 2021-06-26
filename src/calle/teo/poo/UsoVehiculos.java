package calle.teo.poo;

/*Clase que permite construir objeto tipo vehiculo*/

public class UsoVehiculos {

    //En esta clase no es posible usar nada de lo que se ha declarado privated en la clase Vehiculos (otro fichero)
    //Pero si es posible usar lo que esté declarado como public

    public static void main(String[] args) {

        /*+++Crear un objeto de la clase Vehiculo (otro fichero)+++*/
        Vehiculos miCoche = new Vehiculos();

        System.out.println("Antes de usar el metodo setcolor estoy "+miCoche.getColor());

        miCoche.setColor();
        System.out.println("Despues de haber usado setcolor mi color es "+miCoche.getColor());

    }

}
