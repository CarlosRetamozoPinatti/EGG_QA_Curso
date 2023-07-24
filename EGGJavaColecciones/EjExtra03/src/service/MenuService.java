package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    LibroService serv = new LibroService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar Libros
                2 - Ver Todos Los Libros.
                3 - Buscar un Libro Especifico.
                4 - Prestar un Libro.
                5 - Devolver un Libro.                
                0 - Salir""");
    }
    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.agregarLibros();
                case 2 -> serv.mostrarLibros();
                case 3 -> serv.buscarLibro();
                case 4 -> serv.prestarLibro();
                case 5 -> serv.devolverLibro();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}