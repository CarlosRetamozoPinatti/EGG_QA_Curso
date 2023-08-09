package org.example.service;

import org.example.entity.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Persona> personas;

    public PersonaService(){
        personas = new ArrayList<>();
    }
    public void agregarPersona(){
        System.out.println("Ingrese el nombre completo de la persona: ");
        String nombre = leer.next().toLowerCase().trim();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = Integer.parseInt(leer.next().trim());
        System.out.println("Ingrese el numero de DNI de la persona, sin puntos ni espacios: ");
        long dni = Long.parseLong(leer.next().trim());
        if (buscarPersonaPorDNI(dni) != null) {
            System.out.println("Ya existe una persona con el mismo DNI en la lista.");
            return;
        }
        System.out.println("Ingrese el pais de origen de la persona: ");
        String pais = leer.next().toLowerCase().trim();
        Persona persona = new Persona(nombre, edad, dni, pais);
        personas.add(persona);
        System.out.println("Registro Exitoso!!");
    }

    private Persona buscarPersonaPorDNI(long dni) {
        List<Persona> personasConDNI = personas.stream()
                .filter(persona -> persona.getDni() == dni)
                .toList();
        if (!personasConDNI.isEmpty()) {
            return personasConDNI.get(0);
        } else {
            return null;
        }
    }

    public void personasRegistradas(){
        if (personas.isEmpty()){
            System.out.println("---------------------");
            System.out.println("Todavia no se registraron personas.");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            System.out.println(personas);
            System.out.println("---------------------");
        }
    }

    public void modificarPersona() {
        System.out.println("Ingrese el DNI de la persona que desea modificar: ");
        long dni = Long.parseLong(leer.next().trim());
        Persona personaExistente = buscarPersonaPorDNI(dni);
        if (personaExistente == null) {
            System.out.println("No se encontró ninguna persona con el DNI ingresado.");
            return;
        }
        System.out.println("Ingrese el nuevo nombre completo de la persona: ");
        String nuevoNombre = leer.next().toLowerCase().trim();
        System.out.println("Ingrese la nueva edad de la persona: ");
        int nuevaEdad = Integer.parseInt(leer.next().trim());
        System.out.println("Ingrese el nuevo pais de origen de la persona: ");
        String nuevoPais = leer.next().toLowerCase().trim();
        // Modificar los datos de la persona existente
        personaExistente.setNombre(nuevoNombre);
        personaExistente.setEdad(nuevaEdad);
        personaExistente.setPais(nuevoPais);
        System.out.println("Los datos de la persona han sido modificados exitosamente.");
    }

    public void eliminarPersona() {
        System.out.println("Ingrese el DNI de la persona que desea eliminar: ");
        long dni = Long.parseLong(leer.next().trim());
        Persona personaExistente = buscarPersonaPorDNI(dni);
        if (personaExistente == null) {
            System.out.println("No se encontró ninguna persona con el DNI ingresado.");
            return;
        }
        personas.remove(personaExistente);
        System.out.println("La persona ha sido eliminada de la lista.");
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
