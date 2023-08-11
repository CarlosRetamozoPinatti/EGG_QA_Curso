package org.example.entity;

public class Jugador {
    private static int countId = 1;
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = countId++;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(PistolaAgua r) {
        if (!mojado && r.mojar()) {
            mojado = true;
            return true;
        }
        r.siguienteChorro();
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return nombre + (mojado ? " mojado" : " seco");
    }
}
