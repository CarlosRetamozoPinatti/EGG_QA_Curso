package org.example.entity;

import java.util.ArrayList;

public class Tienda {
    private int id;
    private ArrayList<Producto> productos;
    private String direccion;
    private String representante;
    private static int contadorId = 1;

    public Tienda() {
    }

    public Tienda(String direccion, String representante) {
        this.id = contadorId++;
        this.productos = new ArrayList<>();
        this.direccion = direccion;
        this.representante = representante;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
            System.out.println("Producto agregado exitosamente.");
        } else {
            System.out.println("No se puede agregar un producto nulo.");
        }
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
        System.out.println("Producto eliminado correctamente");
    }

    public int productoStock(Producto producto){
        return producto.getStock();
    }

    public void venderProducto(Producto producto, int cantidad) {
        if (productos.contains(producto)) {
            if (cantidad > 0 && cantidad <= producto.getStock()) {
                producto.reducirStock(cantidad);
                System.out.println("Venta realizada exitosamente.");
            } else {
                System.out.println("Cantidad inválida o no hay suficiente stock.");
            }
        } else {
            System.out.println("El producto no está disponible en esta tienda.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}
