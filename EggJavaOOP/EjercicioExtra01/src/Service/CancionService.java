package Service;

import Entity.Cancion;

import java.util.Scanner;

public class CancionService {
    Scanner leer = new Scanner(System.in);
    Cancion song1 = new Cancion();

    public Cancion crearCancion(){
        System.out.println("Ingrese el nombre de la cancion: ");
        song1.setNombre(leer.nextLine());
        System.out.println("Ingrese su autor: ");
        song1.setAutor(leer.nextLine());

        return song1;
    }

    public void mostrarCancion(Cancion song1){
        System.out.println(song1.toString());
    }
}
