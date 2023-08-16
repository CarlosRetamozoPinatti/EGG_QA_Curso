package org.example.entity;

public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public boolean tieneDinero(double precio) {
        return dinero >= precio;
    }

    public boolean tieneEdadParaVer(Pelicula pelicula) {
        return edad >= pelicula.edadMinima;
    }
}