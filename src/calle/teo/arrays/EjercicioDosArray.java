package calle.teo.arrays;

/*Ejercicio 2
* Media en posiciones pares del array*/

import java.util.Scanner;

public class EjercicioDosArray {

    public static void main(String[] args) {

        int []num = new int[10];
        int media=0;
        int contador=0;

        Scanner in = new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.println("Ingresa en numero en la posicion "+i);
            num[i]=in.nextInt();

            if(i%2==0){
                media += num[i];
                contador +=1;
            }

        }

        System.out.println("La madia en las posiciones pares es "+media/contador);

    }

}
