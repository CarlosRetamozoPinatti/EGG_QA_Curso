package org.example.service;

import org.example.entity.Producto;
import org.example.entity.Tienda;

import java.util.ArrayList;
import java.util.List;

public class TiendaService {
    private List<Tienda> tiendas;

    public TiendaService(){
        this.tiendas = new ArrayList<>();
    }

    public void crearTienda(String direccion, String representante) {
        Tienda tienda = new Tienda(direccion, representante);
        tiendas.add(tienda);
        System.out.println("Tienda creada exitosamente.");
    }

    public void mostrarTiendas() {
        for (Tienda tienda : tiendas) {
            System.out.println("ID: " + tienda.getId());
            System.out.println("Dirección: " + tienda.getDireccion());
            System.out.println("Representante: " + tienda.getRepresentante());
            System.out.println("Productos:");
            for (Producto producto : tienda.getProductos()) {
                System.out.println("- " + producto.getNombre() + " | Precio: " + producto.getPrecio() + " | Stock: " + producto.getStock());
            }
            System.out.println();
        }
    }

    public void modificarTienda(int idTienda, String nuevaDireccion, String nuevoRepresentante) {
        for (Tienda tienda : tiendas) {
            if (tienda.getId() == idTienda) {
                tienda.setDireccion(nuevaDireccion);
                tienda.setRepresentante(nuevoRepresentante);
                System.out.println("Tienda modificada exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró la tienda con ID: " + idTienda);
    }

    public void eliminarTienda(int idTienda) {
        Tienda tiendaAEliminar = null;
        for (Tienda tienda : tiendas) {
            if (tienda.getId() == idTienda) {
                tiendaAEliminar = tienda;
                break;
            }
        }
        if (tiendaAEliminar != null) {
            tiendas.remove(tiendaAEliminar);
            System.out.println("Tienda eliminada exitosamente.");
        } else {
            System.out.println("No se encontró la tienda con ID: " + idTienda);
        }
    }

    public void crearProducto(String nombre, double precio, int stock,int tiendaId) {
        for (Tienda tienda : tiendas) {
            for (Producto producto : tienda.getProductos()) {
                if (producto.getNombre().equals(nombre)) {
                    System.out.println("Ya existe un producto con Nombre: " + nombre);
                    return;
                }
            }
        }
        Producto producto = new Producto(nombre, precio, stock);
        agregarProductoATienda(producto, tiendaId);
    }

    public void agregarProductoATienda(Producto producto, int tiendaId) {
        for (Tienda tienda : tiendas) {
            if (tienda.getId() == tiendaId) {
                tienda.agregarProducto(producto);
                System.out.println("Producto creado y agregado a la tienda exitosamente con Nombre: " + producto.getNombre());
                return;
            }
        }
        System.out.println("No se encontró una tienda con ID: " + tiendaId);
    }

    public List<Producto> obtenerTodosLosProductos() {
        List<Producto> todosLosProductos = new ArrayList<>();
        for (Tienda tienda : tiendas) {
            todosLosProductos.addAll(tienda.getProductos());
        }
        return todosLosProductos;
    }

    public List<Producto> obtenerProductosPorTienda(int tiendaId) {
        for (Tienda tienda : tiendas) {
            if (tienda.getId() == tiendaId) {
                return tienda.getProductos();
            }
        }
        return new ArrayList<>(); // Tienda no encontrada, devuelve lista vacía
    }
}

