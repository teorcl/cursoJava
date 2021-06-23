package calle.teo.flujo;

import javax.swing.*;

public class Condicional_If_ejemplo3 {

    public static void main(String[] args) {
        /*Evaluar si un alumno tiene beca*/
        int distancia_colegio;
        double renta_familiar;
        byte hermanos_centro;

        distancia_colegio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia de su casa al colegio "));
        renta_familiar = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la renta familiar"));
        hermanos_centro = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el numero de hermanos"));

        if(distancia_colegio > 10 && renta_familiar < 20000 && hermanos_centro >=2 ){
            System.out.println("El alumno tiene beca");
        }else{
            System.out.println("El alumno no tiene beca");
        }
    }

}

