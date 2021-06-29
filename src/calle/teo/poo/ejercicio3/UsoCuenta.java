package calle.teo.poo.ejercicio3;

/**Segundo ejercicio de cuenta corriente**/

public class UsoCuenta {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("Lius Correa",2896.9);
        CuentaCorriente cuenta2 = new CuentaCorriente("Estaban Perez", 13459.5);

        CuentaCorriente.Transferencia(cuenta1,cuenta2,1543.2);

        System.out.println(cuenta1.getDatosCuentta());
        System.out.println();
        System.out.println(cuenta2.getDatosCuentta());

    }

}
