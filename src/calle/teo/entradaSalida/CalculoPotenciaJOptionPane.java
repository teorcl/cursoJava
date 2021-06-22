package calle.teo.entradaSalida;
/*Al ejecutar el programa nos debe pedir introducir dos valores numéricos,
 utilizando una ventana de tipo showInputDialog:
Una base
Un exponente
Una vez introducidos los dos valores,
el programa mostrará en consola el resultado de elevar la base al exponente*/

import javax.swing.*;

public class CalculoPotenciaJOptionPane {
    public static void main(String[] args) {
        double base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        double exponente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));

        System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+Math.pow(base, exponente));
    }
}
