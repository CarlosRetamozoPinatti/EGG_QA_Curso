import entity.Productos;
import service.MenuService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuService menu = new MenuService();
        menu.mostrarMenu();
    }
}
