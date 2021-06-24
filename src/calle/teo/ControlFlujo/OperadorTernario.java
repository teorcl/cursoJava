package calle.teo.ControlFlujo;

import javax.swing.*;

public class OperadorTernario {

    public static void main(String[] args) {
        /*Determinar cual de dos salarios es mas alto*/
        double salario1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el prrimer salario"));
        double salario2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo salario"));

        double salario_mayor;

        //if(salario1>salario2) salario_mayor=salario1;
        //else salario_mayor=salario2;

        //Operador ternario
        salario_mayor = (salario1>salario2)?salario1:salario2;
        System.out.println("El salario mayor es: "+salario_mayor);

    }

}
