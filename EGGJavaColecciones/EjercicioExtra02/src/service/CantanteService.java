package service;

import entity.Cantante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CantanteService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Cantante> cantantesFamosos;

    public CantanteService() {
        cantantesFamosos = new ArrayList<>();
    }

    public void agregarCantante() {
        while (true) {
            System.out.println("Ingrese el nombre del cantante (o 'salir' para detenerse): ");
            String nombre = leer.nextLine().trim();
            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }
            if (cantanteYaExiste(nombre)) {
                System.out.println("El cantante ya existe en la lista.");
                continue;
            }
            System.out.println("Ingrese el mejor disco del cantante: ");
            String mejorDisco = leer.nextLine().trim();
            if (nombre.isEmpty() || mejorDisco.isEmpty()) {
                System.out.println("Error: Los campos no pueden estar vacíos.");
                continue;
            }
            Cantante cantante = new Cantante(nombre, mejorDisco);
            cantantesFamosos.add(cantante);
            System.out.println("Cantante y disco añadidos con éxito!!");
        }
    }

    public boolean cantanteYaExiste(String nombre) {
        return cantantesFamosos.stream()
                .anyMatch(cantante -> cantante.getNombre().equalsIgnoreCase(nombre));
    }

    public void mostrarCantantes() {
        System.out.println("------ Lista de Cantantes ------");
        cantantesFamosos.forEach(System.out::println);
        System.out.println("------------------------------");
    }

    public void eliminarCantante() {
        System.out.println("Ingrese el nombre del cantante a eliminar: ");
        String nombreEliminar = leer.nextLine();
        boolean eliminado = cantantesFamosos.removeIf(cantante -> cantante.getNombre().equals(nombreEliminar));
        if (eliminado) {
            System.out.println("El cantante fue eliminado con éxito!!");
        } else {
            System.out.println("No existe ese cantante en la lista.");
        }
    }

    public void modificarCantante() {
        System.out.println("Ingrese el nombre del cantante a modificar: ");
        String nombreModificar = leer.nextLine();
        Cantante cantanteModificar = null;
        for (Cantante cantante : cantantesFamosos) {
            if (cantante.getNombre().equals(nombreModificar)) {
                cantanteModificar = cantante;
                break;
            }
        }
        if (cantanteModificar != null) {
            System.out.println("Ingrese el nuevo nombre del cantante: ");
            String nuevoNombre = leer.nextLine().trim();
            if (!nuevoNombre.isEmpty()) {
                cantanteModificar.setNombre(nuevoNombre);
            }
            System.out.println("Ingrese el nuevo mejor disco del cantante: ");
            String nuevoMejorDisco = leer.nextLine().trim();
            if (!nuevoMejorDisco.isEmpty()) {
                cantanteModificar.setMejorDisco(nuevoMejorDisco);
            }
            System.out.println("Cantante modificado con éxito!!");
        } else {
            System.out.println("No existe ese cantante en la lista.");
        }
    }
}
