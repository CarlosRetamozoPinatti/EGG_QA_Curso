package Service;

import Entity.Vehiculo;

import java.util.Locale;
import java.util.Scanner;

public class VehiculoService {
    Scanner leer = new Scanner(System.in);
    Vehiculo v1 = new Vehiculo();

    public Vehiculo cargarVehiculo() {
        String tipo;
        System.out.println("Indique el tipo de vehiculo (auto | moto | bici):");
        do {
            tipo = leer.nextLine().toLowerCase();
            if (tipo.equals("auto") || tipo.equals("moto") || tipo.equals("bici")){
                v1.setTipo(tipo);
            } else {
                System.out.println("Tipo no valido");
            }
        } while (!tipo.equals("auto") && !tipo.equals("moto") && !tipo.equals("bici"));
        System.out.println("Indique la marca");
        v1.setMarca(leer.nextLine());
        System.out.println("Indique el modelo");
        v1.setModelo(leer.nextLine());
        System.out.println("Indique el año");
        v1.setAño(leer.nextInt());

        return v1;
    }
    public void moverse(Vehiculo v1){
        String tipo = v1.getTipo();
        System.out.println("Por cuanto tiempo se mueve el vehiculo " + tipo + " ?: ");
        int segs = leer.nextInt();
        switch (tipo) {
            case "auto" -> System.out.println("Avanzó: " + (3 * segs) + " metros.");
            case "moto" -> System.out.println("Avanzó: " + (2 * segs) + " metros.");
            case "bici" -> System.out.println("Avanzó: " + (segs) + " metros.");
            default -> System.out.println("Opcion no valida");
        }
    }
    public void frenar(Vehiculo v1){
        String tipo = v1.getTipo();
        System.out.println("Cuanto tiempo se movio el vehiculo " + tipo + " antes de frenar?: ");
        int segs = leer.nextInt();
        switch (tipo) {
            case "auto" -> System.out.println("Frenó a los " + ((3 * segs) + 2) + " metros.");
            case "moto" -> System.out.println("Frenó a los " + ((2 * segs) + 2) + " metros.");
            case "bici" -> System.out.println("Frenó a los " + (segs) + " metros.");
            default -> System.out.println("Opcion no valida");
        }
    }
    public void mostrarVehiculo(Vehiculo v1){
        System.out.println(v1.toString());
    }
}
