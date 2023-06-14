package Service;

import Entity.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MenuService {

    public void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        PersonaService service = new PersonaService();
        Persona p1 = service.crearPersona();

        int opcion;

        System.out.println("""
                1.Calcular Edad 
                2.Comparar edades 
                3.Mostrar información
                4.Salir""");

        do {

            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> service.calcularEdad(p1);
                case 2 -> {
                    System.out.println("Ingrese la edad a comparar");
                    int edad = leer.nextInt();

                    if (service.menorQue(p1, edad)) {
                        System.out.println("La persona es menor de " + edad + " años");
                    } else {
                        System.out.println("La persona es mayor de " + edad + " años ");
                    }
                }
                case 3 -> System.out.println(p1.toString());
                case 4 -> System.out.println("Usted salió");
                default -> System.out.println("Opcion incorrecta");
            }
        } while (opcion != 4);
    }
}

