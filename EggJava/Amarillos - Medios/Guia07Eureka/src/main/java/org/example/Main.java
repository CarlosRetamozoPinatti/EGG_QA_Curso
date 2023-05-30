package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();
        frase = frase.toLowerCase();

        if (frase.equals("eureka")){
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}