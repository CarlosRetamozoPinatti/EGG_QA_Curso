package Entity;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String pelicula;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(LocalDate fechaInicio, LocalDate fechaFin, String pelicula, double precio) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "La pelicula " + pelicula + "\n" +
                "Fue alquilada desde " + fechaInicio + " Hasta " + fechaFin + "\n" +
                "Por un monto de " + + precio;
    }
}
