package calle.teo.poo.herencia.empleados;

import java.util.GregorianCalendar;

public class UsoEmpleados {

    public static void main(String[] args) {

        Empleados Antonio = new Empleados("Antonio",2300.5,2005,7,15);
        Jefes Ana = new Jefes("Ana",3780.7,2007,9,28);
        Ana.setIncentivo(220.6);
        System.out.println(Ana.getSueldo());


    }

}

class Empleados{

    /**Propiedades o campos**/
    private final String nombre; //Constante de la clase empleado
    private int Id;
    private static int IdSiguiente = 1;
    private double sueldo;
    GregorianCalendar calendario;


    /**Constructor**/
    public Empleados(String name, double sueld, int year, int month, int day){
        nombre = name;
        sueldo = sueld;
        calendario = new GregorianCalendar(year, month, day);
        //Forma como se asigna id consecutivo y automatico para cada objeto nuevo
        Id = IdSiguiente;
        IdSiguiente++;
    }

    /**Metodos**/
    //Setters
    private void setSubeSueldo(double porcentaje){

        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;

    }

    //Getters
    public String getDatosEmpleado(){
        return "EL empleado "+nombre+" con identificacion "+Id;
    }

    public double getSueldo(){
        return sueldo;
    }

    public GregorianCalendar getFechaAlta(){
        return calendario;
    }

    //Acceder a una propiedad private static
    public static String getIdSiguiente(){
        return "El proximo empleado tendrá el id "+IdSiguiente;
    }

}

class Jefes extends Empleados{
    /**Campos o propiedades**/
    private double incentivo;

    /**
     * Constructor
     *
     * @param name
     * @param sueld
     * @param year
     * @param month
     * @param day
     **/
    public Jefes(String name, double sueld, int year, int month, int day) {
        super(name, sueld, year, month, day);
    }

    public void setIncentivo(double pincentivo){
        incentivo = pincentivo;
    }

    public double getSueldo(){
        double sueldoJefe=super.getSueldo();
        return sueldoJefe + incentivo;
    }


}
