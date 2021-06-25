package calle.teo.arrays;

import java.util.Scanner;

public class EjercicioUnoArray {

    public static void main(String[] args) {
        /*Ejercicio 1
        * Almacenar en array*/

        int []num = new int[10];
        int posi, nega, cero;
        posi=0;
        nega=0;
        cero=0;
        Scanner in = new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Ingresa en numero en la posicion "+i);
            num[i]=in.nextInt();

            if(num[i]==0) cero +=1;
            if(num[i]>0) posi +=1;
            if(num[i]<0) nega +=1;

        }

        System.out.println("Hay "+cero+" ceros en el array");
        System.out.println("Hay "+posi+" numeros positivos en el array");
        System.out.println("Hay "+nega+" numeros negativos en el array");

       /* for (int numeros:num) {
            System.out.println(numeros);
        }*/


    }

}
