package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[5];
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = ingresarPalabra(scanner, i + 1);
        }

        char[][] sopaLetras = crearSopaLetras(palabras);
        imprimirSopaLetras(sopaLetras);

        scanner.close();
    }

    public static String ingresarPalabra(Scanner scanner, int indice) {
        String palabra;
        do {
            System.out.print("Ingrese la palabra #" + indice + " (entre 3 y 5 caracteres): ");
            palabra = scanner.nextLine();
        } while (palabra.length() < 3 || palabra.length() > 5);
        return palabra;
    }

    public static char[][] crearSopaLetras(String[] palabras) {
        char[][] sopaLetras = new char[20][20];

        // Rellenar con números aleatorios
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                sopaLetras[i][j] = obtenerNumeroAleatorio();
            }
        }

        // Ubicar las palabras en una fila seleccionada aleatoriamente
        int fila = obtenerNumeroAleatorio(20);
        int columna = 0;
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopaLetras[fila][columna] = palabra.charAt(i);
                columna++;
            }
        }

        return sopaLetras;
    }

    public static void imprimirSopaLetras(char[][] sopaLetras) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char obtenerNumeroAleatorio() {
        return (char) (Math.random() * 10 + '0');
    }

    public static int obtenerNumeroAleatorio(int max) {
        return (int) (Math.random() * max);
    }
}
