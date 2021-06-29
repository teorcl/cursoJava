package calle.teo.poo;

public class UsoEmpleados {

    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Camilo");
        Empleados empleado2 = new Empleados("Pedrito");
        Empleados miEmpleado = new Empleados("Teodoro");

        System.out.println(empleado1.getDatosEmpleado());

        empleado1.setSeccion("RRHH");
        System.out.println(empleado1.getDatosEmpleado());
        System.out.println(empleado2.getDatosEmpleado());
        System.out.println(miEmpleado.getDatosEmpleado());
        System.out.println(Empleados.getIdSiguiente());



    }

}

/**-----------------------------------------**/

class Empleados{

    /**Propiedades**/
    private final String nombre; //Constante de la clase empleado
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;

    /**Constructor**/
    public Empleados(String nombre){
        this.nombre = nombre;
        seccion = "Administracion"; //Asumiendo que todos deben pasar primero por esa seccion

        //Forma como se asigna id consecutivo y automatico para cada objeto nuevo
        Id = IdSiguiente;
        IdSiguiente++;
    }

    /**Metodos**/
    //Setters
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }

    //Getters
    public String getDatosEmpleado(){
        return "EL empleado "+nombre+" pertenece a la seccion "+seccion+" con identificacion "+Id;
    }

    //Acceder a una propiedad private static
    public static String getIdSiguiente(){
        return "El proximo empleado tendrá el id "+IdSiguiente;
    }

}