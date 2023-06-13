import Entity.Rectangulo;
import Service.RectanguloService;

import java.util.Scanner;

public class Main {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

            RectanguloService rec1 = new RectanguloService();

            Rectangulo op1 = rec1.crearRectangulo();

            int opcion;

            System.out.println("1.Superficie \n"
                    + "2.Perimetro \n"
                    + "3.Dibujar Rectangulo \n"
                    + "4.Salir");

            do {
                System.out.println("Ingrese una opcion");
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1 ->
                            System.out.println("La superficie es: " + rec1.calcularSuperficie(op1.getBase(), op1.getAltura()));
                    case 2 ->
                            System.out.println("El perimetro es: " + rec1.calcularPerimetro(op1.getBase(), op1.getAltura()));
                    case 3 -> rec1.dibujarRectangulo(op1.getAltura(), op1.getBase());
                    case 4 -> System.out.println("Usted salió");
                    default -> System.out.println("Opcion invalida");
                }
            } while (opcion != 4);

        }
    }
