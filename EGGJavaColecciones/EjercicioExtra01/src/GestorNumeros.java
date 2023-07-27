import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class GestorNumeros {
    private List<Integer> numeros;

    public GestorNumeros() {
        numeros = new ArrayList<>();
    }

    public void leerNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese valores numéricos enteros (ingrese -99 para terminar):");
        try {
            while (true) {
                int input = scanner.nextInt();
                if (input == -99) {
                    break;
                }
                numeros.add(input);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese solo valores numéricos enteros.");
        }
    }

    public int getCantidadValores() {
        return numeros.size();
    }

    public int getSuma() {
        return numeros.stream().mapToInt(Integer::intValue).sum();
    }

    public double getPromedio() {
        int cantidadValores = getCantidadValores();
        return cantidadValores > 0 ? (double) getSuma() / cantidadValores : 0.0;
    }
}

