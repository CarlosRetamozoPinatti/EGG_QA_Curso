package Service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PeliculaService service = new PeliculaService();
    AlquilerService alquiserv = new AlquilerService(service);
    int opcion;
    public void mostrarMenu() {
        System.out.println("""
                INGRESE UNA OPCION:
                1 - Agregar Pelicula al catalogo.
                2 - Mostrar el catalogo.
                3 - Buscar pelicula por nombre.
                4 - Buscar por género.
                5 - Alquilar una pelicula.
                6 - Mostrar peliculas alquiladas.
                7 - Devolver una Pelicula.
                8 - Buscar alquiler por fecha.
                0 - Salir.
                """);
        do {
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1 -> service.crearPelicula();
                case 2 -> service.imprimirCatalogo();
                case 3 -> service.buscarPorNombre();
                case 4 -> service.buscarPorGenero();
                case 5 -> alquiserv.alquilarPelicula();
                case 6 -> alquiserv.mostrarAlquilados();
                case 7 -> alquiserv.devolverAlquiler();
                case 8 -> alquiserv.buscarPorFecha();
                case 0 -> System.out.println("Adios!");

                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }
}
