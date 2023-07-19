package org.example.entity;

public class CalculadoraDescuento {
    public double calcularDescuento(double precio, double descPorc){
        if (precio <= 0 || descPorc < 0 || descPorc > 100){
            throw new IllegalArgumentException("Valores fuera de rango");
        }
        double cantDesc = precio * (descPorc / 100);
        return precio - cantDesc;
    }
}
