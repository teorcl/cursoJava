package calle.teo.entradaSalida;
import javax.swing.*;

public class EntradaJOptionPane {

    public static void main(String[] args) {
        //.showInputDialog() Devuelve un String
        String name = JOptionPane.showInputDialog("Introduce tu nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad "));
        System.out.println("Hola "+name+" tienes "+edad+" años");

    }
}
