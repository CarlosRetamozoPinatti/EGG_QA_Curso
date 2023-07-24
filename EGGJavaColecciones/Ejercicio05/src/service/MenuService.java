package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PaisService serv = new PaisService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Cargar un Pais.
                2 - Mostrar los Paises.
                3 - Mostrar los Paises en Orden Alfabetico.
                4 - Eliminar un pais
                0 - Salir""");
    }
    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.agregarPais();
                case 2 -> serv.mostrarPaises();
                case 3 -> serv.mostrarPaisesOrdenados();
                case 4 -> serv.eliminarPais();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}