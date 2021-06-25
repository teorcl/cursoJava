package calle.teo.arrays;

/*Ejercicio 3
* Almacenar aleatorios en array*/

public class EjercicioTresArray {

    public static void main(String[] args) {

        int []array=new int[100];

        for (int i=0;i<array.length;i++){

            //Redondeo a una cifra y multiplico por 10 para obtener un entero y resto parte decimal
            double num = ((double)Math.round(Math.random() * 10d) / 10d)*10-((double)Math.round(Math.random() * 10d) / 10d);
            int num2 = (int)(num*10);
            array[i]=num2;

        }

        for (int coleccion:array) {
            System.out.print(coleccion+" ");
        }

    }

}
