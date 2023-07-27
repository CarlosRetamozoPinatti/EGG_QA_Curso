package entity;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean eliminarProducto(String nombre) {
        Producto productoAEliminar = buscarProductoPorNombre(nombre);
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto '" + nombre + "' eliminado correctamente.");
            return true;
        } else {
            System.out.println("No se pudo eliminar el producto '" + nombre + "'. El producto no existe en la tienda.");
            return false;
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public boolean realizarVenta(String nombre) {
        Producto productoAVender = buscarProductoPorNombre(nombre);
        if (productoAVender != null) {
            productoAVender.venta();
            return true;
        }
        return false;
    }

    public boolean realizarReposicion(String nombre) {
        Producto productoAReponer = buscarProductoPorNombre(nombre);
        if (productoAReponer != null) {
            productoAReponer.reposicion();
            return true;
        }
        return false;
    }
}
