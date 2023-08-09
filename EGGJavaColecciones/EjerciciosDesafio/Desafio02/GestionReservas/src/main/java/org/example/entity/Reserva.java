package org.example.entity;

import java.util.List;

public class Reserva {
    private static int contID = 1;
    private int id;
    private int numeroHabitacion;
    private int cantidadPersonas;
    private List<String> fechas;

    public Reserva(int cantidadPersonas, List<String> fechas) {
        this.id = contID++;
        this.cantidadPersonas = cantidadPersonas;
        this.fechas = fechas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public List<String> getFechas() {
        return fechas;
    }

    public void setFechas(List<String> fechas) {
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", numeroHabitacion=" + numeroHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", fechas=" + fechas +
                '}';
    }
}