package org.example.entity.persona;

import java.util.Date;

public class Adulto extends Integrante{
    protected boolean estudia;
    protected boolean realizaDeporte;
    protected boolean tieneEmpleoFormal;
    protected String obraSocial;

    public Adulto(String nombre, String apellido, String sexo, Date fechaNacimiento,
                  long dni, int numOrden, Vinculo vinculo, boolean estudia,
                  boolean realizaDeporte, boolean tieneEmpleoFormal, String obraSocial) {
        super(nombre, apellido, sexo, fechaNacimiento, dni, numOrden, vinculo);
        this.estudia = estudia;
        this.realizaDeporte = realizaDeporte;
        this.tieneEmpleoFormal = tieneEmpleoFormal;
        this.obraSocial = obraSocial;
    }
}
