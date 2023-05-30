package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar dos números aleatorios entre 0 y 10
        int numero1 = (int) (Math.random() * 11);
        int numero2 = (int) (Math.random() * 11);

        int resultado = numero1 * numero2;
        int respuesta;

        System.out.println("Adivine el resultado de la multiplicación:");
        System.out.print(numero1 + " * " + numero2 + " = ");
        respuesta = scanner.nextInt();

        while (respuesta != resultado) {
            System.out.println("Respuesta incorrecta. Inténtelo nuevamente.");
            System.out.print(numero1 + " * " + numero2 + " = ");
            respuesta = scanner.nextInt();
        }

        System.out.println("¡Respuesta correcta!");
    }
}
