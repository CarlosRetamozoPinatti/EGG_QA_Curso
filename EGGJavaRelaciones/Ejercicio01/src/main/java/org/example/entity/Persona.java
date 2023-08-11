package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Set<Perro> perrosAdoptados;

    public Persona(String nombre, String apellido, int edad, int documento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.documento = documento;
            this.perrosAdoptados = new HashSet<>();
        }

        public void adoptarPerro(Perro perro) {
            perrosAdoptados.add(perro);
            perro.serAdoptadoPor(this); // Informar al perro que ha sido adoptado por esta persona
        }

        public String getInformacion() {
            String informacionPersona = "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + " años, Documento: " + documento;
            if (!perrosAdoptados.isEmpty()) {
                informacionPersona += "\nPerros adoptados:\n";
                for (Perro perro : perrosAdoptados) {
                    informacionPersona += perro.getInformacion() + "\n";
                }
            } else {
                informacionPersona += "\nAún no ha adoptado perros.";
            }
            return informacionPersona;
        }

        public String nombreCompleto(){
            return nombre + " " + apellido;
        }
}