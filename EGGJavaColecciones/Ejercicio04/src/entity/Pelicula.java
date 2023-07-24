package entity;

import java.util.Objects;

public class Pelicula {
    private String titulo;
    private String genero;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Genero: " + genero + ", Duración: " + duracion;
    }
}
