package calle.teo.poo;

/*Clase que permite construir objeto tipo vehiculo*/

public class UsoVehiculos {

    //En esta clase no es posible usar nada de lo que se ha declarado privated en la clase Vehiculos (otro fichero)
    //Pero si es posible usar lo que esté declarado como public

    public static void main(String[] args) {

        /*+++Crear un objeto de la clase Vehiculo (otro fichero)+++*/
        Vehiculos miCoche = new Vehiculos(4);

        System.out.println("Antes de usar el metodo setcolor estoy "+miCoche.getColor());

        miCoche.setColor("Amarillo");
        System.out.println("Despues de haber usado setcolor mi color es "+miCoche.getColor());

        Vehiculos miCoche2 = new Vehiculos(4);
        miCoche2.setColor("Rojo");
        miCoche2.setExtra(true,false,true);
        System.out.println(miCoche2.getColor());
        System.out.println(miCoche2.getExtra());

        Vehiculos moto1 = new Vehiculos(2);
        Vehiculos miMoto = new Vehiculos(2, 1, 0.7,200);
        miMoto.setColor("gris");
        Vehiculos miCamion = new Vehiculos(6,3,1.7,1000);
        miCamion.setColor("azul");
        miCamion.setExtra(true,true, true);
        System.out.println(miCamion.getExtra());
        System.out.println(miCamion.getDatosVehiculo());
        System.out.println(miCoche.getDatosVehiculo());
        System.out.println(moto1.getDatosVehiculo());

    }

}
