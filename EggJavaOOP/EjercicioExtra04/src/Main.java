import Entity.NIF;
import Service.NIFService;

public class Main {
    public static void main(String[] args) {
        NIFService service = new NIFService();
        NIF nif = service.crearNif();
        service.mostrar(nif);
    }
}