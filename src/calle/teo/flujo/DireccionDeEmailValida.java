package calle.teo.flujo;

/*En este ejercicio se pide al usuario que introduzca su dirección de email con ayuda de la clase JOptionPane.

Una vez introducido el email, el programa debe decir si la dirección de email es correcta o no teniendo en cuenta los siguientes requisitos:

Debe tener una @
No debe tener más de una @
Debe tener un punto
La dirección de email debe tener al menos 4 caracteres.
El programa pedirá introducir indefinidamente la dirección de email si no es correcta o si tienes menos de 4 caracteres.*/

import javax.swing.*;

public class DireccionDeEmailValida {

    public static void main(String[] args) {

        int cont_a = 0;
        int cont_pun = 0;

        String correo = JOptionPane.showInputDialog("Ingrese su dirección de correo electrónico");


        //Se valida la cantidad de caracteres del correo
        while( (correo.length() < 4) || (cont_a >1) || (cont_pun < 1)) {
            cont_a = 0;//Para reiniciar el conteo de las @
            cont_pun = 0;
            correo = JOptionPane.showInputDialog("Ingrese su dirección de correo electrónico nuevamente");

            for(int i = 0; i < correo.length(); i++){
                if('@' == correo.charAt(i)) cont_a += 1;
                if('.'==correo.charAt(i)) cont_pun += 1;
            }

        }

        System.out.println("La dirección de correo "+correo+" es correcta");

    }

}
