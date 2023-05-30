package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        // Leer matriz M desde el usuario
        System.out.println("Ingrese los valores de la matriz M (10x10):");
        leerMatriz(matrizM);

        // Leer matriz P desde el usuario
        System.out.println("Ingrese los valores de la matriz P (3x3):");
        leerMatriz(matrizP);

        // Verificar si la matriz P está contenida en la matriz M
        boolean encontrada = false;
        int filaInicio = -1;
        int columnaInicio = -1;

        for (int i = 0; i <= matrizM.length - matrizP.length; i++) {
            for (int j = 0; j <= matrizM[i].length - matrizP[0].length; j++) {
                if (verificarSubmatriz(matrizM, matrizP, i, j)) {
                    encontrada = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }

        // Mostrar resultados
        if (encontrada) {
            System.out.println("La submatriz P está contenida en la matriz M.");
            System.out.println("Índices de inicio: fila " + filaInicio + ", columna " + columnaInicio);
        } else {
            System.out.println("La submatriz P no está contenida en la matriz M.");
        }
    }

    // Método para leer una matriz desde el usuario
    public static void leerMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para verificar si una submatriz está contenida en una matriz
    public static boolean verificarSubmatriz(int[][] matrizM, int[][] matrizP, int filaInicio, int columnaInicio) {
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP[i].length; j++) {
                if (matrizM[filaInicio + i][columnaInicio + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
