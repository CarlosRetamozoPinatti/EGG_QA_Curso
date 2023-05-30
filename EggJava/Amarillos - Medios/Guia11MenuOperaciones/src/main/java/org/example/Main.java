package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Elija una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    hacerSuma();
                    break;
                case 2:
                    hacerResta();
                    break;
                case 3:
                    hacerMulti();
                    break;
                case 4:
                    hacerDiv();
                    break;
                case 5:
                    System.out.println("Hasta Luego!");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor, elija una opcion correcta");
                    break;
            }
        } while (opcion != 5);
    }

    public static void hacerSuma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void hacerResta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void hacerMulti() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void hacerDiv() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        if (divisor != 0) {
            int resultado = dividendo / divisor;
            System.out.println("El resultado de la division es: " + resultado);
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }
}