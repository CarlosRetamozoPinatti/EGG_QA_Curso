package org.example.entity.reportemedico;

public class AbordajeNutricional {
    private int numOrden;
    private int edad;
    private double peso;
    private boolean eutrofico;
    private boolean bajoPeso;
    private boolean sobrepeso;

    public AbordajeNutricional(int numOrden, int edad, double peso, boolean eutrofico,
                               boolean bajoPeso, boolean sobrepeso) {
        this.numOrden = numOrden;
        this.edad = edad;
        this.peso = peso;
        this.eutrofico = eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrepeso = sobrepeso;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEutrofico() {
        return eutrofico;
    }

    public void setEutrofico(boolean eutrofico) {
        this.eutrofico = eutrofico;
    }

    public boolean isBajoPeso() {
        return bajoPeso;
    }

    public void setBajoPeso(boolean bajoPeso) {
        this.bajoPeso = bajoPeso;
    }

    public boolean isSobrepeso() {
        return sobrepeso;
    }

    public void setSobrepeso(boolean sobrepeso) {
        this.sobrepeso = sobrepeso;
    }
}
