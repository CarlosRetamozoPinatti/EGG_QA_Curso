package org.example.entity;

import java.util.Random;

public class Cine {
    private Pelicula peliculaEnReproduccion;
    private double precioEntrada;
    private Espectador[][] sala;

    public Cine(Pelicula peliculaEnReproduccion, double precioEntrada) {
        this.peliculaEnReproduccion = peliculaEnReproduccion;
        this.precioEntrada = precioEntrada;
        this.sala = new Espectador[8][6];
    }

    public void ubicarEspectadores(int cantidadEspectadores) {
        Random random = new Random();

        for (int i = 0; i < cantidadEspectadores; i++) {
            String nombre = "Espectador " + (i + 1);
            int edad = random.nextInt(80) + 1; // Edad entre 1 y 80
            double dinero = random.nextDouble() * 100; // Dinero entre 0 y 100

            Espectador espectador = new Espectador(nombre, edad, dinero);
            ubicarEspectador(espectador);
        }
    }

    public void ubicarEspectador(Espectador espectador) {
        Random random = new Random();
        int fila, columna;

        do {
            fila = random.nextInt(8);
            columna = random.nextInt(6);
        } while (sala[fila][columna] != null);

        if (espectador.tieneDinero(precioEntrada) && espectador.tieneEdadParaVer(peliculaEnReproduccion)) {
            sala[fila][columna] = espectador;
        }
    }

    public void mostrarSala() {
        System.out.println("Estado de la sala:");
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                if (sala[fila][columna] != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}