package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        // Leer la matriz desde el teclado
        leerMatriz(matriz);

        // Mostrar la matriz ingresada
        System.out.println("Matriz ingresada:");
        mostrarMatriz(matriz);

        // Verificar si es una matriz mágica
        if (esMatrizMagica(matriz)) {
            System.out.println("Es una matriz mágica.");
        } else {
            System.out.println("No es una matriz mágica.");
        }
    }

    // Método para leer la matriz desde el teclado
    public static void leerMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los números de la matriz (del 1 al 9):");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();

                // Verificar que los números sean válidos
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Número inválido. Intente nuevamente.");
                    j--;
                }
            }
        }
    }

    // Método para mostrar la matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para verificar si es una matriz mágica
    public static boolean esMatrizMagica(int[][] matriz) {
        // Calcular la suma objetivo (suma de filas, columnas y diagonales)
        int sumaObjetivo = matriz[0][0] + matriz[0][1] + matriz[0][2];

        // Verificar filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = matriz[i][0] + matriz[i][1] + matriz[i][2];
            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            int sumaColumna = matriz[0][j] + matriz[1][j] + matriz[2][j];
            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }

        // Verificar diagonales
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumaDiagonal1 != sumaObjetivo || sumaDiagonal2 != sumaObjetivo) {
            return false;
        }

        return true;
    }
}
