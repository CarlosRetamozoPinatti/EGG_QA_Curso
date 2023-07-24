package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CPService serv = new CPService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar un Codigo Postal.
                2 - Ver codigos postales.
                3 - Buscar Ciudad por Codigo Postal.
                4 - Buscar Codigo Postal por Ciudad.
                5 - Modificar un Codigo Postal
                6 - Eliminar una Ciudad.
                0 - Salir""");
    }
    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.agregarCodigosPostales();
                case 2 -> serv.mostrarCodigosPostales();
                case 3 -> serv.buscarCiudadPorCodigoPostal();
                case 4 -> serv.buscarCodigoPorCiudad();
                case 5 -> serv.modificarCodigoPostal();
                case 6 -> serv.eliminarCiudades();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}