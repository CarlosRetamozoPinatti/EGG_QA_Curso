import Entity.Libro;
import Service.LibroService;

//COMO BUENAS PRACTICAS, EN EL MAIN SOLO VAN LOS LLAMADOS A METODOS.

public class Main {
    public static void main(String[] args) {

        LibroService serv = new LibroService();

        Libro lib1 = serv.cargarLibro();
        serv.mostrarLibro(lib1);

        System.out.println("\n");

        Libro lib2 = serv.cargarLibro();
        serv.mostrarLibro(lib2);

    }
}