package calle.teo.arrays;

import java.util.Scanner;

public class Ejemplo_Arrays {

    public static void main(String[] args) {
        //Declaración de un Array
        int[] valores = new int[5];
        int my_valor[] = new int[6];//Esta es otra forma de escribir el array
        int array[]={12,70,9,1500,2};//sintaxis simplificada
        Scanner sc =new Scanner(System.in);

        //Array tipo String
        String []nombres_personas = {"Luna","Luisa","Camila","Natalia"};

        //Rellenar el array de forma poco elegante
        valores[0]=12;
        valores[1]=70;
        valores[2]=9;
        valores[3]=1500;
        valores[4]=2;

        //Rellenar el array de manera elegante
        for(int i=0; i<my_valor.length; i++ ){
            System.out.println("Ingrese un numero ");
            my_valor[i]=sc.nextInt();
        }

        //Mostrar un valor del array(posicion 3 dado que empieza en 0 los indices)
        System.out.println(valores[2]);

        for(int i=0; i<6; i++ ){
            System.out.println("Ingrese un numero ");
            System.out.println(my_valor[i]);
        }
        //Uso del bucle for each
        for(int elemento:valores){
            System.out.println(elemento);
        }

        //Uso del bucle for each con arrays tipo string
        for (String nombres:nombres_personas) {
            System.out.println(nombres);
        }

    }

}
