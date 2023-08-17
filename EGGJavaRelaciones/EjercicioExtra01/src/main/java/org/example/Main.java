package org.example;

import org.example.service.AdopcionService;

public class Main {
    public static void main(String[] args) {
        AdopcionService serv = new AdopcionService();
        serv.ejecutarMenu();
    }
}
/*
Composición: La clase Gato contiene objetos de la clase Persona cuando está adoptado.

Asociación Unidireccional: La clase Persona interactúa con objetos de la clase Gato para adoptarlos.

Agregación: La clase Persona contiene una colección de objetos de la clase Gato.

Dependencia: La clase AdopcionService depende de las clases Persona y Gato
para realizar sus operaciones.

Asociación de Clase: Las clases Persona y Gato están asociadas indirectamente
a través de la clase AdopcionService.
 */