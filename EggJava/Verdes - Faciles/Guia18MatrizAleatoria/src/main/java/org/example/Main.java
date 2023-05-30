package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];

        // Rellenar matriz con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100); // Generar número aleatorio entre 0 y 99
            }
        }

        // Mostrar matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Calcular matriz traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        // Mostrar matriz traspuesta
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
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
