package org.example.entity;

import org.example.interfaces.calculoFormas;

public class Rectangulo implements calculoFormas {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (base + altura) * 2;
    }
}
