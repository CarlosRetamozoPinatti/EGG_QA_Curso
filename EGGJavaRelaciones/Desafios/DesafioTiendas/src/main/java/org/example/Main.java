package org.example;

import org.example.entity.Producto;
import org.example.service.TiendaService;

import java.util.List;

/*
Relación de Composición entre Tienda y Producto:

La clase Tienda tiene una relación de composición con la clase Producto.
Esto significa que una Tienda contiene varios Productos.
La relación es una composición porque los productos son parte integral de la tienda
y no pueden existir independientemente de ella.
Esto se refleja en el atributo productos de la clase Tienda, que es una lista de productos.

Relación de Asociación entre Tienda y Producto:

La clase Tienda tiene una relación de asociación con la clase Producto.
Esto significa que una Tienda está asociada con varios Productos.
La relación es bidireccional, ya que las tiendas conocen sus productos
y los productos conocen la tienda a la que pertenecen.
Esto se refleja en los métodos agregarProducto y eliminarProducto en la clase Tienda,
así como en el método agregarProductoATienda en la clase TiendaService.

Relación de Dependencia entre TiendaService y Tienda, Producto:

La clase TiendaService tiene relaciones de dependencia con las clases Tienda y Producto.
Esto significa que TiendaService utiliza objetos de estas clases para llevar a cabo sus operaciones,
pero no tiene una relación estructural o de propiedad con ellas.
Esto se refleja en los métodos de TiendaService que operan sobre objetos de tipo Tienda y Producto
 */


public class Main {
    public static void main(String[] args) {
        TiendaService tiendaService = new TiendaService();

        tiendaService.crearTienda("Av. 25 de Mayo 2500", "Un gordo simpatico");
        tiendaService.crearTienda("Vedia 355", "Un tipo medio raro");

        tiendaService.crearProducto("lavandina", 10.99, 50, 1);
        tiendaService.crearProducto("arroz", 25.49, 30, 1);
        tiendaService.crearProducto("pritty cola", 5.99, 20, 2);

        tiendaService.modificarTienda(1, "Nueva Dirección", "Nuevo Representante");

        tiendaService.mostrarTiendas();

        List<Producto> todosLosProductos = tiendaService.obtenerTodosLosProductos();
        System.out.println("Lista de todos los productos:");
        for (Producto producto : todosLosProductos) {
            System.out.println(producto);
        }

        int tiendaId = 1;
        List<Producto> productosEnTienda = tiendaService.obtenerProductosPorTienda(tiendaId);
        System.out.println("Lista de productos en la tienda con ID " + tiendaId + ":");
        for (Producto producto : productosEnTienda) {
            System.out.println(producto);
        }
    }
}
