package service;

import entity.Libro;

import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class LibroService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Set<Libro> libros;

    public LibroService() {
        libros = new HashSet<>();
    }

    public void agregarLibros() {
        System.out.println("A continuación, ingrese los datos de los libros.");
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el título del libro: ");
            String titulo = leer.nextLine().trim();
            while (titulo.isEmpty()) {
                System.out.println("Error: El título del libro no puede estar vacío. Ingrese nuevamente: ");
                titulo = leer.nextLine().trim();
            }
            System.out.println("Ingrese el nombre del autor del libro: ");
            String autor = leer.nextLine().trim();
            while (autor.isEmpty()) {
                System.out.println("Error: El nombre del autor no puede estar vacío. Ingrese nuevamente: ");
                autor = leer.nextLine().trim();
            }
            int numEjemplares = 0;
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.println("Cuantos ejemplares posee inicialmente el libro?: ");
                    numEjemplares = Integer.parseInt(leer.nextLine());
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido.");
                }
            }
            Libro libro = new Libro(titulo, autor, numEjemplares);
            libros.add(libro);
            System.out.println("Libro agregado exitosamente!!");
            System.out.println("¿Desea agregar otro libro? (s/n)");
            String respuesta = leer.nextLine().trim().toLowerCase();
            while (!respuesta.equals("s") && !respuesta.equals("n")) {
                System.out.println("Error: Ingrese 's' para continuar o 'n' para salir.");
                respuesta = leer.nextLine().trim().toLowerCase();
            }
            continuar = respuesta.equals("s");
        }
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La librería no tiene ningún libro.");
        } else {
            System.out.println("----- Lista de Libros en la Librería -----");
            libros.forEach(System.out::println);
            System.out.println("------------------------------------------");
        }
    }

    public void buscarLibro() {
        if (libros.isEmpty()) {
            System.out.println("La librería no tiene ningún libro.");
        } else {
            System.out.println("Ingrese el título del libro a buscar: ");
            String titulo = leer.next();
            Optional<Libro> libroEncontrado = libros.stream()
                    .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                    .findFirst();
            if (libroEncontrado.isPresent()) {
                System.out.println("Libro encontrado!!");
                System.out.println(libroEncontrado.get());
            } else {
                System.out.println("El libro no existe en la librería.");
            }
        }
    }

    public void prestarLibro() {
        if (libros.isEmpty()) {
            System.out.println("La librería no tiene ningún libro.");
        } else {
            System.out.println("Ingrese el título del libro a prestar: ");
            String titulo = leer.next();
            Optional<Libro> libroEncontrado = libros.stream()
                    .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                    .findFirst();
            if (libroEncontrado.isPresent()) {
                if (libroEncontrado.get().prestamo()) {
                    System.out.println("Libro prestado exitosamente!!");
                } else {
                    System.out.println("No quedan ejemplares disponibles para prestar.");
                }
            } else {
                System.out.println("El libro no existe en la librería.");
            }
        }
    }

    public void devolverLibro() {
        if (libros.isEmpty()) {
            System.out.println("La librería no tiene ningún libro.");
        } else {
            System.out.println("Ingrese el título del libro a devolver: ");
            String titulo = leer.next();
            Optional<Libro> libroEncontrado = libros.stream()
                    .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                    .findFirst();
            if (libroEncontrado.isPresent()) {
                if (libroEncontrado.get().devolucion()) {
                    System.out.println("Libro devuelto exitosamente!!");
                } else {
                    System.out.println("El libro no tiene ejemplares prestados.");
                }
            } else {
                System.out.println("El libro no existe en la librería.");
            }
        }
    }
}
