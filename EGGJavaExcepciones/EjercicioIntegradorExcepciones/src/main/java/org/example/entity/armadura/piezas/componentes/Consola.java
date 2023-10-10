package org.example.entity.armadura.piezas.componentes;

import java.util.Random;

public class Consola extends Componente{
    public Consola(boolean averiado, boolean destruido) {
        super(averiado, destruido);
    }

    public void ControlDmg(String texto){
        String textoMay = texto.toUpperCase();
        if(super.isAveriado()){
            String textoCorrupto = textoMay.replace('A', '4').replace(('E'), '3').replace(('I'), '|').replace(('O'), '@').replace(('U'), 'V');
            System.out.println("[\u001B[32mConsola\u001B[0m]: \u001B[41m"+ textoCorrupto +"\u001B[0m");
        }else{
            System.out.println("[\u001B[32mConsola\u001B[0m]: \u001B[32m"+ textoMay +"\u001B[0m");
        }
    }

    public void Mensaje(String texto){
        ControlDmg(texto);
        if((new Random().nextInt(100)+1) <= 15){  // numero generado entre 1 y 100, si es menor o igual a 15
            super.averiado = true;
        }
    }
}
