package calle.teo.poo;

public class Vehiculos {

    public Vehiculos(int ruedas){//Medoto constructor de la clase. Mismo noombre de la clase

        //Estado inicial del vehiculo
        this.ruedas = ruedas;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";

    }

    /*****************Sobre carga de constructor*******************/
    public Vehiculos(int ruedas, int largo, double ancho, int peso){
        this.ruedas = ruedas;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        color = "sin color";
    }


    public void setExtra(boolean climatizador){
        this.climatizador = climatizador;
    }
    /*---Sobrecarga de metodo---*/
    public void setExtra(boolean climatizador, boolean tapiceria_cuero, boolean gps){
        this.climatizador = climatizador;
        this.tapiceria_cuero = tapiceria_cuero;
        this.gps = gps;


    }

    public String getExtra(){
        if(climatizador && tapiceria_cuero == false && gps == false) return "Tu Vehiculo lleva el pack 1 de extras";
        else if(climatizador && tapiceria_cuero && gps) return "Tu vehiculo lleva el pack 2 de extras";
        else return "Sin pack extras";
    }


    //Metodo setter para establecer valores a una propiedad
    public void setColor(String color){
        this.color = color;
    }


    //Metodo getter para devolver el valor de la prpiedad color
    public String getColor(){
        return color;
    }


    //Metodo getter para devolver los datos del vehiculo
    public String getDatosVehiculo(){
        return "El vehivulo tiene "+ruedas+" ruedas, y un largo de "+largo+" metros";
    }

    //Propiedades o atributos
    private int ruedas;
    private String color;
    private int largo;
    private double ancho;
    private int peso;
    private boolean climatizador;
    private boolean tapiceria_cuero;
    private boolean gps;



}
