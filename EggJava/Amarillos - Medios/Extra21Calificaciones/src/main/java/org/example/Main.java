package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidadAlumnos = 10;
        double[] promedios = new double[cantidadAlumnos];

        cargarNotas(promedios);
        int aprobados = contarAprobados(promedios);
        int desaprobados = cantidadAlumnos - aprobados;

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    public static void cargarNotas(double[] promedios) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Alumno " + (i + 1));
            double notaPractico1 = ingresarNota(scanner, "primer trabajo práctico evaluativo");
            double notaPractico2 = ingresarNota(scanner, "segundo trabajo práctico evaluativo");
            double notaIntegrador1 = ingresarNota(scanner, "primer integrador");
            double notaIntegrador2 = ingresarNota(scanner, "segundo integrador");

            double promedio = calcularPromedio(notaPractico1, notaPractico2, notaIntegrador1, notaIntegrador2);
            promedios[i] = promedio;
        }
    }

    public static double ingresarNota(Scanner scanner, String examen) {
        double nota;
        do {
            System.out.print("Ingrese la nota del " + examen + ": ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 100);
        return nota;
    }

    public static double calcularPromedio(double notaPractico1, double notaPractico2, double notaIntegrador1, double notaIntegrador2) {
        double promedio = (notaPractico1 * 0.10 + notaPractico2 * 0.15 + notaIntegrador1 * 0.25 + notaIntegrador2 * 0.50) / 4.0;
        return promedio;
    }

    public static int contarAprobados(double[] promedios) {
        int contador = 0;

        for (double promedio : promedios) {
            if (promedio >= 7) {
                contador++;
            }
        }

        return contador;
    }
}

