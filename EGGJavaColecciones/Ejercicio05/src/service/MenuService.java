package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PaisesService serv = new PaisesService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar un Pais.
                2 - Listar Paises.
                3 - Eliminar un Pais.
                4 - Listar desde A a Z.
                5 - Listar desde Z a A.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
        String nombre;
        double precio;
        do {
            mostrarOpciones();
            opcion = Integer.parseInt(leer.next());
            switch (opcion){
                case 1 -> {
                    System.out.print("Ingrese el nombre del pais: ");
                    nombre = leer.next().toLowerCase();
                    serv.agregarPaises(nombre);
                }
                case 2 -> serv.visualizarPaises();
                case 3 -> {
                    System.out.print("Ingrese el nombre del pais a eliminar: ");
                    nombre = leer.next().toLowerCase();
                    serv.eliminarPaises(nombre);
                }
                case 4 -> serv.visualizarPaisesOrdenAZ();
                case 5 -> serv.visualizarPaisesOrdenZA();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}