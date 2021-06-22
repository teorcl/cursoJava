package calle.teo.flujo;

import javax.swing.*;

public class Condicional_If_ejemplo1 {

    public static void main(String[] args) {
        /*Evaluar si una persona es mayor de edad o no*/

        int edad;

        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        if(edad >= 18){
            System.out.println("Eres mayor de edad, puedes pasar");
        }else{
            System.out.println("Eres menor de edad, no puedes pasar");
        }
    }
}
