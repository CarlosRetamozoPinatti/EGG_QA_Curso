package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String letra = scanner.nextLine();

        if (letra.length() == 1) {
            letra = letra.toLowerCase();

            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }
        } else {
            System.out.println("Debe ingresar solo una letra.");
        }
    }
}
