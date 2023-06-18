import Service.CancionService;

public class Main {
    public static void main(String[] args) {
        CancionService service = new CancionService();
        service.mostrarCancion(service.crearCancion());
    }
}