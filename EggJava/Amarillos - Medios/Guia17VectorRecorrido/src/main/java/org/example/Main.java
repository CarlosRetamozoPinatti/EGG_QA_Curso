package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            vector[i] = scanner.nextInt();
        }

        int[] conteoDigitos = new int[6]; // Un arreglo para contar los números de 1 a 5 dígitos

        for (int i = 0; i < n; i++) {
            int numero = vector[i];
            int digitos = contarDigitos(numero);
            if (digitos >= 1 && digitos <= 5) {
                conteoDigitos[digitos]++;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígito(s): " + conteoDigitos[i]);
        }
    }

    // Función para contar la cantidad de dígitos de un número
    public static int contarDigitos(int numero) {
        if (numero < 0) {
            numero = -numero; // Tomamos el valor absoluto si el número es negativo
        }
        if (numero == 0) {
            return 1; // El número 0 tiene 1 dígito
        }
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }
}
