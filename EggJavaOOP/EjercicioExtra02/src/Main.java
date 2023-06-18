import Service.PuntosService;

public class Main {
    public static void main(String[] args) {
        PuntosService service = new PuntosService();
        service.calcularDistancia(service.crearPuntos());
    }
}