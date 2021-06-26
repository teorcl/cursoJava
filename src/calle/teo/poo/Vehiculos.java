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
    private int ancho;
    private int peso;



}
