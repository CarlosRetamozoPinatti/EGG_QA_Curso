package org.example.service;

import org.example.entity.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {
    private final Scanner leer;
    private List<Persona> personas;

    public PersonaService(Scanner leer) {
        this.leer = leer;
        personas = new ArrayList<>();
    }

    public void agregarPersona(String nombre, int edad, long dni, String pais) {
        if (buscarPersonaPorDNI(dni) != null) {
            System.out.println("Ya existe una persona con el mismo DNI en la lista.");
            return;
        }
        Persona persona = new Persona(nombre, edad, dni, pais);
        personas.add(persona);
        System.out.println("Registro Exitoso!!");
    }

    public Persona buscarPersonaPorDNI(long dni) {
        return personas.stream()
                .filter(persona -> persona.getDni() == dni)
                .findFirst()
                .orElse(null);
    }

    public long solicitarDNIHuesped() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el DNI del huésped: ");
        return scanner.nextLong();
    }

    public void personasRegistradas() {
        if (personas.isEmpty()) {
            System.out.println("---------------------");
            System.out.println("Todavía no se registraron personas.");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            personas.forEach(System.out::println);
            System.out.println("---------------------");
        }
    }

    public void modificarPersona(long dni, String nuevoNombre, int nuevaEdad, String nuevoPais) {
        Persona personaExistente = buscarPersonaPorDNI(dni);
        if (personaExistente == null) {
            System.out.println("No se encontró ninguna persona con el DNI ingresado.");
            return;
        }
        personaExistente.setNombre(nuevoNombre);
        personaExistente.setEdad(nuevaEdad);
        personaExistente.setPais(nuevoPais);
        System.out.println("Los datos de la persona han sido modificados exitosamente.");
    }

    public void eliminarPersona(long dni) {
        Persona personaExistente = buscarPersonaPorDNI(dni);
        if (personaExistente == null) {
            System.out.println("No se encontró ninguna persona con el DNI ingresado.");
            return;
        }
        personas.remove(personaExistente);
        System.out.println("La persona ha sido eliminada de la lista.");
    }

    private int leerNumero() throws NumberFormatException {
        while (true) {
            if (leer.hasNextInt()) {
                return leer.nextInt();
            } else {
                System.out.println("Entrada no válida. Debe ingresar un número válido.");
                leer.next(); // Limpiar la entrada inválida del Scanner
            }
        }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}

