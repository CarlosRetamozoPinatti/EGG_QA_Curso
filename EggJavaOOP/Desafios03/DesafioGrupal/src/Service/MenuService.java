package Service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ClienteService cserv = new ClienteService();
    RutinaService rserv = new RutinaService();
    int opcion;

    public void mostrarMenu() {
        System.out.println("""
                INGRESE UNA OPCION:
                1 - Registrar un Cliente.
                2 - Ver listado de Clientes.
                3 - Modificar los datos de un cliente.
                4 - Eliminar un cliente.
                5 - Registrar una Rutina.
                6 - Ver listado de Rutinas.
                7 - Modificar una rutina.
                8 - Eliminar una rutina.
                0 - Salir.
                """);
        do {
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> cserv.crearCliente();
                case 2 -> cserv.obtenerClientes();
                case 3 -> cserv.modificarCliente();
                case 4 -> cserv.eliminarCliente();
                case 5 -> rserv.crearRutina();
                case 6 -> rserv.mostrarRutinas();
                case 7 -> rserv.modificarRutina();
                case 8 -> rserv.eliminarRutina();
                case 0 -> System.out.println("Adios!");

                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }
}
