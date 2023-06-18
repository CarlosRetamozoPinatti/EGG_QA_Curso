package Entity;

public class Cancion {
    private String nombre;
    private String autor;

    public Cancion() {
    }

    public Cancion(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  "El nombre de la cancion es " + nombre + '\n' +
                "Y su autor es " + autor;
    }
}
