package calle.teo.poo;

public class Vehiculos {

    public Vehiculos(){//Medoto constructor de la clase. Mismo noombre de la clase

        //Estado inicial del vehiculo
        ruedas = 4;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";

    }

    //Metodo setter para establecer valores a una propiedad
    public void setColor(){
        color = "azul";
    }

    //Metodo getter para devolver el valor de la prpiedad color
    public String getColor(){
        return color;
    }

    //Propiedades o atributos
    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;



}
