package Entity;

import java.util.Arrays;

public class Ahorcado {

    private String[] palabraSecreta;
    private String[] palabraOculta;
    private int jugadaMaxima;
    private int letrasEncontradas;
    private int longitud;

    public Ahorcado() {
    }
    public Ahorcado(String[] palabraSecreta, String[] palabraOculta, int jugadaMaxima, int letrasEncontradas, int longitud) {
        this.palabraSecreta = palabraSecreta;
        this.palabraOculta = palabraOculta;
        this.jugadaMaxima = jugadaMaxima;
        this.letrasEncontradas = letrasEncontradas;
        this.longitud = longitud;
    }

    public void setPalabraSecreta(String[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public void setPalabraOculta(String[] palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public void setJugadaMaxima(int jugadaMaxima) {
        this.jugadaMaxima = jugadaMaxima;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }
    public String[] getPalabraOculta() {
        return palabraOculta;
    }
    public int getJugadaMaxima() {
        return jugadaMaxima;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabraSecreta=" + Arrays.toString(palabraSecreta) +
                ", palabraOculta=" + Arrays.toString(palabraOculta) +
                ", jugadaMaxima=" + jugadaMaxima +
                ", letrasEncontradas=" + letrasEncontradas +
                ", longitud=" + longitud +
                '}';
    }
}