package org.example.service;

import java.util.*;

import org.example.entity.*;

public class AdopcionService {
    private Set<Persona> personas;
    private Set<Gato> gatos;

    public AdopcionService() {
        personas = new HashSet<>();
        gatos = new HashSet<>();
    }

    public void ejecutarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n=== Menú de Adopción ===");
            System.out.println("1. Dar de alta una persona");
            System.out.println("2. Dar de alta un gato");
            System.out.println("3. Adoptar un gato");
            System.out.println("4. Ver personas con gatos adoptados");
            System.out.println("5. Ver todos los gatos y su estado de adopción");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    darDeAltaPersona();
                    break;
                case 2:
                    darDeAltaGato();
                    break;
                case 3:
                    adoptarGato();
                    break;
                case 4:
                    verPersonasConGatosAdoptados();
                    break;
                case 5:
                    verTodosLosGatos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }

    private void darDeAltaPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Dar de alta una persona ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Documento: ");
        int documento = scanner.nextInt();
        personas.add(new Persona(nombre, apellido, edad, documento));
        System.out.println("Persona agregada con éxito.");
    }

    private void darDeAltaGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Dar de alta un gato ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Raza: ");
        String raza = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tamaño: ");
        String tamaño = scanner.nextLine();
        gatos.add(new Gato(nombre, raza, edad, tamaño));
        System.out.println("Gato agregado con éxito.");
    }

    private void adoptarGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Adoptar un gato ===");
        System.out.print("Ingrese el nombre de la persona adoptante: ");
        String nombrePersona = scanner.nextLine();
        Persona adoptante = buscarPersonaPorNombre(nombrePersona);

        if (adoptante == null) {
            System.out.println("Persona no encontrada.");
            return;
        }

        System.out.print("Ingrese el nombre del gato a adoptar: ");
        String nombreGato = scanner.nextLine();
        Gato gato = buscarGatoPorNombre(nombreGato);

        if (gato == null) {
            System.out.println("Gato no encontrado.");
            return;
        }

        adoptante.adoptarGato(gato);
        System.out.println("Gato adoptado por " + adoptante.nombreCompleto());
    }

    private Persona buscarPersonaPorNombre(String nombre) {
        for (Persona persona : personas) {
            if (persona.nombreCompleto().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }

    private Gato buscarGatoPorNombre(String nombre) {
        for (Gato gato : gatos) {
            if (gato.getNombre().equalsIgnoreCase(nombre)) {
                return gato;
            }
        }
        return null;
    }

    private void verPersonasConGatosAdoptados() {
        System.out.println("\n=== Personas con Gatos Adoptados ===");
        for (Persona persona : personas) {
            System.out.println(persona.getInformacion());
        }
    }

    private void verTodosLosGatos() {
        System.out.println("\n=== Todos los Gatos ===");
        gatos.forEach(gato -> {
            String estadoAdopcion = gato.estaAdoptado() ? "Adoptado por " + gato.getAdoptante().nombreCompleto() : "En espera de adopción";
            System.out.println(gato.getInformacion() + ", Estado de Adopción: " + estadoAdopcion);
        });
    }
}
