import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioProductos tienda = new ServicioProductos();

        while (true) {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = leer.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = leer.nextDouble();
                    tienda.agregarProducto(nombre, precio);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    nombre = leer.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    precio = leer.nextDouble();
                    tienda.modificarPrecio(nombre, precio);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombre = leer.nextLine();
                    tienda.eliminarProducto(nombre);
                    break;
                case 4:
                    tienda.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicación...");
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}