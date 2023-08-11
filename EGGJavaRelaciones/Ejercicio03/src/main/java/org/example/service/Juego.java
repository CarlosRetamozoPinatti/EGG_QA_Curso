package org.example.service;

import org.example.entity.Baraja;
import org.example.entity.Carta;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    public void jugar(){
        Baraja baraja = new Baraja();
        baraja.barajar();

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());


        List<Carta> cartasEntregadas = baraja.darCartas(10);
        System.out.println("Cartas entregadas:");
        for (Carta carta : cartasEntregadas) {
            System.out.println(carta);
        }

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        List<Carta> monton = new ArrayList<>();
        monton.add(baraja.siguienteCarta());
        monton.add(baraja.siguienteCarta());

        baraja.cartasMonton(monton);

        baraja.mostrarBaraja();
    }
}
