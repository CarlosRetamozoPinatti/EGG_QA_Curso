package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo (las raices cuadradas explotan con negativos): ");
        float numero = scanner.nextFloat();

        float doble = numero * 2;
        float triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El tripe de " + numero + " es: " + triple);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}