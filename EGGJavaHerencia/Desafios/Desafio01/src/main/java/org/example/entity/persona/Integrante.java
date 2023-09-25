package org.example.entity.persona;

import java.util.Date;

public abstract class Integrante extends Persona{
    protected int numOrden;
    protected Vinculo vinculo;

    public Integrante(String nombre, String apellido, String sexo, Date fechaNacimiento,
                      long dni, int numOrden, Vinculo vinculo) {
        super(nombre, apellido, sexo, fechaNacimiento, dni);
        this.numOrden = numOrden;
        this.vinculo = vinculo;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public Vinculo getVinculo() {
        return vinculo;
    }

    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }
}
