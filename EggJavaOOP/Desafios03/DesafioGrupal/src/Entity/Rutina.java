package Entity;

public class Rutina {
    private static long countId;
    private long id;
    private String nombre;
    private int duracion;
    private String dificultad;
    private String descripcion;

    public Rutina() {
        this.id = ++countId;
    }

    public Rutina(long id, String nombre, int duracion, String dificultad, String descripcion) {
        this.id = ++countId;
        this.nombre = nombre;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
               "Rutina: " + nombre + " Duracion: " + duracion +  " Dificultad: " + dificultad + "\n" +
               "Descripcion: " + descripcion + "\n";
    }
}
