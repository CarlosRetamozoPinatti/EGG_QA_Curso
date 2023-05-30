package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (palabra.length() == 8){
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
}