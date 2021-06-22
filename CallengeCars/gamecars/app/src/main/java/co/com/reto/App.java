package co.com.reto;

import co.com.reto.cargame.domain.ids.JugadorId;
import co.com.reto.cargame.domain.ids.Nombre;
import co.com.reto.cargame.domain.juego.Juego;

import java.awt.Color;
import java.util.Scanner;
import java.util.UUID;


public class App {

    public static void main(String[] args) {
        UUID id;
        int cantidadJugadores;
        String nombreJugador;

        // ---------------------->>>>>
        Juego nuevoJuego = new Juego();

        //Datos jugadores para iniciar el juego 

        //Consulta  cuántos jugadores se quieren crear y se crean dichos jugadores con nombres "jugador"+n
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuántos jugadores desea crear?");
         while(!in.hasNextInt()) in.next();         
        cantidadJugadores = in.nextInt();

        if(cantidadJugadores <= 2){
            throw new IllegalArgumentException("Se debe crear el juego con minimo tres jugadores");
        }

        for (int i = 0; i < cantidadJugadores; i++) {
            id = UUID.randomUUID();
            JugadorId jugadorId = new JugadorId(id);
            nombreJugador = "jugador" + (i + 1);
            Nombre nombre = new Nombre(nombreJugador);
            nuevoJuego.crearJugador(jugadorId, nombre, Color.yellow);
        }

        // Crear pistas
        nuevoJuego.crearPistas();

        // Iniciar el Juego
        nuevoJuego.iniciarJuego();



 
      
        
    }

}
