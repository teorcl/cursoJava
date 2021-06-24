package calle.teo.flujo;

import javax.swing.*;

public class EjemploWhile1 {

    public static void main(String[] args) {
        String clave = "Teodoro";
        String acceso ="";

        while(!clave.equals(acceso)){
            acceso = JOptionPane.showInputDialog("Ingrese la clave nuevamente");
            if(!clave.equals(acceso)) System.out.println("Clave incorrecta");
        }

        System.out.println("Bienvenido a la zona de usuarios");
    }

}
