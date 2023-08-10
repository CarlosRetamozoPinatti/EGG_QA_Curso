package org.example.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Reserva {
    private static int contID = 1;
    private int id;
    private int numeroHabitacion;
    private int cantidadPersonas;
    private List<LocalDate> fechas;

    public Reserva(int numeroHabitacion, int cantidadPersonas, List<LocalDate> fechas) {
        this.id = contID++;
        this.numeroHabitacion = numeroHabitacion;
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

    public List<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        StringBuilder fechasStr = new StringBuilder();
        for (LocalDate fecha : fechas) {
            if (fechasStr.length() > 0) {
                fechasStr.append(", ");
            }
            fechasStr.append(fecha.format(dateFormatter));
        }
        return "Reserva: " + "\n" +
                "ID: " + id + "\n" +
                "Habitacion: " + numeroHabitacion + "\n" +
                "Huespedes: " + cantidadPersonas + "\n" +
                "Fechas: " + fechasStr;
    }
}