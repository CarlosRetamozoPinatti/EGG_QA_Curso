package org.example.entity;

import java.util.*;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Set<Gato> gatosAdoptados;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.gatosAdoptados = new HashSet<>();
    }

    public boolean haAdoptadoPerro(Gato gato) {
        return gatosAdoptados.contains(gato);
    }

    public void adoptarGato(Gato gato) {
        if (!gato.estaAdoptado()) {
            gatosAdoptados.add(gato);
            gato.serAdoptadoPor(this); // Se Informa que el gato ha sido adoptado por esta persona
        } else {
            System.out.println("El gato " + gato.getInformacion() + " ya ha sido adoptado por otra persona.");
        }
    }

    public String getInformacion() {
        String informacionPersona = "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + " años, Documento: " + documento;
        if (!gatosAdoptados.isEmpty()) {
            informacionPersona += "\nGatos adoptados:\n";
            for (Gato gato : gatosAdoptados) {
                informacionPersona += gato.getInformacion() + "\n";
            }
        } else {
            informacionPersona += "\nAún no ha adoptado gatos.";
        }
        return informacionPersona;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
