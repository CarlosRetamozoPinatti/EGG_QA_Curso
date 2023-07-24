package service;

import entity.GestorPerros;

import java.util.Scanner;

public class GestorPerrosService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    GestorPerros gestorPerros = new GestorPerros();

    public void mostrarMenu(){
        int opcion;
        System.out.println("""
                Que desea hacer?
                1 - Agregar una raza de perros.
                2 - Mostrar todas las razas
                3 - Salr""");
        do {
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> {
                    gestorPerros.agregarRaza();
                    System.out.println("""
                Que desea hacer?
                1 - Agregar una raza de perros.
                2 - Mostrar todas las razas
                3 - Salr""");
                }
                case 2 -> {
                    gestorPerros.mostrarRazas();
                    System.out.println("""
                Que desea hacer?
                1 - Agregar una raza de perros.
                2 - Mostrar todas las razas
                3 - Salr""");
                }
                case 3 -> System.out.println("Adios!!");
                default -> System.out.println("Opcion incorrecta");
            }
        } while (opcion != 3);
    }
}
