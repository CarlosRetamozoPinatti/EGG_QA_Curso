package org.example;

import org.example.entity.Circulo;
import org.example.entity.Rectangulo;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(10, 20);

        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());
    }
}
