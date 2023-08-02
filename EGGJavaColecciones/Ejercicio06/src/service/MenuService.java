package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductosService serv = new ProductosService();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar un Producto.
                2 - Listar Productos.
                3 - Modificar el Precio de un Producto.
                4 - Eliminar un Producto.
                0 - Salir""");
    }

    public void mostrarMenu(){
        int opcion;
        String nombre;
        double precio;
        do {
            mostrarOpciones();
            opcion = Integer.parseInt(leer.next());
            switch (opcion){
                case 1 -> {
                    System.out.print("Ingrese el nombre del producto: ");
                    nombre = leer.next().toLowerCase();
                    System.out.print("Ingrese el precio del producto: ");
                    precio = Double.parseDouble(leer.next());
                    serv.agregarProducto(nombre, precio);
                }
                case 2 -> serv.mostrarProductos();
                case 3 -> {
                    System.out.print("Ingrese el nombre del producto a modificar: ");
                    nombre = leer.next().toLowerCase();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    precio = Double.parseDouble(leer.next());
                    serv.modificarPrecio(nombre, precio);
                }
                case 4 -> {
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    nombre = leer.next();
                    serv.eliminarProducto(nombre);
                }
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}
