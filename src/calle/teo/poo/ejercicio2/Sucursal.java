package calle.teo.poo.ejercicio2;

import javax.swing.*;

public class Sucursal {

    //Constructor para dar el estado inicial
    public Sucursal(){

        numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la sucursal"));
        direccion = JOptionPane.showInputDialog("Ingrese la direccion de la sucirsal");
        ciudad = JOptionPane.showInputDialog("Ingrese la ciudad de la sucursal");

    }

    /*+++-----Getters-----+++*/
    public String getDireccion(){
        return "Dirreccion: "+direccion;
    }
    /*-------------------------*/
    public String getCiudad(){
        return "Ciudad: "+ciudad;
    }
    /*-------------------------*/
    public int getNumeroSucursal(){
        return numeroSucursal;
    }
    /*--------------------------*/

    /*+++-----...Setter...-----+++*/
    public static void calcularPrecio(Paquete paquete){

        double precioEnvio = 0;

        if(paquete.getPrioridadEnvio()==0) precioEnvio = (paquete.getPeso())*10;
        else if(paquete.getPrioridadEnvio()==1) precioEnvio = (paquete.getPeso()*10)+10;
        else precioEnvio = (paquete.getPeso()*10)+20;

        System.out.println("El precio de envio del paquete es "+precioEnvio);

    }

    private int numeroSucursal;
    private String direccion;
    private String ciudad;


}
