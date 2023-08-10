package org.example.entity;

public class Habitacion {
    private int numeroHabitacion;
    private int capacidadMax;
    private String fechaOcupacion;

    public Habitacion(int numeroHabitacion, int capacidadMax) {
        this.numeroHabitacion = numeroHabitacion;
        this.capacidadMax = capacidadMax;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(String fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void ocuparHabitacion(String fecha){
        this.fechaOcupacion = fecha;
    }

    @Override
    public String toString() {
        return "Habitacion: " + numeroHabitacion + ", Capacidad: " + capacidadMax;
    }
}

