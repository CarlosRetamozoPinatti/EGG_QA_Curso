package org.example.entity.persona;

import java.util.Date;

public class Infante extends Integrante{
    public Infante(String nombre, String apellido, String sexo, Date fechaNacimiento,
                   long dni, int numOrden, Vinculo vinculo) {
        super(nombre, apellido, sexo, fechaNacimiento, dni, numOrden, vinculo);
    }
}
