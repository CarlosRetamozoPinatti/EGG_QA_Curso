package Service;

import Entity.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Ahorcado crearJuego() {
        Ahorcado a1 = new Ahorcado();
        //EMPEZAMOS A SETEAR LA PALABRA SECRETA
        String[] palabraSecreta;
        String[] palabraOculta;
        int contador = 0;
        System.out.println("Ingrese la palabra secreta: ");
        String palabra = leer.next();
        palabraSecreta = new String[palabra.length()];
        palabraOculta = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++){
            contador++;
            palabraSecreta[i] = palabra.substring(contador - 1, contador);
            a1.setPalabraSecreta(palabraSecreta);
            palabraOculta[i] = "?";
            a1.setPalabraOculta(palabraOculta);
        }
        //TERMINAMOS DE SETEAR LA PALABRA SECRETA , LA OCULTAMOS Y SETEAMOS LO QUE FALTA
        a1.setLetrasEncontradas(0);
        a1.setJugadaMaxima(6); // 2 PIERNAS, 2 BRAZOS, CABEZA, TORSO = 6.

        return a1;
    }
    // Método para verificar si una letra dada se encuentra en la palabra secreta
    public boolean verificarLetra(String letra, Ahorcado a1) {
        boolean letraEncontrada = false;
        for (int i = 0; i < a1.getPalabraSecreta().length; i++) {
            if (a1.getPalabraSecreta()[i].equalsIgnoreCase(letra)) {
                letraEncontrada = true;
                a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1); // Incrementar el contador de letras encontradas
                System.out.println(a1.getLetrasEncontradas());
            }
        }
        return letraEncontrada;
    }
    //Condicion de Victoria
    public boolean palabraCompleta(Ahorcado a1){
        return  a1.getLetrasEncontradas() == a1.getPalabraSecreta().length;
    }
    //Reducir intentos
    public void reducirJugada(Ahorcado a1) {
        a1.setJugadaMaxima(a1.getJugadaMaxima() - 1);
        System.out.println("Te quedan " + a1.getJugadaMaxima() + " intentos.");
    }

    // Método para reemplazar guiones bajos por letras adivinadas
    public void actualizarPalabraSecreta(String letra, Ahorcado a1) {
        String[] palabraOculta = a1.getPalabraOculta();
        for (int i = 0; i < a1.getPalabraSecreta().length; i++) {
            if (a1.getPalabraOculta()[i].equals("?") && a1.getPalabraSecreta()[i].charAt(0) == letra.charAt(0)) {
                palabraOculta[i] = letra ;
                a1.setPalabraOculta(palabraOculta);
            }
        }
        System.out.print("Palabra oculta actualizada: ");
        System.out.println(Arrays.toString(a1.getPalabraOculta()));
    }

    public void newGame(){
        String letra;
        Ahorcado game = crearJuego();
        System.out.println(" Aca va una pista, es una palabra de " + game.getLongitud() + " letras.");
        System.out.println();
        System.out.println(Arrays.toString(game.getPalabraOculta()));
        do {
            System.out.println("Ingrese una letra: ");
            letra = leer.next();
            if (verificarLetra(letra, game)){
                System.out.println("La letra se encuentra en la palabra");
                actualizarPalabraSecreta(letra, game);
            } else {
                System.out.println("La letra no se encuentra en la palabra");
                reducirJugada(game);
            }
        } while (!palabraCompleta(game) && game.getJugadaMaxima() != 0 );
    }
}