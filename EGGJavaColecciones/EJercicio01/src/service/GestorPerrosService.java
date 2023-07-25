package service;

import entity.GestorPerros;

import java.util.Scanner;

public class GestorPerrosService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    GestorPerros gestorPerros = new GestorPerros();
    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?
                1 - Agregar una raza de perros.
                2 - Mostrar todas las razas.
                0 - Salir""");
    }
    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> gestorPerros.agregarRaza();
                case 2 -> gestorPerros.mostrarRazas();
                case 0 -> System.out.println("Adios!!");
                default -> System.out.println("Opcion incorrecta");
            }
        } while (opcion != 0);
    }
}
