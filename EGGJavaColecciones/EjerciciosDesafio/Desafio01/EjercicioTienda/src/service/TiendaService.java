package service;

import entity.Producto;
import entity.Tienda;

import java.util.Scanner;

public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Tienda tienda = new Tienda();

    public void agregarProductos() {
        String respuesta;

        do {
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = leer.next().toLowerCase();
            System.out.println("Ingrese su categoría: ");
            String categoria = leer.next().toLowerCase();
            System.out.println("Ingrese su precio: ");
            double precio = Double.parseDouble(leer.next());
            System.out.println("Ingrese la cantidad inicial: ");
            int inventario = Integer.parseInt(leer.next());

            tienda.agregarProducto(new Producto(nombre, categoria, precio, inventario));
            System.out.println("Producto agregado correctamente!!");

            System.out.println("¿Desea agregar otro producto? (s/n): ");
            respuesta = leer.next().toLowerCase();
        } while (respuesta.equals("s"));
    }

    public void eliminarProductos(){
        String respuesta;

        do {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String nombre = leer.next();
        tienda.eliminarProducto(nombre);
        respuesta = leer.next().toLowerCase();
        } while (respuesta.equals("s"));
    }
    public void mostrarProductos(){
        tienda.mostrarProductos();
    }
    public void venderProductos(){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del producto a vender: ");
            String nombre = leer.next().toLowerCase();
            tienda.realizarVenta(nombre);
            respuesta = leer.next().toLowerCase();
        } while (respuesta.equals("s"));
    }
    public void reponerProductos(){
        String respuesta;
        do {
            System.out.println("Ingrese el nombre del producto a reponer: ");
            String nombre = leer.next().toLowerCase();
            Producto productoAReponer = tienda.buscarProductoPorNombre(nombre);
            if (productoAReponer != null) {
                tienda.realizarReposicion(nombre);
            } else {
                System.out.println("El producto no existe en la tienda.");
            }
            respuesta = leer.next().toLowerCase();
        } while (respuesta.equals("s"));
    }

}
