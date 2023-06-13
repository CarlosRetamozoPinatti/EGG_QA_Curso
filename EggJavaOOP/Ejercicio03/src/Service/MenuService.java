package Service;

import Entity.Operacion;

import java.util.Scanner;

public class MenuService {
    Scanner leer = new Scanner(System.in);
    OperacionService ServOp = new OperacionService();
    Operacion op1 = ServOp.crearOperacion();

    public void mostrarMenu() {

        int opcion;

        System.out.println("1 - Suma \n"
                + "2 - Resta \n"
                + "3 - Multiplicación \n"
                + "4 - División \n"
                + "5 - Reingresar numeros \n"
                + "6 - Salir");

        do {
            System.out.println("ingrese una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                        System.out.println(op1.getNum1() + " + " + op1.getNum2() + " = " + ServOp.sumar(op1.getNum1(), op1.getNum2()));
                case 2 ->
                        System.out.println(op1.getNum1() + " - " + op1.getNum2() + " = " + ServOp.restar(op1.getNum1(), op1.getNum2()));
                case 3 ->
                        System.out.println(op1.getNum1() + " x " + op1.getNum2() + " = " + ServOp.multiplicar(op1.getNum1(), op1.getNum2()));
                case 4 ->
                        System.out.println(op1.getNum1() + " / " + op1.getNum2() + " = " + ServOp.dividir(op1.getNum1(), op1.getNum2()));
                case 6 -> System.out.println("Adios!");
                case 5 -> {
                    Operacion op1 = ServOp.crearOperacion();
                    System.out.println("1 - Suma \n"
                            + "2 - Resta \n"
                            + "3 - Multiplicación \n"
                            + "4 - División \n"
                            + "5 - Reingresar numeros \n"
                            + "6 - Salir");
                }
                default -> System.out.println("Opcion Invalida");
            }
        } while (opcion != 6);
    }
}
