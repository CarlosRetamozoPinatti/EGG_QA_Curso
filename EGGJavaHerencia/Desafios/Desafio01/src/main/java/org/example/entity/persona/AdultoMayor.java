package org.example.entity.persona;

import java.util.Date;

public class AdultoMayor extends Integrante{
    protected boolean tieneJubilación;

    public AdultoMayor(String nombre, String apellido, String sexo, Date fechaNacimiento,
                       long dni, int numOrden, Vinculo vinculo, boolean tieneJubilación) {
        super(nombre, apellido, sexo, fechaNacimiento, dni, numOrden, vinculo);
        this.tieneJubilación = tieneJubilación;
    }

    public boolean isTieneJubilación() {
        return tieneJubilación;
    }

    public void setTieneJubilación(boolean tieneJubilación) {
        this.tieneJubilación = tieneJubilación;
    }
}
