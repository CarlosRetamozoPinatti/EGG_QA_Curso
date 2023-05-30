package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra: ");
        String frase = scanner.nextLine();
        frase = frase.toUpperCase();

        if (frase.substring(0,1).equals("A")){
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
}// (frase.substring(0,1).equals("A")) se puede reemplazar por frase.charAt(0) == 'A' como sintaxis alternativa.