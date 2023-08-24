package org.example.entity;

public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public boolean esAptaParaEdad(int edad) {
        return edad >= edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdadMinima() {
        return edadMinima;
    }
}
