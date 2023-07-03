package Entity;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private boolean disponible;

    public Pelicula() {
    }

    public Pelicula(String nombre, String genero, int duracion, boolean disponible) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre  + ";" + " Género: " + genero + ";" + " Duración: " + duracion  + "\n" +
                "Disponible para alquiler: " + disponible + "\n";
    }
}


