package org.example.entity;

public class BarcoMotor extends Barco {
    private double potenciaCV;

    public BarcoMotor(String matricula, double eslora, int anoFabricacion, double potenciaCV) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + potenciaCV;
    }
}
