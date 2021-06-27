package calle.teo.poo.ejercicio1;

/*Crea una clase capaz de crear cuentas corrientes bancarias*/

import java.util.Random;

public class CuentaCorriente {

    //Metodo constructor
    public CuentaCorriente(String nombreTitular,double saldo){

        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        Random rnd = new Random();
        numeroCuenta = Math.abs(rnd.nextInt());
    }

    //Setters
    public void setIngresos(double ingreso){
        if (ingreso<0) System.out.println("no se permiten ingresos negativos");
        else this.saldo = saldo+ingreso;
    }

    public void setReintegros(double retiro){
        this.saldo -= retiro;
    }

    //Getters
    public double getSaldo(){
        return saldo;
    }

    public String getDatosCuenta(){
        return "Titular "+nombreTitular+" numero de cuenta "+numeroCuenta+" saldo "+saldo;
    }


    /*++--Una pequeña muestra de como interactuan dos objetos de una misma clase--++*/

    //Este metodo trasfiere de la cuenta titula1 a titular2 (dependiendo de la necesidad se invierten los parametros cuando se pasan)
    public static void Transferencia(CuentaCorriente titular1, CuentaCorriente titular2, double cantidad){
        titular1.saldo -= cantidad;
        titular2.saldo += cantidad;
    }

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;


}
