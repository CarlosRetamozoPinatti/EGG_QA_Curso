package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de los dos numeros es: "+ suma);
    }
}