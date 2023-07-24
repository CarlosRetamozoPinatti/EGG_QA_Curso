import java.util.*;

public class ServicioProductos {
    private Map<String, Double> productos;

    public ServicioProductos() {
        productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, double precio) {
        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya existe en la tienda. Use la opción 'Modificar precio' para cambiarlo.");
        } else {
            productos.put(nombre, precio);
            System.out.println("Producto agregado: " + nombre + " - Precio: " + precio);
        }
    }

    public void modificarPrecio(String nombre, double nuevoPrecio) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, nuevoPrecio);
            System.out.println("Precio actualizado para " + nombre + ": " + nuevoPrecio);
        } else {
            System.out.println("El producto no existe en la tienda. Use la opción 'Agregar producto' para agregarlo.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado: " + nombre);
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println("Productos en la tienda:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println(entry.getKey() + " - Precio: " + entry.getValue());
            }
        }
    }
}
