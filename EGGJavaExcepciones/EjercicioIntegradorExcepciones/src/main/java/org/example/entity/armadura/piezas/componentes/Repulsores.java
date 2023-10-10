package org.example.entity.armadura.piezas.componentes;

import java.util.Random;

public class Repulsores extends Componente{
    private float consumo;

    public Repulsores(){
        super();
        consumo = 15f;
    }

    public Repulsores(float consumo) {
        super();
        this.consumo = consumo;
    }

    public float Disparo(int intensidad){
        return (consumo * intensidad);
    }

    public float Movimiento(int intensidad, float tiempo){
        return (consumo * tiempo) * intensidad;
    }

    public boolean impacto(){
        int danio = new Random().nextInt(100)+1;

        if(danio == 100){
            super.destruido = true;
            System.out.println("El repulsor fue destruido!!");
            return true;
        }else if (danio >= 50){
            super.averiado = true;
            System.out.println("El repulsor fue dañado!!");
            return true;
        } else {
            return false;
        }
    }

    public void Status(){
        if (super.destruido){
            System.out.println("El repulsor no puede utilizarse, fue destruido.");
        } else if (super.averiado){
            System.out.println("El repulsor esta dañado, uso comprometido.");
        } else {
            System.out.println("El repulsor esta en buen estado.");
        }
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
}
