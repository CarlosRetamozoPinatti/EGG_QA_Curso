

import java.util.Scanner;

public class ServicioMenu {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    GestorNumeros serv = new GestorNumeros();

    public void mostrarOpciones(){
        System.out.println("""
                Que desea hacer?:
                1 - Agregar numeros al array.
                2 - Ver cantidad de numeros agregados.
                3 - Ver suma de todos los numeros agregados.
                4 - Ver el promedio de todos los numeros.                
                0 - Salir""");
    }
    public void mostrarMenu(){
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion){
                case 1 -> serv.leerNumeros();
                case 2 -> System.out.println("Se ingresaron " + serv.getCantidadValores() + " numeros.");
                case 3 -> System.out.println("La suma de todos los numeros es: " + serv.getSuma());
                case 4 -> System.out.println("El promedio de todos los numeros es: " + serv.getPromedio());
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }
}