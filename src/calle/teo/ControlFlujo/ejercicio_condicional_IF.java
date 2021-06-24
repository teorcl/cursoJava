package calle.teo.ControlFlujo;

/*
* programa que permita calcular el peso ideal de una persona teniendo en cuenta
* lo siguiente:
*
* Si la persona es una mujer, el peso ideal será igual a la altura en cm -120
* Si la persona es un hombre, el peso ideal será igual a la altura en cm -110
*
* El programa pedirá al usuario mediante una ventana emergente de tipo JOptionPane dos datos:
* 1. La altura en cm
* 2. El género, pudiendo ser este hombre o mujer.
* En función de los datos introducidos, el programa imprimirá en consola el peso ideal.
* */

import javax.swing.*;

public class ejercicio_condicional_IF {

    public static void main(String[] args) {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura"));
        String genero = JOptionPane.showInputDialog("Ingrese su genero, hombre o mujer");

        if(genero.equals("mujer")){
            JOptionPane.showMessageDialog(null,"Peso ideal: "+(altura-120));
        }else{
            JOptionPane.showMessageDialog(null,"Peso ideal: "+(altura-110));
        }
    }

}
