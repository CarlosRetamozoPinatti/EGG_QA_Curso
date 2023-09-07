package org.example.entity;

public class YateLujo extends Barco {
    private double potenciaCV;
    private int numCamarotes;

    public YateLujo(String matricula, double eslora, int anoFabricacion, double potenciaCV, int numCamarotes) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return getEslora() * 10 + potenciaCV + numCamarotes;
    }
}
