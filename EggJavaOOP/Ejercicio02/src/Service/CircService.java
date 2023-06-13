package Service;

import Entity.Circunferencia;

import java.util.Scanner;

public class CircService {
    private final Scanner leer = new Scanner(System.in);

    public Circunferencia crearCirc(){

        Circunferencia circ = new Circunferencia();

        System.out.println("Ingrese el radio de la circunferencia: ");
        circ.setRadio(leer.nextDouble());
        return circ;
    }

    public double areaCirc(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        String areaCorta = String.format("%.2f", area).replace(",", ".");
        return Double.parseDouble(areaCorta);
    }

    public double perimCirc(double radio){
        double perim = 2 * Math.PI * radio;
        String perimCorto = String.format("%.2f", perim).replace(",", ".");
        return Double.parseDouble(perimCorto);
    }
}
