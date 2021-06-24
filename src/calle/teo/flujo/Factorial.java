package calle.teo.flujo;

/*Ejercicio 2. Número factorial:

En este ejercicio, se pide el cálculo del factorial de un número introducido por el usuario desde una ventana JOptionPane.
El factorial de un número es igual a ese número multiplicado por todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.

 */

import javax.swing.*;

public class Factorial {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para conocer su factorial"));
        int factorial=1;

        if(num == 0){
            System.out.println("El factorial de "+num+" es 1");
        }else if(num<0){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número para conocer su factorial"));
        }else{
            for(int i=1; i <= num; i++){
                factorial *=i;
            }
        }

        System.out.println("El factorial de "+num+" es "+factorial);

    }

}
