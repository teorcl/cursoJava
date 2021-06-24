package calle.teo.ControlFlujo;

import javax.swing.*;

public class EjercicioBucleWhile {

    public static void main(String[] args) {

        int num = (int)Math.random()*100;
        System.out.println(num);
        int intentos = 0;
        int num_user = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 100"));

        while (num_user != num){
            if(num_user>num){
                System.out.println("El número es menor");
            }else {
                System.out.println("El numero es mayor");
            }
            //intentos = intentos+1
            intentos += 1;
            num_user = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 100"));

        }

        System.out.println("Correcto, el número de veces necesarias para adivinar fue "+intentos);

    }

}
