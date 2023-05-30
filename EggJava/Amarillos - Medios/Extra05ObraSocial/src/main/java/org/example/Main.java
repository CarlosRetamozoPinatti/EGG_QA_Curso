package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clase del socio (A, B o C): ");
        char claseSocio = scanner.next().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = scanner.nextDouble();

        double importePagar = 0;

        switch (claseSocio) {
            case 'A' -> importePagar = costoTratamiento * 0.5;
            case 'B' -> importePagar = costoTratamiento * 0.65;
            case 'C' -> importePagar = costoTratamiento;
            default -> {
                System.out.println("Clase de socio inválida.");
                return;
            }
        }

        System.out.println("Importe en efectivo a pagar por el socio: " + importePagar);
    }
}
