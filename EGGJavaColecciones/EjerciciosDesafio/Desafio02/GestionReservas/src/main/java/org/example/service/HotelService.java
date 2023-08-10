package org.example.service;

import org.example.entity.Alojamiento;
import org.example.entity.Habitacion;
import org.example.entity.Persona;
import org.example.entity.Reserva;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HotelService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private PersonaService servPer;
    private HabitacionService servHab;
    private List<Reserva> reservas;
    private List<Alojamiento> alojamientos;

    public HotelService(PersonaService servPer, HabitacionService servHab) {
        this.servPer = servPer;
        this.servHab = servHab;
        reservas = new ArrayList<>();
        alojamientos = new ArrayList<>();
    }

    public LocalDate parseFecha(String fecha) {
        return LocalDate.parse(fecha, dateFormatter);
    }

    private LocalDate leerFecha(String mensaje) {
        LocalDate fecha = null;
        boolean salirLoop = false;
        while (!salirLoop) {
            System.out.print(mensaje);
            String fechaStr = leer.next();
            if (fechaStr.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
                try {
                    fecha = parseFecha(fechaStr);
                    salirLoop = true;
                } catch (Exception e) {
                    System.out.print("La fecha ingresada es incorrecta!");
                    salirLoop = false;
                }
            }
        }
        return fecha;
    }

    public List<LocalDate> solicitarFechasReserva() {
        List<LocalDate> fechas = new ArrayList<>();
        LocalDate fechaInicio = leerFecha("Desde cuando (YYYY-MM-DD): ");
        LocalDate fechaFin = leerFecha("Hasta cuando (YYYY-MM-DD): ");
        if (fechaInicio != null && fechaFin != null && !fechaInicio.isAfter(fechaFin)) {
            fechas.add(fechaInicio);
            fechas.add(fechaFin);
        } else {
            System.out.print("El rango de fechas ingresado es incorrecto!\n");
        }
        return fechas;
    }

    public void reservarHab(int numHabitacion, long dniHuesped, int cantPer, List<LocalDate> fechasReserva) {
        Optional<Habitacion> habitacionOpt = servHab.buscarHabitacionPorNumero(numHabitacion);
        Persona clienteOpt = servPer.buscarPersonaPorDNI(dniHuesped);

        if (!habitacionOpt.isPresent()) {
            System.out.println("ERROR - Habitación no Existe en Base de Datos.");
            return;
        }
        if (clienteOpt == null) {
            System.out.println("ERROR - Cliente no Existe en Base de Datos.");
            return;
        }
        if (!servHab.validarCapacidadHabitacion(habitacionOpt.get(), cantPer)) {
            System.out.println("ERROR - La habitación ya se encuentra llena.");
            return;
        }
        Reserva reserva = new Reserva(habitacionOpt.get().getNumeroHabitacion(), cantPer, fechasReserva);
        reservas.add(reserva);
        System.out.println("Reserva creada: " + reserva);
    }

    public void cancelarReserva(int idRes) {
        Reserva reservaCancel = buscarReserva(idRes);
        if (reservaCancel != null) {
            reservas.remove(reservaCancel);
            System.out.println("Reserva Cancelada..");
        } else {
            System.out.println("No existe la reserva..");
        }
    }

    public void mostrarReservas() {
        System.out.println("------LISTA DE RESERVAS------");
        reservas.forEach(System.out::println);
        System.out.println("-----------------------------");
    }

    public void crearAlojamiento(int idRes) {
        Reserva reservaAloj = buscarReserva(idRes);
        if (reservaAloj != null) {
            Alojamiento alojamiento = new Alojamiento(idRes);
            alojamientos.add(alojamiento);
            System.out.println("Alojamiento creado!..");
        } else {
            System.out.println("No existe la reserva..");
        }
    }

    public void bajaAlojamiento(int idRes) {
        Alojamiento bajaAloj = buscarAlojamiento(idRes);
        if (bajaAloj != null) {
            alojamientos.remove(bajaAloj);
            System.out.println("Alojamiento dado de Baja de manera exitosa..");
        } else {
            System.out.println("No existe la reserva..");
        }
    }

    private Reserva buscarReserva(int id) {
        return reservas.stream()
                .filter(reserva -> reserva.getId() == id)
                .findFirst()
                .orElse(null);
    }

    private Alojamiento buscarAlojamiento(int id) {
        return alojamientos.stream()
                .filter(alojamiento -> alojamiento.getIdReserva() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }
}

