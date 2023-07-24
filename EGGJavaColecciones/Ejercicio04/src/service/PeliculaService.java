package service;

import entity.Pelicula;

import java.util.*;

public class PeliculaService {
    private List<Pelicula> listaPelicula;

    public PeliculaService() {
        listaPelicula = new ArrayList<>();
    }

    public void altaPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre de la película: ");
            String titulo = leer.next();
            System.out.print("Ingrese el género de la película: ");
            String genero = leer.next();
            System.out.print("Ingrese la duración de la película EN MINUTOS: ");
            double duracion = leer.nextDouble();

            Pelicula peli = new Pelicula(titulo, genero, duracion);
            listaPelicula.add(peli);
            System.out.println("Pelicula agregada!!");
            System.out.println(peli);

            System.out.print("Desea agregar otra pelicula (s/n): ?");
            String respuesta = leer.next();
            continuar = respuesta.equalsIgnoreCase("s");
            if (!continuar) {
                System.out.println("Alta de peliculas finalizada!!");
            }
        }
    }

    public void mostrarCatalogo() {
        System.out.println("---Lista Completa de Peliculas---");
        if (listaPelicula.isEmpty()) {
            System.out.println("El catálogo de películas está vacío.");
        } else {
            listaPelicula.forEach(peli -> System.out.println(peli));
        }
        System.out.println("---Fin de La Lista---");
    }

    public void mostrarAlfabeticamente() {
        if (listaPelicula.isEmpty()) {
            System.out.println("El catálogo de películas está vacío.");
        } else {
            listaPelicula.sort(Comparator.comparing(Pelicula::getTitulo));
            System.out.println("\n--- Películas ordenadas por título (alfabéticamente) ---");
            listaPelicula.forEach(peli -> System.out.println(peli));
        }
    }

    public void mostrarMayorA60() {
        System.out.println("---Peliculas con duracion mayor a 1 hora---");
        listaPelicula.stream()
                .filter(peli -> peli.getDuracion() > 60)
                .forEach(peli -> System.out.println(peli));
    }

    public void mostrarDuracionMinMax() {
        if (listaPelicula.isEmpty()) {
            System.out.println("El catálogo de películas está vacío.");
        } else {
            listaPelicula.sort(Comparator.comparingDouble(Pelicula::getDuracion));
            System.out.println("\n--- Películas ordenadas por duración (de menor a mayor) ---");
            listaPelicula.forEach(peli -> System.out.println(peli));
        }
    }

    public void mostrarDuracionMaxMin() {
        if (listaPelicula.isEmpty()) {
            System.out.println("El catálogo de películas está vacío.");
        } else {
            listaPelicula.sort((p1, p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));
            System.out.println("--- Películas ordenadas por duración (de mayor a menor) ---");
            listaPelicula.forEach(peli -> System.out.println(peli));
        }
    }

    public void mostrarPorGenero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el género para filtrar: ");
        String generoFiltro = scanner.nextLine();

        // Validación para verificar si hay alguna película con el género ingresado
        boolean existeGenero = listaPelicula.stream()
                .anyMatch(peli -> peli.getGenero().equalsIgnoreCase(generoFiltro));
        if (existeGenero) {
            System.out.println("\n--- Películas del género " + generoFiltro + " ---");
            listaPelicula.stream()
                    .filter(peli -> peli.getGenero().equalsIgnoreCase(generoFiltro))
                    .forEach(peli -> System.out.println(peli));
        } else {
            System.out.println("No se encontraron películas con el género " + generoFiltro);
        }
    }
}



