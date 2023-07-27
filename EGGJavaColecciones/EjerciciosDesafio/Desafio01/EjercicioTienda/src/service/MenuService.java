package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TiendaService serv = new TiendaService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar Productos.
                2 - Mostrar Todos Los Productos.
                3 - Eliminar Productos.
                4 - Vender.
                5 - Reponer.
                6 - Calcular Ganancias.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.agregarProductos();
                case 2 -> serv.mostrarProductos();
                case 3 -> serv.eliminarProductos();
                case 4 -> serv.venderProductos();
                case 5 -> serv.reponerProductos();
                case 6 -> System.out.println("todavia no anda");
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}
