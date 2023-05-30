package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int n = scanner.nextInt();

        double sumaTotal = 0;
        double sumaDebajo160 = 0;
        int contadorDebajo160 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + " (en metros): ");
            double estatura = scanner.nextDouble();

            sumaTotal += estatura;

            if (estatura < 1.60) {
                sumaDebajo160 += estatura;
                contadorDebajo160++;
            }
        }

        double promedioDebajo160 = sumaDebajo160 / contadorDebajo160;
        double promedioGeneral = sumaTotal / n;

        System.out.println("Promedio de estaturas por debajo de 1.60 m: " + promedioDebajo160 + " metros");
        System.out.println("Promedio de estaturas en general: " + promedioGeneral + " metros");
    }
}
