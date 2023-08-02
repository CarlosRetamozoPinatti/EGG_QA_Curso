package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CiudadesService serv = new CiudadesService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar una ciudad con su cp.
                2 - Modificar nombre de una ciudad.
                3 - Modificar cp de ciudad.
                4 - Eliminar una ciudad.
                5 - Ver por Ciudades.
                6 - Ver por CP.
                7 - Ver aleatorio.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
        String nombre;
        String nombreNuevo;
        Integer cp;

        do {
            mostrarOpciones();
            opcion = Integer.parseInt(leer.next());
            switch (opcion){
                case 1 -> {
                    System.out.print("Ingrese el nombre de la ciudad: ");
                    nombre = leer.next().toLowerCase();
                    System.out.print("Ingrese el codigo postal de la ciudad: ");
                    cp = Integer.parseInt(leer.next());
                    serv.agregarCiudad(nombre, cp);
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre de la ciudad que va a modificar: ");
                    nombre = leer.next().toLowerCase();
                    System.out.print("Ingrese el nuevo nombre de la ciudad: ");
                    nombreNuevo = leer.next().toLowerCase();
                    serv.modificarNombreCiudad(nombre, nombreNuevo);
                }
                case 3 -> {
                    System.out.print("Ingrese el nombre de la ciudad que va a modificar: ");
                    nombre = leer.next().toLowerCase();
                    System.out.print("Ingrese el nuevo codigo postal de la ciudad: ");
                    cp = Integer.parseInt(leer.next());
                    serv.modificarCodigoPostal(nombre, cp);
                }
                case 4 -> {
                    System.out.print("Ingrese el nombre de la ciudad a eliminar: ");
                    nombre = leer.next();
                    serv.eliminarCiudad(nombre);
                }
                case 5 -> serv.ordenarYVerPorCiudades();
                case 6 -> serv.ordenarYVerPorCodigosPostales();
                case 7 -> serv.ordenarYVerAleatoriamente();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}
