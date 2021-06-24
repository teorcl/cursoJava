package calle.teo.flujo;

public class AnidamientoDeFor {

    public static void main(String[] args) {
        /*For anidados*/
        for (int i = 0; i < 10 ; i++ ){
            for (int j = 0 ; j < 10 ; j++){
                System.out.println("Hola insectos");
                if(j==9) System.out.println("fin ciclo anidado para i = "+i);
            }
        }
    }

}
