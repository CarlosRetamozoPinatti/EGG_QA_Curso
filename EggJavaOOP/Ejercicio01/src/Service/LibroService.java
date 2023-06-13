package Service;

import Entity.Libro;
import java.util.Scanner;

public class LibroService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarLibro(){
        Libro libro = new Libro();

        System.out.println("Ingrese el titulo del libro: ");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor: ");
        libro.setAutor(leer.next());
        System.out.println("Ingrese el género al que pertenece el libro: ");
        libro.setGenero(leer.next());
        System.out.println("Ingrese el número de páginas del libro: ");
        libro.setPaginas(leer.nextInt());
        System.out.println("Ingrese el número de ISBN del libro: ");
        libro.setISBN(leer.nextInt());

        return libro;
    }

    public void mostrarLibro(Libro libro){

        System.out.println("El nombre del libro es: " + libro.getTitulo());
        System.out.println("Su género es: " + libro.getGenero());
        System.out.println("Su autor es: " + libro.getAutor());
        System.out.println("Tiene " + libro.getPaginas() + " páginas");
        System.out.println("Su ISBN es: " + libro.getISBN());
    }
}
