package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Ingrese el valor de C: ");
        int C = scanner.nextInt();

        System.out.print("Ingrese el valor de D: ");
        int D = scanner.nextInt();

        System.out.println("Valores iniciales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        // Intercambio de valores utilizando una variable auxiliar
        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;

        System.out.println("Valores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
