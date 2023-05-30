package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor ingrese el tamaño del cuadrado : ");
        int n = teclado.nextInt();

        if (n >= 0 && n <= 50) {
            //Linea superior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            //centro de la forma
            for (int i = 0; i < n - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            //Linea inferior
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Error. La dimension del cuadrado debe ser como maximo de 50");
        }
    }
}