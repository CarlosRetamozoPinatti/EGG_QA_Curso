import Entity.Persona;
import Service.PersonaService;

public class Main {
    public static void main(String[] args){

        PersonaService ServPer = new PersonaService();

        Persona[] p = new Persona[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Persona Nº" + (i + 1) + ": ");
            p[i] = ServPer.crearPersona();
        }

        double[] imcs = {ServPer.calcularIMC(p[0]), ServPer.calcularIMC(p[1]), ServPer.calcularIMC(p[2]), ServPer.calcularIMC(p[3])};
        int[] edades = {p[0].getEdad(), p[1].getEdad(), p[2].getEdad(), p[3].getEdad()};

        cantidadIMC(imcs);
        cantidadEdades(edades);

    }

    public static void cantidadIMC(double[] imcs) {
        int bajo = 0, medio = 0, alto = 0;

        for (int i = 0; i < 4; i++) {
            if (imcs[i] < 20) {
                bajo++;
            } else if (imcs[i] >= 20 && imcs[i] < 25) {
                medio++;
            } else {
                alto++;
            }
        }
        System.out.println(bajo + " están por debajo su peso ideal.");
        System.out.println(medio + " están en su peso ideal.");
        System.out.println(alto + " están por sobre su peso ideal.");
    }

    public static void cantidadEdades(int[] edades) {
        int menor = 0, mayor = 0;

        for (int i = 0; i < 4; i++) {
            if (edades[i] < 18) {
                menor++;
            } else {
                mayor++;
            }
        }
        System.out.println(menor + " son menores de edad");
        System.out.println(mayor + " son mayores de edad");
    }

}