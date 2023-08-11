package org.example;

import org.example.service.Ruleta;

public class Main {
    public static void main(String[] args) {
        Ruleta ruleta = new Ruleta();
        ruleta.jugar();
    }
}

/*
 - PistolaAgua se asocia con Jugador ya que los jugadores disparan la pistola.
 - Jugador está agregado en Juego, ya que un juego contiene varios jugadores.
 - PistolaAgua está agregada en Juego, ya que un juego contiene una pistola de agua.
 - Ruleta compone Juego, ya que una ruleta crea y contiene un juego.
 */
