package Service;

import Entity.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> catalogo = new ArrayList<>();

    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el nombre de la pelicula: ");
        pelicula.setNombre(leer.nextLine());
        System.out.println("Ingrese el genero de la pelicula: ");
        pelicula.setGenero(leer.nextLine());
        System.out.println("Ingrese su duraciòn: ");
        pelicula.setDuracion(Integer.parseInt(leer.nextLine()));
        pelicula.setDisponible(true);

        catalogo.add(pelicula);
        System.out.println("PELICULA AÑADIDA AL CATALOGO!");
        System.out.println(pelicula);

        return pelicula;
    }
    public void imprimirCatalogo() {
        System.out.println("Catalogo de películas");
        if (catalogo == null) {
            System.out.println("No hay peliculas registradas");
        } else {
            System.out.println(catalogo);
        }
    }
    public Pelicula buscarPorNombre(){
        System.out.println("Ingrese el nombre de la pelicula: ");
        String nombre = leer.nextLine();
        for (Pelicula pelicula : catalogo){
            if (pelicula.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(pelicula);;
            } else {
                System.out.println("La pelicula no se encuentra en nuestra base de datos..");
            }
        }
        return null;
    }

    public void buscarPorGenero(){
        System.out.println("Ingrese el genero");
        String genero = leer.nextLine();
        List<Pelicula> encontradas = new ArrayList<>();
        for (Pelicula pelicula : catalogo){
            if (pelicula.getGenero().equalsIgnoreCase(genero)){
                encontradas.add(pelicula);
            }
        }
        System.out.println(encontradas);
    }
}
