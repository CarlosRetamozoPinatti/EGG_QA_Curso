package Service;

import Entity.Cliente;

import java.util.*;

public class ClienteService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final List<Cliente> clientes = new ArrayList<>();

    public Cliente crearCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Ingrese el nombre del cliente: ");
        cliente.setNombre(leer.nextLine());

        try {
            System.out.println("Ingrese la edad del cliente: ");
            cliente.setEdad(leer.nextInt());

            System.out.println("Ingrese el peso del cliente: ");
            cliente.setPeso(leer.nextDouble());

            System.out.println("Ingrese la altura del cliente: ");
            cliente.setAltura(leer.nextDouble());

            leer.nextLine(); // Consumir la nueva línea después de leer el número

            System.out.println("¿Cuál es el objetivo del cliente?");
            cliente.setObjetivo(leer.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor, ingrese un valor numérico válido y/o use una coma como separador decimal.");
            // Aquí puedes manejar el error de entrada no válida según tus necesidades
        }

        clientes.add(cliente);
        System.out.println("Cliente dado de alta con éxito");
        System.out.println(cliente);
        return cliente;
    }

    public void obtenerClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("--------------------");
            System.out.println(clientes);
            System.out.println("--------------------");
        }
    }

    public void eliminarCliente() {
        System.out.println("Ingrese el ID del cliente a borrar: ");
        long idClienteEliminar = leer.nextLong();
        Optional<Cliente> clienteEncontrado = clientes.stream()
                .filter(cliente -> cliente.getId() == idClienteEliminar)
                .findFirst();

        if (clienteEncontrado.isPresent()) {
            Cliente cliente = clienteEncontrado.get();
            clientes.remove(cliente);
            System.out.println("Cliente eliminado: " + "\n" + cliente);
        } else {
            System.out.println("No se encontró ningún cliente con el ID especificado.");
        }
    }

    public void modificarCliente() {
        System.out.println("Ingrese el ID del cliente a modificar: ");
        long idClienteModificar = leer.nextLong();
        Optional<Cliente> clienteEncontrado = clientes.stream()
                .filter(cliente -> cliente.getId() == idClienteModificar)
                .findFirst();

        if (clienteEncontrado.isPresent()) {
            Cliente cliente = clienteEncontrado.get();

            System.out.println("¿Qué atributo desea modificar?");
            System.out.println("1. Nombre");
            System.out.println("2. Peso");
            System.out.println("3. Altura");
            System.out.println("4. Objetivo");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nuevo nombre del cliente: ");
                    cliente.setNombre(leer.next());
                }
                case 2 -> {
                    System.out.println("Ingrese el nuevo peso del cliente: ");
                    cliente.setPeso(leer.nextDouble());
                }
                case 3 -> {
                    System.out.println("Ingrese la nueva altura del cliente: ");
                    cliente.setAltura(leer.nextDouble());
                }
                case 4 -> {
                    leer.nextLine(); // Consumir la nueva línea antes de leer el objetivo
                    System.out.println("Ingrese el nuevo objetivo del cliente: ");
                    cliente.setObjetivo(leer.nextLine());
                }
                default -> {
                    System.out.println("Opción inválida.");
                    return;
                }
            }
            System.out.println("Cliente modificado: " + cliente);
        } else {
            System.out.println("No se encontró ningún cliente con el ID especificado.");
        }
    }
}

