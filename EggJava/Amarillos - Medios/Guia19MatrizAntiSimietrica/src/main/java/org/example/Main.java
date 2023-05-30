package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{0, 2, -3}, {-2, 0, 4}, {3, -4, 0}};

        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Verificar si es antisimétrica
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    // Método para verificar si una matriz es antisimétrica
    public static boolean esAntisimetrica(int[][] matriz) {
        int n = matriz.length;

        // Verificar si la matriz es cuadrada
        if (n != matriz[0].length) {
            return false;
        }

        // Verificar si la matriz es antisimétrica
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
