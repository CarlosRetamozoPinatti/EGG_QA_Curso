import Entity.Pelicula;
import Service.MenuService;
import Service.PeliculaService;

public class Main {
    public static void main(String[] args) {
        MenuService menu = new MenuService();
        menu.mostrarMenu();
    }
}