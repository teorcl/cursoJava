package calle.teo.flujo;

/*
* Programa que pregunta cuantos hijos se tienen y en funcion de la respuesta
* nos lanza un mensaje
*
* */

import javax.swing.*;

public class Condicional_switch_ej1 {

    public static void main(String[] args) {

        int hijos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de hijos"));

        switch (hijos){
            case 0:
                System.out.println("Sigue cuidandote");
                break;
            case 1:
                System.out.println("Por algo se empieza");
                break;
            case 2:
                System.out.println("Tienes la pareja");
                break;
            case 3:
                System.out.println("Creo que te estas animando");
                break;
            case 4:
                System.out.println("Ya tienes familia numerosa");
                break;
            default:
                System.out.println("vas a tener que trabajar duro");
        }

    }

}
