package org.example;

import org.example.entity.Perro;
import org.example.entity.Persona;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Max", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Buddy", "Golden Retriever", 2, "Mediano");
        Perro perro3 = new Perro("Negro", "Doberman", 2, "Grande");
        Perro perro4 = new Perro("Malón", "Chihuahua", 1, "Pequeño");
        Perro perro5 = new Perro("Duquesa", "Callejera", 4, "Mediano");

        Persona persona1 = new Persona("Juan", "Perez", 30, 12345678);
        Persona persona2 = new Persona("Maria", "Lopez", 25, 98765432);

        persona1.adoptarPerro(perro1);
        persona1.adoptarPerro(perro3);
        persona1.adoptarPerro(perro5);
        persona2.adoptarPerro(perro2);
        persona2.adoptarPerro(perro4);

        System.out.println("Información de la Persona 1:\n" + persona1.getInformacion() + "\n");
        System.out.println("Información de la Persona 2:\n" + persona2.getInformacion());
    }
    /*
    ESTE EJERCICIO SE RESOLVIO DE MANERA (1 - *) (uno a muchos).
    UNA PERSONA PUEDE ADOPTAR MUCHOS PERROS.
    UN PERRO SOLO PUEDE SER ADOPTADO POR UNA SOLA PERSONA.
     */
}