package service;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductoService serv = new ProductoService();

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
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.agregarProducto();
                case 2 -> serv.mostrarProductos();
                case 3 -> serv.modificarPrecio();
                case 4 -> serv.eliminarProducto();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}