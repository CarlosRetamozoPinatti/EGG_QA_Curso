package org.example;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vector = new int[10]; // Tamaño del vector
        rellenarVectorAleatorio(vector);
        imprimirVector(vector);
    }
    public static void rellenarVectorAleatorio(int[] vector) {
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
    }
    public static void imprimirVector(int[] vector) {
        System.out.println("Elementos del vector:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
    }
}
