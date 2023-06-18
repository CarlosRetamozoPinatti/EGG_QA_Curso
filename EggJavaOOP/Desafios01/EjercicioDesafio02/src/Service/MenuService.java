package Service;

import Entity.Figura;

import java.util.Scanner;

public class MenuService {

    public void mostrarMenu(){
        Scanner leer = new Scanner(System.in);
        FiguraService service = new FiguraService();
        Figura fig = service.crearFigura();

        int opcion;

        System.out.println("""
                1. Cuadrado - crear y calcular perimetro y area. 
                2. Rectangulo - crear y calcular perimetro y area.
                3. Triangulo - crear y calcular perimetro y area.
                4. Circulo - crear y calcular perimetro y area.
                5. Hexagono - crear y calcular perimetro y area. 
                6. Pentagono - crear y calcular perimetro y area.
                7. Rombo - crear y calcular perimetro y area.
                8. Salir.""");

        do {
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion){
                case 1 -> {
                    service.crearCuadrado();
                    service.perimCuadrado(fig);
                    service.areaCuadrado(fig);
                }
                case 2 -> {
                    service.crearRectangulo();
                    service.perimRectangulo(fig);
                    service.areaRectangulo(fig);
                }
                case 3 -> {
                    service.crearTriangulo();
                    service.perimTriangulo(fig);
                    service.areaTriangulo(fig);
                }
                case 4 -> {
                    service.crearCirculo();
                    service.perimCirculo(fig);
                    service.areaCirculo(fig);
                }
                case 5 -> {
                    service.crearHexagono();
                    service.perimHexagono(fig);
                    service.areaHexagono(fig);
                }
                case 6 -> {
                    service.crearPentagono();
                    service.perimPentagono(fig);
                    service.areaPentagono(fig);
                }
                case 7 -> {
                    service.crearRombo();
                    service.perimRombo(fig);
                    service.areaRombo(fig);
                }
                case 8 -> {
                    System.out.println("Adios!");
                    System.out.println("Usted ha salido");
                }
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 8);
    }


}
