package entity;

import java.util.ArrayList;
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
}
