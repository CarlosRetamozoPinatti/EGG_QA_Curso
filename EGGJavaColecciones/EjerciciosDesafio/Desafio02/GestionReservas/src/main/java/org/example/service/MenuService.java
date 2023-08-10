package org.example.service;

import org.example.entity.Habitacion;
import org.example.entity.Persona;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MenuService {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final PersonaService servPer = new PersonaService(leer);
    private final HabitacionService servHab = new HabitacionService(leer);
    private final HotelService servHot = new HotelService(servPer, servHab);

    public void mostrarOpciones() {
        System.out.println("""
                Que desea hacer?:
                1 - Registrar Huespedes.
                2 - Ver todos los Huespedes registrados.
                3 - Modificar un Huesped.
                4 - Eliminar Huespedes.
                5 - Agregar Habitaciones.
                6 - Ver todas las habitaciones.
                7 - Modificar una Habitacion.
                8 - Eliminar habitaciones.
                9 - Reservar una habitacion.
                10 - Ver Reservas.
                11 - Cancelar una reserva.
                12 - Dar de Alta Alojamiento.
                13 - Dar de Baja Alojamiento.
                0 - Salir""");
    }

    public void mostrarMenu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1 -> agregarHuesped();
                case 2 -> servPer.personasRegistradas();
                case 3 -> editarHuesped();
                case 4 -> eliminarHuesped();
                case 5 -> agregarHabitacion();
                case 6 -> servHab.verHabitaciones();
                case 7 -> modificarHabitacion();
                case 8 -> eliminarHabitacion();
                case 9 -> realizarReserva();
                case 10 -> servHot.mostrarReservas();
                case 11 -> bajaReserva();
                case 12 -> altaAloj();
                case 13 -> bajaAloj();
                case 0 -> System.out.println("Adios!!");
            }
        } while (opcion != 0);
    }

    private long leerDni() {
        long dni = 0;
        String aux;
        while (dni == 0) {
            System.out.println("Ingrese el dni: ");
            aux = leer.next().trim();
            if (aux.matches("\\d+")) {
                dni = Long.parseLong(aux);
            }
        }
        return dni;
    }

    private String leerPais(){
        String nombre = "";
        while (nombre.equals("")){
            System.out.println("Ingrese el Pais: ");
            nombre = leer.next();
        }
        return nombre;
    }

    private String leerNombre(){
        String nombre = "";
        while (nombre.equals("")){
            System.out.println("Ingrese el nombre: ");
            nombre = leer.next();
        }
        return nombre;
    }

    private int leerEntero(String mensaje) {
        int valor = 0;
        String aux;
        while (valor == 0) {
            System.out.println(mensaje);
            aux = leer.next().trim();
            if (aux.matches("\\d+")) {
                valor = Integer.parseInt(aux);
            }
        }
        return valor;
    }

    private void agregarHuesped() {
        String nombre = leerNombre();
        int edad = leerEntero("Ingrese la edad: ");
        long dni = leerDni();
        String pais = leerPais();
        servPer.agregarPersona(nombre, edad, dni, pais);
    }

    private void editarHuesped() {
        long dni = leerDni();
        Persona personaExistente = servPer.buscarPersonaPorDNI(dni);
        if (personaExistente != null) {
            System.out.println("Persona encontrada!");
            System.out.println(personaExistente);
            String nombre = leerNombre();
            int edad = leerEntero("Ingrese la edad: ");
            String pais = leerPais();
            servPer.modificarPersona(dni, nombre, edad, pais);
        } else {
            System.out.println("El huesped no existe..");
        }
    }

    private void eliminarHuesped() {
        long dni = leerDni();
        servPer.eliminarPersona(dni);
    }

    private void agregarHabitacion() {
        int numHab = leerEntero("Ingrese el numero de habitacion: ");
        int capMax = leerEntero("Ingrese la capacidad maxima de habitacion: ");
        servHab.crearHabitacion(numHab, capMax);
    }

    private void modificarHabitacion() {
        int numHab = leerEntero("Ingrese el numero de habitacion: ");
        Optional<Habitacion> habExiste = servHab.buscarHabitacionPorNumero(numHab);
        if (habExiste.isPresent()) {
            System.out.println("Habitacion encontrada!!");
            System.out.println(habExiste);
            int capMax = leerEntero("Ingrese la nueva capacidad de la Habitacion: ");
            servHab.modificarHabitacion(numHab, capMax);
        } else {
            System.out.println("La habitacion no existe..");
        }
    }

    private void eliminarHabitacion() {
        int numHab = leerEntero("Ingrese el numero de habitacion: ");
        servHab.eliminarHabitacion(numHab);
    }

    public void realizarReserva() {
        int numHabitacion = servHab.solicitarNumeroHabitacion();
        long dniHuesped = servPer.solicitarDNIHuesped();
        int cantPer = servHab.solicitarCantidadHuespedes();
        List<LocalDate> fechasReserva = servHot.solicitarFechasReserva();
        // Validar los parámetros antes de llamar a reservarHab
        if (numHabitacion <= 0 || dniHuesped <= 0 || cantPer <= 0 || fechasReserva.size() != 2) {
            System.out.println("ERROR - Parámetros inválidos.");
            return;
        }
        servHot.reservarHab(numHabitacion, dniHuesped, cantPer, fechasReserva);
    }


    private void bajaReserva() {
        int idRes = leerEntero("Ingrese el numero de Reserva: ");
        servHot.cancelarReserva(idRes);
    }

    private void altaAloj() {
        int idRes = leerEntero("Ingrese el numero de Reserva: ");
        servHot.crearAlojamiento(idRes);
    }

    private void bajaAloj() {
        int idRes = leerEntero("Ingrese el numero de Reserva: ");
        servHot.bajaAlojamiento(idRes);
    }
}


