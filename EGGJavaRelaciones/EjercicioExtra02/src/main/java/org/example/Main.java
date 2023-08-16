package org.example;

import org.example.entity.Cine;
import org.example.entity.Pelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Barbie 2 - La Rebelion de Max Steel", 120, 13, "Quentin Tarantino");
        Cine cine = new Cine(pelicula, 10.0);

        cine.ubicarEspectadores(50);
        cine.mostrarSala();
    }
}