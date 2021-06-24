package calle.teo.ControlFlujo;

/*Uso del else if*/

import javax.swing.*;

public class Condicional_If_ejemplo2 {

    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        if(edad < 18){
            System.out.println("Eres muy joven");
        }else if(edad < 40){
            System.out.println("Eres joven");
        }else if(edad < 65){
            System.out.println("Eres maduro");
        }else{
            System.out.println("Cuidate");
        }

    }
}
