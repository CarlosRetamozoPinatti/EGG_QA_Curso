package entity;

public class Cantante {
    private String nombre;
    private String mejorDisco;

    public Cantante() {
    }

    public Cantante(String nombre, String mejorDisco) {
        this.nombre = nombre;
        this.mejorDisco = mejorDisco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMejorDisco() {
        return mejorDisco;
    }

    public void setMejorDisco(String mejorDisco) {
        this.mejorDisco = mejorDisco;
    }

    @Override
    public String toString() {
        return "Cantante: " + nombre + ", Mejor Disco: " + mejorDisco;
    }
}
