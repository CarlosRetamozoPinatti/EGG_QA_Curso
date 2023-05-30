package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int n = scanner.nextInt();

        int[] fibonacci = generarFibonacci(n);
        System.out.println("Sucesión de Fibonacci:");
        imprimirVector(fibonacci);

        scanner.close();
    }

    public static int[] generarFibonacci(int n) {
        int[] fibonacci = new int[n];
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void imprimirVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
