package Service;

import Entity.Matematica;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in);
    MatematicaService service = new MatematicaService();
    Matematica op = service.crearOp();


    public void mostrarMenu(){
        int opcion;

        System.out.println("1 - Revisar los numeros generados \n"
                + "2 - Maximo \n"
                + "3 - Potencia \n"
                + "4 - Raiz \n"
                + "5 - Generar nuevos numeros \n"
                + "6 - Salir");

        do {
            System.out.println("ingrese una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                        System.out.println(op.toString());
                case 2 ->
                        System.out.println(service.devolverMax(op));
                case 3 ->
                        System.out.println(service.calcularPotencia(op));
                case 4 ->
                        System.out.println(service.calcularRaiz(op));
                case 6 -> System.out.println("Adios!");
                case 5 -> {
                    op.setNum1(Math.random()*10);
                    op.setNum2(Math.random()*10);
                    System.out.println("1 - Revisar los numeros generados \n"
                            + "2 - Maximo \n"
                            + "3 - Potencia \n"
                            + "4 - Raiz \n"
                            + "5 - Generar nuevos numeros \n"
                            + "6 - Salir");
                }
                default -> System.out.println("Opcion Invalida");
            }
        } while (opcion != 6);
    }
}


