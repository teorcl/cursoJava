package calle.teo.poo.ejercicio2;

/*++++------Ejercicio. POO-----++++*/
/*
* Se trata de crear un programa que simule una empresa de envío de paquetes. Dicha empresa tiene varias sucursales y puede enviar
* paquetes con diferente peso y diferente prioridad.
*
* */

import javax.swing.*;

public class Uso_Sucursal_y_Paquetes {

    public static void main(String[] args) {

        int numPaquetes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de paquetes a enviar"));

        Sucursal miSucursal = new Sucursal();
        Paquete misPaquetes[] = new Paquete[numPaquetes];

        for (int i = 0; i < numPaquetes; i++){
            JOptionPane.showMessageDialog(null,"Datos del paquete "+(i+1));
            misPaquetes[i] = new Paquete();
            String decision1 = JOptionPane.showInputDialog("Desea cambiar la prioridad del paquete "+(i+1)+" ingrese si o no");
            if("si".equals(decision1)) misPaquetes[i].setPrioridadEnvio();

            String decision2 = JOptionPane.showInputDialog("Desea cambiar el peso del paquete "+(i+1)+" ingrese si o no");
            if ("si".equals(decision2)) misPaquetes[i].setPeso();

            JOptionPane.showMessageDialog(null,"Paquete "+(i+1)+" finalizado");

        }



        System.out.println("El numero de la sucursal: "+miSucursal.getNumeroSucursal());
        System.out.println("Direccion de la sucursal: "+miSucursal.getDireccion());
        System.out.println("Ciudad de la sucursal: "+miSucursal.getCiudad());

        System.out.println();

        for (int j=0 ; j< numPaquetes; j++){
            System.out.println("Referencia del paquete "+(j+1)+" :"+misPaquetes[j].getRefenciaEnvio());
            System.out.println("El peso del paquete "+(j+1)+" : "+misPaquetes[j].getPeso());
            System.out.println("La prioridad del paquete "+(j+1)+" : "+misPaquetes[j].getPrioridadEnvio());
            Sucursal.calcularPrecio(misPaquetes[j]);
            System.out.println();
        }




    }

}
