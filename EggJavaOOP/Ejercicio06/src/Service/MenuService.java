package Service;

import Entity.Cafetera;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in);
    CafeteraService service = new CafeteraService();
    Cafetera cafetera = service.crearCafetera();

    public void mostrarMenu(){

        int opcion;

        System.out.println("1.Servir una taza");
        System.out.println("2.Vaciar cafetera");
        System.out.println("3.Agregar Café");
        System.out.println("4.Salir");

        do {
            System.out.println("Ingrese una opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                        service.servirTaza(cafetera);
                case 2 ->
                        service.vaciarCafetera(cafetera);
                case 3 ->
                        service.agregarCafe(cafetera);
                case 4 ->
                        System.out.println("Usted ha salido");
                default ->
                        System.out.println("Opción invalida");
            }
        } while (opcion != 4);
    }
}
