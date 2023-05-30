package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int opcion;

        do {
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();

            System.out.println("Seleccione la operación a realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double suma = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                case 2:
                    double resta = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    double multiplicacion = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        double division = dividir(num1, num2);
                        System.out.println("El resultado de la división es: " + division);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static double restar(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}

