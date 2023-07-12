package Service;

import Entity.Rutina;

import java.util.*;

public class RutinaService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final List<Rutina> rutinas = new ArrayList<>();

    public Rutina crearRutina() {
        Rutina rutina = new Rutina();
        System.out.println("Ingrese el nombre de la rutina: ");
        rutina.setNombre(leer.nextLine());

        try {
            System.out.println("Ingrese la duracion de la rutina en mins: ");
            rutina.setDuracion(leer.nextInt());

            leer.nextLine(); // Consumir el carácter de nueva línea después de leer el número de duración

            System.out.println("Ingrese la dificultad de la rutina: ");
            rutina.setDificultad(leer.next());

            leer.nextLine(); // Consumir el carácter de nueva línea después de leer la dificultad

            System.out.println("Ingrese la descripcion de la rutina: ");
            rutina.setDescripcion(leer.nextLine());

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese valores válidos.");
            // Por si el usuario ingresa cualquier cosa.
        }

        rutinas.add(rutina);
        System.out.println("Rutina creada con éxito!!");
        System.out.println(rutina);
        return rutina;
    }

    public void mostrarRutinas(){
        if (rutinas.isEmpty()){
            System.out.println("La lista de rutinas esta vacia");
        } else {
            System.out.println("----------------------------");
            System.out.println(rutinas);
            System.out.println("----------------------------");
        }
    }

    public void eliminarRutina(){
        System.out.println("Ingrese el ID del cliente a borrar: ");
        long idRutinaEliminar = leer.nextLong();
        Optional<Rutina> rutinaEncontrada = rutinas.stream()
                .filter(rutina -> rutina.getId() == idRutinaEliminar)
                .findFirst();

        if (rutinaEncontrada.isPresent()) {
            Rutina rutina = rutinaEncontrada.get();
            rutinas.remove(rutina);
            System.out.println("Cliente eliminado: " + "\n" + rutina);
        } else {
            System.out.println("No se encontró ningún cliente con el ID especificado.");
        }
    }

    public void modificarRutina() {
        System.out.println("Ingrese el ID de la rutina a modificar: ");
        long idRutinaModificar = leer.nextLong();
        Optional<Rutina> rutinaEncontrada = rutinas.stream()
                .filter(rutina -> rutina.getId() == idRutinaModificar)
                .findFirst();

        if (rutinaEncontrada.isPresent()) {
            Rutina rutina = rutinaEncontrada.get();

            System.out.println("¿Qué atributo desea modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Duracion");
            System.out.println("3. Dificultad");
            System.out.println("4. Descripcion");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nuevo nombre de la rutina: ");
                    rutina.setNombre(leer.next());
                }
                case 2 -> {
                    System.out.println("Ingrese la nueva duracion de la rutina (en minutos): ");
                    int duracion = leer.nextInt();
                    rutina.setDuracion(duracion);
                }
                case 3 -> {
                    leer.nextLine(); // Consumir la nueva línea antes de leer la dificultad
                    System.out.println("Ingrese la nueva dificultad de la rutina: ");
                    rutina.setDificultad(leer.nextLine());
                }
                case 4 -> {
                    System.out.println("Ingrese la nueva descripcion de la rutina: ");
                    rutina.setDescripcion(leer.nextLine());
                }
                default -> {
                    System.out.println("Opción inválida.");
                    return;
                }
            }
            System.out.println("Rutina modificada: " + rutina);
        } else {
            System.out.println("No se encontró ninguna rutina con el ID especificado.");
        }
    }

}
