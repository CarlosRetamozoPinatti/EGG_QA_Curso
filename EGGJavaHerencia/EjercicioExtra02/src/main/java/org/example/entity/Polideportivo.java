package org.example.entity;

public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        // Suponemos que la superficie del polideportivo es el área total de sus paredes
        // Fórmula genérica para calcular el área de un paralelepípedo: 2 * (largo * ancho + largo * alto + ancho * alto)
        return 2 * (largo * ancho + largo * alto + ancho * alto);
    }

    @Override
    public double calcularVolumen() {
        // Suponemos que el volumen del polideportivo es el volumen del espacio interior
        // Fórmula genérica para calcular el volumen de un paralelepípedo: largo * ancho * alto
        return largo * ancho * alto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }
}

