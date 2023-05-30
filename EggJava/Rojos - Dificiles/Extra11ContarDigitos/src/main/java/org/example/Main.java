package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int numeroAbsoluto = Math.abs(numero); // Tomar valor absoluto para considerar números negativos

        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10; // Dividir por 10 para "eliminar" el último dígito
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígito(s).");
    }
}
