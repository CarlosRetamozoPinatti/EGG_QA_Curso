package entity;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro() {
    }
    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public boolean prestamo() {
        if (numEjemplares > numEjemplaresPrestados) {
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ejemplares disponibles: "
                + (numEjemplares - numEjemplaresPrestados) + ", Ejemplares prestados: " + numEjemplaresPrestados;
    }
}
