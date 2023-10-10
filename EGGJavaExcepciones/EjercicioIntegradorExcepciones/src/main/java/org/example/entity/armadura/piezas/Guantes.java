package org.example.entity.armadura.piezas;

import org.example.entity.armadura.piezas.componentes.Propulsores;
import org.example.entity.armadura.piezas.componentes.Repulsores;

public class Guantes {
    private Repulsores repulsores;

    public Guantes() {
        repulsores = new Repulsores();
    }

    public Guantes(Repulsores r){
        this.repulsores = r;
    }

    public float Atacar(int intensidad){
       return repulsores.Disparo(intensidad);
    }

    public float Desplazarse(int intensidad, float tiempo){
        return repulsores.Movimiento(intensidad, tiempo);
    }

    public boolean Impacto(){
        return repulsores.impacto();
    }

    public void Status(){
        repulsores.Status();
    }

    public Repulsores getRepulsores() {
        return repulsores;
    }

    public void setRepulsores(Repulsores repulsores) {
        this.repulsores = repulsores;
    }
}
