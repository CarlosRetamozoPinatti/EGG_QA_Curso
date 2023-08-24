package org.example.entity;

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private static int contadorId = 1;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void agregarStock(int cantidad) {
        stock += cantidad;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Id:" + id + ", Precio:" + precio + ", Stock: " + stock +"\n";
    }
}
