import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> codigosPostales = new HashMap<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("----- Menú -----");
            System.out.println("1 - Agregar códigos postales y ciudades");
            System.out.println("2 - Mostrar datos introducidos");
            System.out.println("3 - Buscar ciudad por código postal");
            System.out.println("4 - Agregar ciudad adicional");
            System.out.println("5 - Eliminar ciudad");
            System.out.println("0 - Salir");
            System.out.print("Ingrese la opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    agregarCodigosPostales(codigosPostales);
                    break;
                case 2:
                    mostrarDatosIntroducidos(codigosPostales);
                    break;
                case 3:
                    buscarCiudadPorCodigoPostal(codigosPostales);
                    break;
                case 4:
                    agregarCiudadAdicional(codigosPostales);
                    break;
                case 5:
                    eliminarCiudad(codigosPostales);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

    private static void agregarCodigosPostales(Map<String, String> codigosPostales) {
        System.out.println("Ingrese códigos postales y ciudades (Ingrese 'salir' como código postal para detenerse):");
        while (true) {
            System.out.print("Código Postal ('salir' para detenerse): ");
            String codigoPostal = scanner.nextLine().trim();
            if (codigoPostal.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine().trim();
            codigosPostales.put(codigoPostal, ciudad);
            System.out.println("Ciudad y código postal añadidos con éxito!!");
        }
    }

    private static void mostrarDatosIntroducidos(Map<String, String> codigosPostales) {
        System.out.println("Datos introducidos:");
        for (Map.Entry<String, String> entry : codigosPostales.entrySet()) {
            System.out.println("Código Postal: " + entry.getKey() + ", Ciudad: " + entry.getValue());
        }
    }

    private static void buscarCiudadPorCodigoPostal(Map<String, String> codigosPostales) {
        System.out.print("Ingrese un código postal para buscar la ciudad: ");
        String codigoBuscar = scanner.nextLine().trim();
        if (codigosPostales.containsKey(codigoBuscar)) {
            System.out.println("Ciudad encontrada: " + codigosPostales.get(codigoBuscar));
        } else {
            System.out.println("El código postal no existe en la lista.");
        }
    }

    private static void agregarCiudadAdicional(Map<String, String> codigosPostales) {
        System.out.print("Ingrese un nuevo código postal: ");
        String nuevoCodigoPostal = scanner.nextLine().trim();
        System.out.print("Ingrese la ciudad correspondiente: ");
        String nuevaCiudad = scanner.nextLine().trim();
        codigosPostales.put(nuevoCodigoPostal, nuevaCiudad);
        System.out.println("Ciudad y código postal añadidos con éxito!!");
    }

    private static void eliminarCiudad(Map<String, String> codigosPostales) {
        System.out.print("Ingrese el código postal de la ciudad a eliminar: ");
        String codigoEliminar = scanner.nextLine().trim();
        if (codigosPostales.remove(codigoEliminar) != null) {
            System.out.println("Ciudad eliminada con éxito!!");
        } else {
            System.out.println("El código postal no existe en la lista.");
        }
    }
}
