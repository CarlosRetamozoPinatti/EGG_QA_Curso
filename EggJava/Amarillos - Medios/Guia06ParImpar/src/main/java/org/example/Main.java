package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        float numero = scanner.nextFloat();

        if (numero % 2 == 0){
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }
}