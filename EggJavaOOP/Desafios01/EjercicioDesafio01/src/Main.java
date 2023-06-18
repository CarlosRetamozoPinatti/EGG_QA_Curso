import Entity.Vehiculo;
import Service.VehiculoService;

public class Main {
    public static void main(String[] args) {
        VehiculoService service = new VehiculoService();
        Vehiculo v1 = service.cargarVehiculo();
        service.mostrarVehiculo(v1);
        service.moverse(v1);
        service.frenar(v1);
    }
}