package entity;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Integer> notas;

    /*
    Estos constructores crean un nuevo objeto Alumno con un nombre específico,
    pero inicializan la lista de notas (notas) como una nueva instancia de ArrayList,
    es decir, una lista vacía.
    Esta forma del constructor es útil cuando al crear un nuevo alumno,
    aún no tienes las notas disponibles y deseas inicializar la lista de notas con un estado inicial
    (en este caso, vacío).
    Luego, se usa el método agregarNota() para añadir las notas a medida que las obtienes.
    */

    public Alumno() {
        this.notas = new ArrayList<>();
    }
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }
    public void agregarNota(int nota) {
        notas.add(nota);
    }
    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }
}
