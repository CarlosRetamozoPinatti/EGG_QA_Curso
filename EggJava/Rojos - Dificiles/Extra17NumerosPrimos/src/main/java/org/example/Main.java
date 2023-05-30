package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean esPrimo = esPrimo(numero);

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        //1 No es primo por definicion. Un numero natural mayor a 1
        if (numero <= 1) {
            return false;
        }
        //Recorremos desde 2 hasta la raiz cuadrada del numero para saber si hay otro divisor.
        //Se utiliza la raiz cuadrada por contener la cantidad minima de numeros divisibles.
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
