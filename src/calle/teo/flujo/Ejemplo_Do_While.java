package calle.teo.flujo;

import javax.swing.*;

public class Ejemplo_Do_While {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Este programa cuenta los caracteres de la palabra o frase introducida \n" +
                "para terminar escribe 'salir'");

        String texto ;

        do{
            texto = JOptionPane.showInputDialog("Introduce el texto");
            JOptionPane.showMessageDialog(null, "El texto introducido tiene "+texto.length()+" caracteres");

        }while (!texto.equals("salir"));

        System.out.println("Has salido del programa");

    }

}
