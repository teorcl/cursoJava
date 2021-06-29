package calle.teo.poo.ejercicio3;

import java.util.Random;

public class CuentaCorriente {

    /**Propiedades o campos**/
    private final String nombreTitular;
    private double saldo;
    private long numeroCuenta;

    /**Metodos**/
    //Constructor
    public CuentaCorriente(String nombreTitular, double saldoInicial){

        this.nombreTitular = nombreTitular;
        saldo = saldoInicial;
        /******************************************/
        Random rnd = new Random();                  //Crea #cuenta aleatoria
        numeroCuenta = Math.abs(rnd.nextInt());
        /******************************************/

    }

    /**++--Setters--++**/
    public void setIngreso(double ingreso){
        if (ingreso < 0) System.out.println("Ingreso no válido");
        else saldo += ingreso;

    }

    public void setRetirar(double retiro){
        if(retiro < 0) System.out.println("Valor incorrecto");
        else saldo -= retiro;
    }

    /**Getters**/
    public String getSaldo(){
        return "Saldo actual"+saldo;
    }

    public String getDatosCuentta(){
        return "Titular de la cuenta: "+nombreTitular+"\nnumero de cuenta: "+numeroCuenta+"\nSaldo: "+saldo;
    }

    public static void Transferencia(CuentaCorriente titular1, CuentaCorriente titular2, double cantidad){
        titular1.saldo -= cantidad;
        titular2.saldo += cantidad;
    }



}
