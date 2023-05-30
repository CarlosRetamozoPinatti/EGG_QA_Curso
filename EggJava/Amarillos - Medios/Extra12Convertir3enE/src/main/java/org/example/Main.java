package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String valor1 = (i == 3) ? "E" : String.valueOf(i);
                    String valor2 = (j == 3) ? "E" : String.valueOf(j);
                    String valor3 = (k == 3) ? "E" : String.valueOf(k);

                    System.out.println(valor1 + "-" + valor2 + "-" + valor3);
                }
            }
        }
    }
}

