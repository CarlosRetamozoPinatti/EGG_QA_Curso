package org.example.entity;


import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<String> tareas;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(String tarea) {
        tareas.remove(tarea);
    }

    public void modificarTarea(String tareaAnterior, String tareaNueva) {
        int indice = tareas.indexOf(tareaAnterior);
        if (indice != -1) {
            tareas.set(indice, tareaNueva);
        }
    }

    public List<String> listarTareas() {
        return new ArrayList<>(tareas);
    }
}