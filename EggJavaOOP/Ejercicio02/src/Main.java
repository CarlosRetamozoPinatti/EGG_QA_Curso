import Entity.Circunferencia;
import Service.CircService;

public class Main {
    public static void main(String[] args) {

        CircService serv = new CircService();
        Circunferencia circ = serv.crearCirc();

        System.out.println("El area es: " + serv.areaCirc(circ.getRadio()));
        System.out.println("El perimetro es: " + serv.perimCirc(circ.getRadio()));
    }
}