package org.example.entity;

import java.util.Random;

public class GeneradorAleatorio {
    private final int min;
    private final int max;
    private final Random random;

    public GeneradorAleatorio(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    public int generarNumero() {
        return random.nextInt(max - min + 1) + min;
    }
}
