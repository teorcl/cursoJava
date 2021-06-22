package calle.teo.entradaSalida;
import java.util.*;

/*Ejercicio 1: Entrada/Salida

* Crea una clase con el nombre de RaizScanner. Al ejecutar el programa nos debe pedir introducir un nº por consola.
* Después de introducir el nº y pulsar ENTER, el programa devuelve en consola
* a raíz cuadrada del número
*
* */



public class RaizScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = in.nextInt();
        System.out.println("La raiz de "+num+" es "+Math.sqrt(num));

        in.close();
    }
}
