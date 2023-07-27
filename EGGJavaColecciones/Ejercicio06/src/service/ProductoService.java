package service;

import entity.Producto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Set<Producto> productos;

    public ProductoService() {
        productos = new HashSet<>();
    }

    public void agregarProducto() {
        do {
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = leer.next().toLowerCase();
            if (productos.stream().anyMatch(p -> p.getNombre().equalsIgnoreCase(nombre))) {
                System.out.println("El producto ya existe en la tienda.");
            } else {
                System.out.println("Ingrese el precio del producto: ");
                double precio = leer.nextDouble();
                if (precio <= 0) {
                    System.out.println("El precio debe ser un número positivo.");
                    continue;
                }
                Producto producto = new Producto(nombre, precio);
                productos.add(producto);
                System.out.println("Producto agregado correctamente.");
            }
            System.out.println("¿Desea agregar otro producto? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void modificarPrecio() {
        do {
            System.out.println("Ingrese el nombre del producto a modificar: ");
            String nombre = leer.next().toLowerCase();
            Iterator<Producto> iterator = productos.iterator();
            boolean encontrado = false;
            while (iterator.hasNext()) {
                Producto producto = iterator.next();
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Ingrese el nuevo precio del producto: ");
                    double nuevoPrecio = leer.nextDouble();
                    producto.setPrecio(nuevoPrecio);
                    System.out.println("Precio del producto actualizado correctamente.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El producto no existe en la tienda.");
            }
            System.out.println("¿Desea modificar el precio de otro producto? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void eliminarProducto() {
        do {
            System.out.println("Ingrese el nombre del producto a eliminar: ");
            String nombre = leer.next().toLowerCase();
            Iterator<Producto> iterator = productos.iterator();
            boolean encontrado = false;
            while (iterator.hasNext()) {
                Producto producto = iterator.next();
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    iterator.remove();
                    System.out.println("Producto eliminado correctamente.");
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El producto no existe en la tienda.");
            }
            System.out.println("¿Desea eliminar otro producto? (s/n)");
        } while (leer.next().equalsIgnoreCase("s"));
    }

    public void mostrarProductos() {
        if (!productos.isEmpty()) {
            System.out.println("Productos en la tienda:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        } else {
            System.out.println("La tienda no tiene productos.");
        }
    }
}