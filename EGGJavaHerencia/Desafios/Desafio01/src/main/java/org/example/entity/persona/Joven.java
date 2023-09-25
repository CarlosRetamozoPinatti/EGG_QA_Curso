package org.example.entity.persona;

import java.util.Date;

public class Joven extends Integrante{
    protected String estudio;
    protected boolean practicaDeportes;
    protected boolean tieneTrabajo;

    public Joven(String nombre, String apellido, String sexo, Date fechaNacimiento, long dni,
                 int numOrden, Vinculo vinculo, String estudio, boolean practicaDeportes,
                 boolean tieneTrabajo) {
        super(nombre, apellido, sexo, fechaNacimiento, dni, numOrden, vinculo);
        this.estudio = estudio;
        this.practicaDeportes = practicaDeportes;
        this.tieneTrabajo = tieneTrabajo;
    }

    public String getEstudio() {
        return estudio;
    }

    public boolean isPracticaDeportes() {
        return practicaDeportes;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }
}
