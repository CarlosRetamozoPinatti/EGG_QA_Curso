package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PeliculaService serv = new PeliculaService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Cargar una pelicula al Catalogo.
                2 - Mostrar el Catalogo.
                3 - Mostrar el Catalogo en Orden Alfabetico.
                4 - Mostrar las Peliculas con duracion mayor a 1 hora.
                5 - Mostrar las Peliculas ordenadas de menor a mayor duracion.
                6 - Mostrar las Peliculas ordenadas de mayor a menor duracion.
                7 - Mostrar peliculas de un genero determinado.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.altaPelicula();
                case 2 -> serv.mostrarCatalogo();
                case 3 -> serv.mostrarAlfabeticamente();
                case 4 -> serv.mostrarMayorA60();
                case 5 -> serv.mostrarDuracionMinMax();
                case 6 -> serv.mostrarDuracionMaxMin();
                case 7 -> serv.mostrarPorGenero();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}
