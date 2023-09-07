package org.example.entity;

import org.example.interfaces.Alquiler;

import java.util.Date;

public class AlquilerBarco implements Alquiler {
    private String nombreCliente;
    private String documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public AlquilerBarco(String nombreCliente, String documentoCliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombreCliente = nombreCliente;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    @Override
    public double calcularPrecio() {
        long diasOcupacion = (fechaDevolucion.getTime() - fechaAlquiler.getTime()) / (24 * 60 * 60 * 1000);
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
}