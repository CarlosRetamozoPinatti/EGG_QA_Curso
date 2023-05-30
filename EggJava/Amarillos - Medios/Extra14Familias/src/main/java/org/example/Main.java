package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int numFamilias = scanner.nextInt();

        int totalHijos = 0;
        int totalEdades = 0;

        for (int i = 1; i <= numFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos para la familia " + i + ": ");
            int numHijos = scanner.nextInt();

            for (int j = 1; j <= numHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = scanner.nextInt();

                totalHijos++;
                totalEdades += edadHijo;
            }
        }

        int mediaEdad = totalEdades / totalHijos;

        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
