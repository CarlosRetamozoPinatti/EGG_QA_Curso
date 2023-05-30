package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lecturasBien = 0;
        int lecturasMal = 0;
        boolean fin = false;

        while (!fin){
            System.out.println("Ingrese una palabra: ");
            String palabra = scanner.nextLine();
            palabra = palabra.toUpperCase();

            if (palabra.equals("&&&&&")) {
                fin = true;
            } else if (palabra.length() == 5 && palabra.charAt(0) == 'X' && palabra.charAt(4) == '4') {
                lecturasBien++;
            } else {
                lecturasMal++;
            }
        }

        System.out.println("Reporte: ");
        System.out.println("Lecturas Correctas: " + lecturasBien);
        System.out.println("Lecturas Incorrectas: " + lecturasMal);
    }
}