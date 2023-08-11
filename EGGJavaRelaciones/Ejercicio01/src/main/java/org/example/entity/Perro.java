package org.example.entity;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    private Persona adoptante;

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public void serAdoptadoPor(Persona persona) {
        adoptante = persona;
    }

    public String getInformacion() {
        String informacionPerro = "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + " años, Tamaño: " + tamaño;
        if (adoptante != null) {
            informacionPerro += ", Adoptado por: " + adoptante.nombreCompleto();
        } else {
            informacionPerro += ", En espera de adopción";
        }
        return informacionPerro;
    }
}

