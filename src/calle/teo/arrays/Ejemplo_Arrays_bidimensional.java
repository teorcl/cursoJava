package calle.teo.arrays;

public class Ejemplo_Arrays_bidimensional {

    public static void main(String[] args) {
        /*int [][] numeros = new int[5][3];

        numeros[0][0]=5;
        numeros[0][1]=7;
        numeros[0][2]=8;

        numeros[1][0]=2;
        numeros[1][1]=15;
        numeros[1][2]=19;

        numeros[2][0]=54;
        numeros[2][1]=45;
        numeros[2][2]=85;

        numeros[3][0]=75;
        numeros[3][1]=17;
        numeros[3][2]=67;

        numeros[4][0]=82;
        numeros[4][1]=91;
        numeros[4][2]=4;

        for (int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }*/
        //Forma simplificada
        int [][]numeros = {{5,7,8},
                            {2,15,19},
                            {54,45,85},
                            {75,17,67},
                            {82,91,4}};

        for (int []filas:numeros) {

            for (int columnas:filas) {
                System.out.print(columnas+" ");
            }

            System.out.println();

        }

    }

}
