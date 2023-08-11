package org.example.entity;

import java.util.Random;

public class PistolaAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        this.posicionActual = random.nextInt(6);
        this.posicionAgua = random.nextInt(6);
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6;
    }

    @Override
    public String toString() {
        return "Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua;
    }
}