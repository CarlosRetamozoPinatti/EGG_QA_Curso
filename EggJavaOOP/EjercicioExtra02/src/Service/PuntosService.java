package Service;

import Entity.Puntos;

import java.util.Scanner;

public class PuntosService {
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos pts = new Puntos();
        System.out.println("Ingrese las coordenadas del punto 1: ");
        System.out.println("X1: ");
        pts.setX1(leer.nextDouble());
        System.out.println("Y1: ");
        pts.setY1(leer.nextDouble());
        System.out.println("Ingrese las coordenadas del punto 2: ");
        System.out.println("X2: ");
        pts.setX2(leer.nextDouble());
        System.out.println("Y2: ");
        pts.setY2(leer.nextDouble());

        return pts;
    }

    public void calcularDistancia(Puntos pts){
        double dist = Math.sqrt(Math.pow(pts.getX2()-pts.getX1(), 2) + Math.pow(pts.getY2()-pts.getY1(), 2));
        System.out.println("Siendo (" + pts.getX1() + "," + pts.getY1() + ") el punto 1.");
        System.out.println("Siendo (" + pts.getX2() + "," + pts.getY2() + ") el punto 2.");
        System.out.println("La distancia entre los puntos dados es: " + dist);
    }
}
