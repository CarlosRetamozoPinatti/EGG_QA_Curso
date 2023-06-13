package Service;

import Entity.Persona;

import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona(){
        Persona p = new Persona();

        System.out.println("Ingrese el nombre de la persona: ");
        p.setNombre(leer.next());
        leer.nextLine();
        System.out.println("Ingrese la edad: ");
        p.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el sexo (H - hombre, M - mujer, O - otro): ");
        String sexo = leer.next().toUpperCase();
        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Ingrese una opción válida: ");
            sexo = leer.next().toUpperCase();
        }
        p.setSexo(sexo);
        leer.nextLine();
        System.out.println("Ingrese la altura: ");
        p.setAltura(leer.nextDouble());
        leer.nextLine();
        System.out.println("Ingrese el peso: ");
        p.setPeso(leer.nextDouble());
        return p;
    }

    public double calcularIMC(Persona p){
        double peso = p.getPeso();
        double altura = p.getAltura();
        double IMC = peso / Math.pow(altura, 2);
        System.out.println("El IMC de " + p.getNombre() + " es de " + IMC);
        if(IMC < 20){
            System.out.println(p.getNombre() + " se encuentra por debajo de su peso ideal.");
            return IMC;
        } else if (IMC > 20 && IMC <= 25) {
            System.out.println(p.getNombre() + " se encuentra en su peso ideal.");
            return IMC;
        } else {
            System.out.println(p.getNombre() + " se encuentra por encima de su peso ideal.");
            return IMC;
        }
    }

    public boolean mayorDeEdad(Persona p){
        int edad = p.getEdad();
        if(edad > 18){
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("NO es mayor de edad");
            return false;
        }
    }
}
