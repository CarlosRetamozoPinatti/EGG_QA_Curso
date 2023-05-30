package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();

        System.out.println("La frase en mayusculas: " + mayus);
        System.out.println("La frase en minusculas: " + minus);
    }
}