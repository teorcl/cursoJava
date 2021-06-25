package com.company;

import java.text.DecimalFormat;

public class Pruebas {

    public static void main(String[] args) {
        String caracter = "@";

        System.out.println("@"==caracter);
        int[] my_array = new int[5];

        //Util para recorrerlo
        System.out.println(my_array.length);

        DecimalFormat twodeci = new DecimalFormat("#.0");

        for (int i=0; i<100;i++) {
           double num= (double)Math.round(Math.random() * 10d) / 10d;
           double num2 = num*10-((double)Math.round(Math.random() * 10d) / 10d);
            System.out.println(num2);
        }//System.out.println(twodeci.format(Math.random()));

    }

}
