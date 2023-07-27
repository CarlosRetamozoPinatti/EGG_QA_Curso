package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class GestorPerros {
    private ArrayList<String> razasPerros;

    public GestorPerros(){
        razasPerros = new ArrayList<>();
    }

    public void agregarRaza(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Como se llama la raza a agregar?");
        String raza = leer.next();
        razasPerros.add(raza);
        System.out.println("La raza " + raza + " ha sido agregada!");
    }

    public void mostrarRazas(){
        if (razasPerros.isEmpty()){
            System.out.println("La lista de razas esta vacía");
        } else {
            System.out.println("Las razas listadas son: ");
            System.out.println(razasPerros);
        }
    }

    public void eliminarRaza() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Qué raza desea eliminar?: ");
        String raza = leer.next();
        Iterator<String> iterator = razasPerros.iterator();
        boolean razaEncontrada = false;
        while (iterator.hasNext()) {
            String razaActual = iterator.next();
            if (razaActual.equalsIgnoreCase(raza)) {
                iterator.remove();
                System.out.println("Raza removida de la lista.");
                razaEncontrada = true;
                break; // Salimos del bucle, ya que encontramos la raza y la eliminamos.
            }
        }
        if (!razaEncontrada) {
            System.out.println("No existe esa raza en la lista.");
        }
    }

    public void ordenarLista(){
        Collections.sort(razasPerros, String.CASE_INSENSITIVE_ORDER);
    }
}