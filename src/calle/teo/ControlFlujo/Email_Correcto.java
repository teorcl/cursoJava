package calle.teo.ControlFlujo;

import javax.swing.*;

public class Email_Correcto {

    public static void main(String[] args) {
        //Solucion por Juan del ejercicio del correo

        boolean valido = false;

        do{
            String email = JOptionPane.showInputDialog("Ingrese su correo electónico");
            int arroba = 0;
            boolean punto = false;

            for(int i=0; i < email.length(); i++){

                if(email.charAt(i)=='@') arroba ++;
                if(email.charAt(i)=='.') punto = true;

            }

            if(arroba==1 && punto==true && email.length()>=4) valido=true;
            else JOptionPane.showMessageDialog(null,"email no valido");

        }while (valido == false);

        System.out.println("Email valido");

    }

}
