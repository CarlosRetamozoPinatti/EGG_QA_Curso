package org.example;

import org.example.entity.Animal;
import org.example.entity.Caballo;
import org.example.entity.Gato;
import org.example.entity.Perro;

public class Main {
    public static void main(String[] args) {
        try {
            Perro perro = new Perro("Max", "croquetas", 5, "Labrador");
            Gato gato = new Gato("Miau", "atún", 3, "Siamés");
            Caballo caballo = new Caballo("Rayo", "pasto", 7, "Tiracarro");

            // Intento de crear un animal con edad negativa (generará una excepción)
           // Animal animalInvalido = new Animal("Invalido", "comida", -1, "Raza");

            perro.alimentarse();
            gato.alimentarse();
            caballo.alimentarse();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}