package org.example.entity;

public class Gato {
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    private Persona adoptante;

    public Gato(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public boolean estaAdoptado() {
        return adoptante != null;
    }

    public void serAdoptadoPor(Persona persona) {
        adoptante = persona;
    }

    public String getInformacion() {
        String infoGato = "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + " años, Tamaño: " + tamaño;
        if (adoptante != null) {
            infoGato += ", Adoptado por: " + adoptante.nombreCompleto();
        } else {
            infoGato += ", En espera de adopción";
        }
        return infoGato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Persona getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Persona adoptante) {
        this.adoptante = adoptante;
    }
}

