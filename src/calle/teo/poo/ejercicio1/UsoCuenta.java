package calle.teo.poo.ejercicio1;

import javax.sound.midi.Soundbank;

public class UsoCuenta {

    public static void main(String[] args) {

        CuentaCorriente Cuenta1 = new CuentaCorriente("Pedro Correa",2780.7);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Luis Perez",45908.6);

        CuentaCorriente.Transferencia(Cuenta1,Cuenta2,200);
        System.out.println(Cuenta1.getDatosCuenta());
        System.out.println(Cuenta2.getDatosCuenta());

    }

}
