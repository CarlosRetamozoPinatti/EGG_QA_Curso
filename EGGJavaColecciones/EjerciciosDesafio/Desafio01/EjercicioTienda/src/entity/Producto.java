package entity;

import java.util.Scanner;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int inventario;

    public Producto(String nombre, String categoria, double precio, int inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnInventario() {
        return inventario;
    }

    public void setCantidadEnInventario(int cantidad) {
        this.inventario = cantidad;
    }

    public void venta() {
        if (inventario > 0) {
            Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de productos que desea comprar (disponibles: " + inventario + "): ");
            int cantidadVenta = leer.nextInt();

            if (cantidadVenta > 0 && cantidadVenta <= inventario) {
                inventario -= cantidadVenta;
                System.out.println("Venta de " + cantidadVenta + " productos realizada correctamente.");
                System.out.println("Ganancias de $" + cantidadVenta * precio);
            } else {
                System.out.println("Cantidad inválida o no hay suficiente inventario para vender esa cantidad.");
            }
        } else {
            System.out.println("No hay inventario disponible para este producto.");
        }
    }

    public void reposicion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos que desea reponer: ");
        int cantidadReposicion = scanner.nextInt();

        if (cantidadReposicion > 0) {
            inventario += cantidadReposicion;
            System.out.println("Reposición de " + cantidadReposicion + " productos realizada correctamente.");
        } else {
            System.out.println("Cantidad inválida. La reposición debe ser mayor que cero.");
        }
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Categoría: " + categoria + ", Precio: $" + precio + ", Inventario: " + inventario;
    }
}
