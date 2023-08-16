package org.example;

import org.example.entity.Gato;
import org.example.entity.Persona;

public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona("Juan", "Perez", 30, 123456);
        Persona persona2 = new Persona("Maria", "Gomez", 25, 789012);

        // Crear perros
        Gato gato1 = new Gato("Misha", "Callejera", 3, "Mediano");
        Gato gato2 = new Gato("Luna", "Siamés", 2, "Pequeño");
        Gato gato3 = new Gato("Tom", "Negro y Blanco", 5, "Grande");

        // Personas eligen perros para adoptar
        persona1.adoptarPerro(gato1);
        persona2.adoptarPerro(gato2);
        persona1.adoptarPerro(gato3); // Intentar adoptar un perro ya adoptado
        persona2.adoptarPerro(gato1); // Intentar adoptar el mismo perro

        // Mostrar información de las personas y sus perros adoptados
        System.out.println(persona1.getInformacion());
        System.out.println("--------------------------");
        System.out.println(persona2.getInformacion());
    }
}
