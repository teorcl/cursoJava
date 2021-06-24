package calle.teo.ControlFlujo;

/*Aprendiendo el uso de if anidados*/

import javax.swing.*;

public class Anidamiento_IF {

    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));

        if(edad >= 18){
            String carnet = JOptionPane.showInputDialog("Tienes Carnet ?");
            if(carnet.equals("si")) JOptionPane.showInternalMessageDialog(null, "Puedes comprar el coche");
                //System.out.println("Puedes comprar el coche");
                //Mostrar salida en una venatana emergente.


            else{
                JOptionPane.showInternalMessageDialog(null, "Sin carnet no hay coche");
            }
        }else JOptionPane.showInternalMessageDialog(null, "Si eres menor no puedes tener carnet ni coche");


    }

}
