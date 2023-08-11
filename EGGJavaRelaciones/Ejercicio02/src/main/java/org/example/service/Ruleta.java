package org.example.service;

import org.example.entity.Juego;
import org.example.entity.Jugador;
import org.example.entity.PistolaAgua;

import java.util.ArrayList;

public class Ruleta {
    public void jugar() {
        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Aca agregamos los jugadores
        int numJugadores = 6; // Puedes cambiar el número de jugadores aquí
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        // Cargamos el arma
        PistolaAgua revolver = new PistolaAgua();
        revolver.llenarRevolver();

        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }
}
