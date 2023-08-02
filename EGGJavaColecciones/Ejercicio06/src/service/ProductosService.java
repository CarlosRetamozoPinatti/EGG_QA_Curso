package service;

import entity.Productos;

import java.util.HashMap;
import java.util.Map;

public class ProductosService {
    private Productos productos;

    public ProductosService() {
        productos = new Productos(new HashMap<>());
    }

    public void agregarProducto(String nombre, double precio) {
        if (productos.getProductos().containsKey(nombre)) {
            System.out.println("El producto ya existe en la tienda. Use la opción 'Modificar precio' para cambiarlo.");
        } else {
            productos.getProductos().put(nombre, precio);
            System.out.println("Producto agregado: " + nombre + " - Precio: " + precio);
        }
    }

    public void modificarPrecio(String nombre, double nuevoPrecio) {
        if (productos.getProductos().containsKey(nombre)) {
            productos.getProductos().put(nombre, nuevoPrecio);
            System.out.println("Precio actualizado para " + nombre + ": " + nuevoPrecio);
        } else {
            System.out.println("El producto no existe en la tienda. Use la opción 'Agregar producto' para agregarlo.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.getProductos().containsKey(nombre)) {
            productos.getProductos().remove(nombre);
            System.out.println("Producto eliminado: " + nombre);
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.getProductos().isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {
            System.out.println(productos);
        }
    }
}





