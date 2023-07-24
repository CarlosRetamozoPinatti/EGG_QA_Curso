package service;

import entity.Pais;

import java.util.*;

public class PaisService {
    private List<Pais> listaPaises;
    private Scanner leer;

    public PaisService() {
        listaPaises = new ArrayList<>();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void agregarPais() {
        String continuar;
        do {
            System.out.print("Ingrese el nombre del país a agregar: ");
            String nombre = leer.next().trim().toLowerCase();

            if (!nombre.isEmpty()) {
                Pais pais = new Pais(nombre);
                if (!existePais(pais)) {
                    listaPaises.add(pais);
                    System.out.println("País agregado!!");
                } else {
                    System.out.println("El país ya fue ingresado previamente.");
                }
            } else {
                System.out.println("El nombre del país no puede estar vacío.");
            }

            System.out.print("¿Desea agregar otro país? (s/n): ");
            continuar = leer.next().trim();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Adios!!");
    }

    private boolean existePais(Pais pais) {
        return listaPaises.contains(pais);
    }

    public void mostrarPaises() {
        if (listaPaises.isEmpty()) {
            System.out.println("No hay países guardados en el conjunto.");
        } else {
            System.out.println("--- Paises guardados ---");
            listaPaises.forEach(System.out::println);
        }
    }

    public void mostrarPaisesOrdenados() {
        if (listaPaises.isEmpty()) {
            System.out.println("No hay países guardados en el conjunto.");
        } else {
            List<Pais> listaOrdenada = new ArrayList<>(listaPaises);
            listaOrdenada.sort(Comparator.comparing(Pais::getNombre));
            System.out.println("\n--- Países ordenados por nombre (alfabéticamente) ---");
            listaOrdenada.forEach(System.out::println);
        }
    }

    public void eliminarPais() {
        System.out.print("Ingrese el nombre del país a eliminar: ");
        String pais = leer.next().trim().toLowerCase();

        if (!pais.isEmpty()) {
            Pais paisEliminar = new Pais(pais);
            if (listaPaises.remove(paisEliminar)) {
                System.out.println("País eliminado: " + pais);
            } else {
                System.out.println("El país " + pais + " no se encuentra en el conjunto.");
            }
        } else {
            System.out.println("El nombre del país no puede estar vacío.");
        }
    }
}




