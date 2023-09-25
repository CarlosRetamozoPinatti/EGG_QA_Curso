package org.example.entity.armadura.piezas.componentes;

public class Generador {
    private final float energiaMax = 100;
    private float energia;

    public Generador() {
        energia = 100;
    }

    public Generador(float en){
        energia = en;
    }

    public float getEnergiaMax() {
        return energiaMax;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }
}
