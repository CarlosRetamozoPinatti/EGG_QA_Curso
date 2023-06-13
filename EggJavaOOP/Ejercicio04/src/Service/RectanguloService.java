package Service;

import Entity.Rectangulo;

import java.util.Scanner;

public class RectanguloService {
    private final Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {

        Rectangulo n = new Rectangulo();

        System.out.println("Ingrese la base");

        n.setBase(leer.nextDouble());

        System.out.println("Ingrese la altura");

        n.setAltura(leer.nextDouble());

        return n;

    }

    public double calcularSuperficie(double base, double altura) {
        double sup = base * altura;
        String supCorto = String.format("%.2f", sup).replace(",", ".");
        return Double.parseDouble(supCorto);

    }

    public double calcularPerimetro(double base, double altura) {
        double perim = (base + altura) * 2;
        String perimCorto = String.format("%.2f", perim).replace(",", ".");
        return Double.parseDouble(perimCorto);
    }

    public void dibujarRectangulo(double base, double altura) {

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {

                if ((i > 1 && i < altura) && (j > 1 && j < base)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }

}

