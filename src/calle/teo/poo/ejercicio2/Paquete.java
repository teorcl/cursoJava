package calle.teo.poo.ejercicio2;

import javax.swing.*;

public class Paquete {

    public Paquete(){
        boolean valido = false;
        this.refenciaEnvio = Integer.parseInt(JOptionPane.showInputDialog("Digita la referencia de envio"));
        this.peso = Double.parseDouble(JOptionPane.showInputDialog("Digita el peso"));

        this.DNIRemitente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DNI del remitente"));
        do {//Validar el error al cambiar de decision
            this.prioridadEnvio = Integer.parseInt(JOptionPane.showInputDialog("Digita la prioridad 0, 1 y 2 (Normal, Alta, Urgente)"));
            if(prioridadEnvio>=0 && prioridadEnvio<=2) valido = true;
            else JOptionPane.showMessageDialog(null,"prioridad no valida");

        }while (valido == false);
    }

    /*+++-----Setters----+++*/
    public void setPeso(){

        //Metodo para modificar el peso si se desea
        peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso nuevo"));

    }
    /*---------------------*/
    public void setPrioridadEnvio(){

        boolean valido = false;

        do {
            this.prioridadEnvio = Integer.parseInt(JOptionPane.showInputDialog("Digita la prioridad 0, 1 y 2 (Normal, Alta, Urgente)"));
            if(prioridadEnvio>=0 && prioridadEnvio<=2) valido = true;
            else JOptionPane.showMessageDialog(null,"prioridad no valida");

        }while (valido == false);

    }

    /*-----------+++++Getters+++++-----------*/
    public double getPeso(){
        return peso;
    }
    /*--------------------------------------*/
    public int getPrioridadEnvio(){
        return prioridadEnvio;
    }
    /*---------------------------------------*/
    public int getRefenciaEnvio(){
        return refenciaEnvio;
    }

    /*Campos o propiedades*/
    private int refenciaEnvio;
    private double peso;
    private int prioridadEnvio;
    private int DNIRemitente;


}
