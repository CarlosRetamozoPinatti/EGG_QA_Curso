package org.example.entity;

import org.example.interfaces.calculoFormas;

public class Circulo implements calculoFormas {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * PI * radio;
    }
}

