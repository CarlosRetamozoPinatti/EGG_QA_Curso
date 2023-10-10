package org.example.entity.armadura.piezas.componentes;

import java.util.Random;

public class Sintetizador extends Componente{
    public Sintetizador(){
        super();
    }

    public void Mensaje(String texto){
        ControlDmg(texto);
        if((new Random().nextInt(100)+1) <= 15){  // numero generado entre 1 y 100, si es menor o igual a 15
            super.averiado = true;
        }
    }

    public void ControlDmg(String texto){
        if(super.isAveriado()){
            String textoCorrupto = (texto.toLowerCase()).replace('a', '4').replace(('e'), '3').replace(('i'), '|').replace(('o'), '@').replace(('u'), 'V');
            System.out.println("[\u001B[36mJarvis\u001B[0m]: \u001B[41m"+ textoCorrupto +"\u001B[0m");
        }else{
            System.out.println("[\u001B[36mJarvis\u001B[0m]: \u001B[46m"+ texto +"\u001B[0m");
        }
    }
}
