package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero lìmite: ");
        int limite = scanner.nextInt();

        int suma = 0;
        int numero;

        do {
            System.out.println("Ahora ingrese un numero: ");
            numero = scanner.nextInt();
            suma += numero;
            System.out.println("Actualmente la suma es: " + suma + " y el limite puesto es: " + limite);
        } while (suma <= limite);

        System.out.println("La suma de los numeros acaba de superar el limite: " + limite);
        System.out.println("La suma total es de: " + suma);
    }
}