package service;

import entity.Producto;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Map<String, Producto> productos;

    public ProductoService() {
        productos = new HashMap<>();
    }

    public void agregarProducto() {
        do {
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = leer.next().toLowerCase();
            if (productos.containsKey(nombre)) {
                System.out.println("El producto ya existe en la tienda.");
            } else {
                System.out.println("Ingrese el precio del producto: ");
                double precio = Double.parseDouble(leer.next());
                Producto producto = new Producto(nombre, precio);
                productos.put(nombre, producto);
                System.out.println("Producto agregado correctamente.");
            }

            System.out.println("¿Desea agregar otro producto? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void modificarPrecio() {
        do {
            System.out.println("Ingrese el nombre del producto a modificar: ");
            String nombre = leer.next().toLowerCase();
            if (productos.containsKey(nombre)) {
                Producto producto = productos.get(nombre);
                System.out.println("Ingrese el nuevo precio del producto: ");
                double nuevoPrecio = Double.parseDouble(leer.next());
                producto.setPrecio(nuevoPrecio);
                System.out.println("Precio del producto actualizado correctamente.");
            } else {
                System.out.println("El producto no existe en la tienda.");
            }

            System.out.println("¿Desea modificar el precio de otro producto? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void eliminarProducto() {
        do {
            System.out.println("Ingrese el nombre del producto a eliminar: ");
            String nombre = leer.next().toLowerCase();
            if (productos.containsKey(nombre)) {
                productos.remove(nombre);
                System.out.println("Producto eliminado correctamente.");
            } else {
                System.out.println("El producto no existe en la tienda.");
            }

            System.out.println("¿Desea eliminar otro producto? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void mostrarProductos() {
        if (!productos.isEmpty()) {
            System.out.println("Productos en la tienda:");
            for (Producto producto : productos.values()) {
                System.out.println(producto);
            }
        } else {
            System.out.println("La tienda no tiene productos.");
        }
    }
}
