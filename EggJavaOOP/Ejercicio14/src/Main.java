import Entity.Celular;
import Service.CelularService;
//ERA CON VECTORES, PERO LO TRANSFORME A STRINGBUILDER PARA QUE QUEDE MAS PRESENTABLE.
public class Main {
    public static void main(String[] args) {
        CelularService celServ = new CelularService();
        Celular cel = celServ.crearCelular();
        System.out.println(cel.toString());
    }
}