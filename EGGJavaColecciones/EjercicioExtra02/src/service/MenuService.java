package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CantanteService serv = new CantanteService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar un Cantante.
                2 - Mostrar todos los cantantes.
                3 - Modificar los Datos de un Cantante.
                4 - Eliminar un Cantante.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.agregarCantante();
                case 2 -> serv.mostrarCantantes();
                case 3 -> serv.modificarCantante();
                case 4 -> serv.eliminarCantante();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}