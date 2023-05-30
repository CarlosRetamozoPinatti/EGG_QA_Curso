package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = scanner.nextInt();

        int horasTotales = minutos / 60;
        int dias = horasTotales / 24;
        int horas = horasTotales % 24;
        int minutosRestantes = minutos % 60;

        System.out.println("Equivalente: " + dias + " día(s), " + horas + " hora(s), " + minutosRestantes + " minuto(s).");
    }
}
