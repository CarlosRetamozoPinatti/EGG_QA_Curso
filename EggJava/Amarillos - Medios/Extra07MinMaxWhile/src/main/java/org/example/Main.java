package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int contador = 1;
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;

        while (contador <= n) {
            System.out.print("Ingrese el número #" + contador + ": ");
            numero = scanner.nextInt();

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            suma += numero;
            contador++;
        }

        double promedio = (double) suma / n;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }
}
