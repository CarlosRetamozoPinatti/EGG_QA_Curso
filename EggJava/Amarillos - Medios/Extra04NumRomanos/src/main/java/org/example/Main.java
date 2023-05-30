package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = scanner.nextInt();

        String numeroRomano = "";

        switch (numero) {
            case 1 -> numeroRomano = "I";
            case 2 -> numeroRomano = "II";
            case 3 -> numeroRomano = "III";
            case 4 -> numeroRomano = "IV";
            case 5 -> numeroRomano = "V";
            case 6 -> numeroRomano = "VI";
            case 7 -> numeroRomano = "VII";
            case 8 -> numeroRomano = "VIII";
            case 9 -> numeroRomano = "IX";
            case 10 -> numeroRomano = "X";
            default -> {
                System.out.println("El número ingresado está fuera del rango válido.");
                return;
            }
        }

        System.out.println("El número " + numero + " en romano es: " + numeroRomano);
    }
}
