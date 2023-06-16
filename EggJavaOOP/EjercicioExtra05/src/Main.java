import Entity.Meses;
import Service.MesesService;

public class Main {
    public static void main(String[] args) {
        MesesService serv = new MesesService();
        Meses mes = serv.crearMeses();
        serv.adivinar(mes);
    }
}