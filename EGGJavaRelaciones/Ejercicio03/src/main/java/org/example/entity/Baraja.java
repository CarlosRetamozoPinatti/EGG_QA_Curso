package org.example.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas, new Random());
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas disponibles para entregar.");
            return Collections.emptyList();
        }

        List<Carta> cartasEntregadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            cartasEntregadas.add(cartas.remove(0));
        }

        return cartasEntregadas;
    }

    public void cartasMonton(List<Carta> cartas) {
        if (cartas.isEmpty()) {
            System.out.println("Aún no ha salido ninguna carta.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas en la baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}