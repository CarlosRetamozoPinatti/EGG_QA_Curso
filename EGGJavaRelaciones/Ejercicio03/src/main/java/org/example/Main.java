package org.example;

import org.example.service.Juego;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.jugar();
    }
}
/*
Carta está contenido en Baraja en una relación de composición.
Baraja contiene varias Cartas.
Baraja es utilizada por Juego en una relación de uso.
Juego utiliza varias Cartas.
 */