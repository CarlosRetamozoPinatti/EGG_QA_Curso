package org.example.entity;

public class EdificioOficinas extends Edificio {
    private int numeroOficinas;
    private int personasPorOficina;
    private int numeroPisos;
    private String nombre;

    public EdificioOficinas(double ancho, double alto, double largo, int numeroOficinas, int personasPorOficina, int numeroPisos, String nombre) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
        this.nombre = nombre;
    }

    @Override
    public double calcularSuperficie() {
        // Suponemos que la superficie del edificio de oficinas es el área total de sus paredes
        // Fórmula genérica para calcular el área de un paralelepípedo: 2 * (largo * ancho + largo * alto + ancho * alto)
        return 2 * (largo * ancho + largo * alto + ancho * alto);
    }

    @Override
    public double calcularVolumen() {
        // Suponemos que el volumen del edificio de oficinas es el volumen del espacio interior
        // Fórmula genérica para calcular el volumen de un paralelepípedo: largo * ancho * alto
        return largo * ancho * alto;
    }

    public void cantPersonas() {
        int totalPersonas = numeroOficinas * personasPorOficina * numeroPisos;
        System.out.println("En un piso caben " + (numeroOficinas * personasPorOficina) + " personas.");
        System.out.println("En todo el edificio caben " + totalPersonas + " personas.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

