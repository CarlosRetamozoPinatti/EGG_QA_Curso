package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero (ingrese un múltiplo de cinco para detener): ");
            int numero = scanner.nextInt();

            if (numero % 5 == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }

            cantidadNumeros++;

            if (numero % 2 == 0) {
                cantidadPares++;
            } else {
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad de números leídos: " + cantidadNumeros);
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
