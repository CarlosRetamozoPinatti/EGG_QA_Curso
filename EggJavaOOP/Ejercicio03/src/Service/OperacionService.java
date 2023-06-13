package Service;

import Entity.Operacion;

import java.util.Scanner;

public class OperacionService {
    private final Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion(){
        Operacion numeros = new Operacion();

        System.out.println("Ingrese el primer numero (dividendo en caso de division): ");
        numeros.setNum1(leer.nextInt());
        System.out.println("Ingrese el segundo numero (divisor en caso de division): ");
        numeros.setNum2(leer.nextInt());

        return numeros;
    }

    public int sumar(int num1, int num2){
        return num1 + num2;
    }
    public int restar(int num1, int num2){
        return num1 - num2;
    }
    public int multiplicar(int num1, int num2){
        if (num1 == 0 || num2 == 0){
            System.out.println("Error - Se introdujo un cero.");
            }
        return num1 * num2;
    }
    public float dividir(int num1, int num2){
        if (num2 == 0){
            System.out.println("ERROR MATEMATICO");
            return 0;
        } else {
            return (float) num1 / num2;
        }
    }
}
