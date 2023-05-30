package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        // Crear el vector y rellenarlo con valores aleatorios
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // Generar un número aleatorio entre 0 y 99
        }

        System.out.println("Vector generado: " + Arrays.toString(vector));

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();

        boolean encontrado = false;
        int contadorRepeticiones = 0;

        // Buscar el número en el vector
        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscar) {
                if (!encontrado) {
                    System.out.println("El número se encuentra en la posición: " + i);
                    encontrado = true;
                }
                contadorRepeticiones++;
            }
        }

        if (encontrado) {
            if (contadorRepeticiones > 1) {
                System.out.println("El número se encuentra repetido en el vector.");
            } else {
                System.out.println("El número no se encuentra repetido en el vector.");
            }
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }
    }
}
