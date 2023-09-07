package org.example;

import org.example.entity.Edificio;
import org.example.entity.EdificioOficinas;
import org.example.entity.Polideportivo;

import java.util.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Agregar dos polideportivos
        edificios.add(new Polideportivo(20.0, 30.0, 40.0, "Polideportivo A", "Techado"));
        edificios.add(new Polideportivo(25.0, 35.0, 45.0, "Polideportivo B", "Abierto"));

        // Agregar dos edificios de oficinas
        edificios.add(new EdificioOficinas(15.0, 25.0, 35.0, 10, 15, 5, "Edificio 1"));
        edificios.add(new EdificioOficinas(18.0, 28.0, 38.0, 12, 20, 6, "Edificio 2"));

        // Calcular y mostrar la superficie y el volumen de cada edificio
        for (Edificio edificio : edificios) {
            String tipoEdificio = edificio instanceof Polideportivo ? "Polideportivo" : "Edificio de Oficinas";
            String nombreEdificio = edificio instanceof Polideportivo ? ((Polideportivo) edificio).getNombre() : ((EdificioOficinas) edificio).getNombre();

            double superficie = edificio.calcularSuperficie();
            double volumen = edificio.calcularVolumen();

            System.out.println("Tipo: " + tipoEdificio);
            System.out.println("Nombre: " + nombreEdificio);
            System.out.println("Superficie del edificio: " + superficie);
            System.out.println("Volumen del edificio: " + volumen);
            System.out.println();
        }

        // Mostrar la cantidad de personas en los edificios de oficinas
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioOficinas) {
                String nombreEdificio = ((EdificioOficinas) edificio).getNombre();
                System.out.println("Nombre del Edificio de Oficinas: " + nombreEdificio);
                ((EdificioOficinas) edificio).cantPersonas();
                System.out.println();
            }
        }

        // Contar polideportivos techados y abiertos
        int techados = 0;
        int abiertos = 0;
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                if (((Polideportivo) edificio).getTipoInstalacion().equals("Techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
            }
        }

        System.out.println("Polideportivos techados: " + techados);
        System.out.println("Polideportivos abiertos: " + abiertos);
    }
}
