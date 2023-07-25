package service;

import entity.CodigoPostal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CPService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Map<String, CodigoPostal> codigosPostales;

    public CPService(){
        codigosPostales = new HashMap<>();
    }

    public void agregarCodigosPostales() {
        System.out.println("Ingrese códigos postales y ciudades (Ingrese 'salir' como código postal para detenerse):");
        while (true) {
            System.out.print("Código Postal ('salir' para detenerse): ");
            String codigoPostal = leer.nextLine().trim();

            if (codigoPostal.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Ciudad: ");
            String ciudad = leer.nextLine().trim();

            CodigoPostal nuevocp = new CodigoPostal(codigoPostal, ciudad);
            codigosPostales.put(codigoPostal, nuevocp);
            System.out.println("Ciudad y código postal añadidos con éxito!!");
        }
    }
    public void mostrarCodigosPostales() {
        System.out.println("----------Codigos Postales y Ciudades----------");
        codigosPostales.values().forEach(System.out::println);
        System.out.println("------------------------------");
    }
    public void buscarCiudadPorCodigoPostal() {
        System.out.print("Ingrese un código postal para buscar la ciudad: ");
        String codigoBuscar = leer.nextLine().trim();
        if (codigosPostales.containsKey(codigoBuscar)) {
            System.out.println("Ciudad encontrada: " + codigosPostales.get(codigoBuscar).getCiudad());
        } else {
            System.out.println("El código postal no existe en la lista.");
        }
    }
    public void buscarCodigoPorCiudad() {
        System.out.print("Ingrese una ciudad para buscar su código postal: ");
        String ciudadBuscar = leer.nextLine().trim();
        boolean encontrado = false;

        for (CodigoPostal codigoPostal : codigosPostales.values()) {
            if (codigoPostal.getCiudad().equalsIgnoreCase(ciudadBuscar)) {
                System.out.println("Código postal para " + ciudadBuscar + ": " + codigoPostal.getCodigo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún código postal para la ciudad ingresada.");
        }
    }
    public void modificarCodigoPostal() {
        System.out.print("Ingrese el código postal a modificar: ");
        String codigoModificar = leer.nextLine().trim();

        if (!codigosPostales.containsKey(codigoModificar)) {
            System.out.println("El código postal ingresado no existe en la lista.");
            return;
        }
        System.out.print("Ingrese la nueva ciudad: ");
        String nuevaCiudad = leer.nextLine().trim();

        CodigoPostal codigoPostal = codigosPostales.get(codigoModificar);
        codigoPostal.setCiudad(nuevaCiudad);
        codigosPostales.put(codigoModificar, codigoPostal);
        System.out.println("Código postal modificado con éxito!!");
    }
    public void eliminarCiudades() {
        System.out.println("Ingrese códigos postales de ciudades a eliminar (Ingrese 'salir' para detenerse):");
        while (true) {
            System.out.print("Código Postal ('salir' para detenerse): ");
            String codigoEliminar = leer.nextLine().trim();
            if (codigoEliminar.equalsIgnoreCase("salir")) {
                break;
            }
            if (codigosPostales.remove(codigoEliminar) != null) {
                System.out.println("Ciudad eliminada con éxito!!");
            } else {
                System.out.println("El código postal no existe en la lista.");
            }
        }
    }
}
