package org.example.entity;

public class Velero extends Barco {
    private int numMastiles;

    public Velero(String matricula, double eslora, int anoFabricacion, int numMastiles) {
        super(matricula, eslora, anoFabricacion);
        this.numMastiles = numMastiles;
    }

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + numMastiles;
    }
}
