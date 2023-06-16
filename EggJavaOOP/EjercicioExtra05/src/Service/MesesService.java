package Service;

import Entity.Meses;

import java.util.Scanner;

public class MesesService {
    Scanner leer = new Scanner(System.in);
    public Meses crearMeses(){
        Meses m1 = new Meses();
        m1.getMesSecreto();
        System.out.println("El mes secreto ha sido asignado!");
        return m1;
    }
    public void adivinar(Meses m1){
        String mesTeclado;
        int contador = 0;
        System.out.println("Ingrese un mes: ");
        do {
            mesTeclado = leer.next();
            if (!mesTeclado.toLowerCase().equals(m1.getMesSecreto())){
                contador++;
                System.out.println("No era el mes!");
            }
        } while (!mesTeclado.toLowerCase().equals(m1.getMesSecreto()));
        System.out.println("ADIVINASTE!.. TARDASTE " + contador + " INTENTOS");
    }
}
