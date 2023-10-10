package org.example.entity.armadura.piezas;

import org.example.entity.armadura.piezas.componentes.Propulsores;

public class Botas {
    private Propulsores propulsores;

    public Botas() {
        propulsores = new Propulsores();
    }

    public Botas(Propulsores p) {
        this.propulsores = p;
    }

    public float Desplazarse(int intensidad, float tiempo){
        return propulsores.Movimiento(intensidad, tiempo);
    }

    public boolean Impacto(){
        return propulsores.impacto();
    }

    public void Status(){
        propulsores.Status();
    }

    public Propulsores getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(Propulsores propulsores) {
        this.propulsores = propulsores;
    }
}
