package org.example;

import org.example.entity.Alumno;
import org.example.entity.Simulador;
import org.example.entity.Voto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Simulador s = new Simulador();
        List<Alumno> alumnos = s.generarAlumnos();
        List<Voto> votos = s.votacion(alumnos);

        s.mostrarAlumnos(alumnos);
        System.out.println();

        s.mostrarVotos(votos);
        System.out.println();

        System.out.println(s.recuentoVotos(alumnos) + " votos efectivos de " + alumnos.size() * 3 + " votos totales");
        System.out.println();

        List<Alumno> facilitadores = s.getFacilitadores(alumnos);
        s.mostrarFacilitadores(facilitadores);
    }
}

/*
Clase Alumno:

Relación con Voto: La clase Alumno está relacionada con la clase Voto a través de la asociación 1 a muchos.
Un alumno puede tener varios votos emitidos por él.
Relación con Simulador: La clase Alumno está relacionada con la clase Simulador a través de métodos de generación,
votación y conteo de votos.

Clase Voto:

Relación con Alumno: La clase Voto está relacionada con la clase Alumno a través de una asociación uno a uno.
Cada voto se asocia con un único alumno que emitió el voto.
Relación con Simulador: La clase Voto está relacionada con la clase Simulador a través del método de votación.

Clase Simulador:

Relación con Alumno: La clase Simulador está relacionada con la clase Alumno a través de métodos de generación,
votación y conteo de votos.
Relación con Voto: La clase Simulador está relacionada con la clase Voto a través del método de votación.

La clase Simulador actúa como el controlador principal que coordina la generación de alumnos,
la simulación de votación, el recuento de votos y la identificación de facilitadores.
Los objetos Alumno representan a los participantes que emiten votos,
y los objetos Voto registran la información de los votos emitidos por los alumnos.
Cada clase tiene métodos que permiten interactuar y realizar operaciones en conjunto para simular el proceso de votación
y determinar los facilitadores.
 */