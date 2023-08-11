package org.example.entity;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private PistolaAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, PistolaAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda() {
        System.out.println("Se inicia la ronda!");

        int jugadorActual = 0;
        boolean alguienMojado = false;

        while (!alguienMojado) {
            Jugador jugador = jugadores.get(jugadorActual);
            System.out.println("Turno de " + jugador.getNombre() + "...");

            alguienMojado = jugador.disparo(revolver);

            if (!alguienMojado) {
                System.out.println("El jugador " + jugador.getNombre() + " se ha salvado!");
            }

            jugadorActual = (jugadorActual + 1) % jugadores.size();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("¡Alguien se ha mojado!");

        for (Jugador jugador : jugadores) {
            if (jugador.isMojado()) {
                System.out.println(jugador.getNombre() + " se mojó.");
            }
        }
    }
}
