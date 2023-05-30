package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Centigrados: ");
        int gCent = scanner.nextInt();

        int gFahr = 32 + (9 * gCent / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + gFahr);
    }
}