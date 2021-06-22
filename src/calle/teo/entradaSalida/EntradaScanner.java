package calle.teo.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {
    public static void main(String[] args) {
        //Se crea un objeto de la clase Scanner, pasando parametros al constructor
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre ");
        String nombre = entrada.nextLine();
        /*
        * Tener cuidado con el uso de .nextLine() porque captura es el enter y salta
        * */

        System.out.println("Ingrese un numero ");
        int numero = entrada.nextInt();

        System.out.println("Hola "+nombre);
        System.out.println("El numero es "+numero);

        entrada.close();
    }
}
