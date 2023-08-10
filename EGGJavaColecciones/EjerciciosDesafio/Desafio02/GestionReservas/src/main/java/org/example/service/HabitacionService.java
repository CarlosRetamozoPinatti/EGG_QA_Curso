package org.example.service;

import org.example.entity.Habitacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HabitacionService {
    private final Scanner leer;
    private List<Habitacion> habitaciones;

    public HabitacionService(Scanner leer) {
        this.leer = leer;
        habitaciones = new ArrayList<>();
    }

    public void crearHabitacion(int num, int capMax) {
        if (buscarHabitacionPorNumero(num).isPresent()) {
            System.out.println("Ya existe una habitación con el mismo número en la lista.");
            return;
        }
        Habitacion habitacion = new Habitacion(num, capMax);
        habitaciones.add(habitacion);
        System.out.println("Habitación agregada correctamente!!");
    }

    public int solicitarCantidadHuespedes() {
        System.out.print("Cuantos huespedes seran?: ");
        return leer.nextInt();
    }

    public Optional<Habitacion> buscarHabitacionPorNumero(int num) {
        return habitaciones.stream()
                .filter(habitacion -> habitacion.getNumeroHabitacion() == num)
                .findFirst();
    }

    public boolean validarCapacidadHabitacion(Habitacion habitacion, int cantPersonas) {
        return habitacion.getCapacidadMax() >= cantPersonas;
    }


    public int solicitarNumeroHabitacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de habitación: ");
        return scanner.nextInt();
    }

    public void modificarHabitacion(int num, int nuevaCapacidad) {
        Optional<Habitacion> habMod = buscarHabitacionPorNumero(num);
        if (habMod.isEmpty()) {
            System.out.println("No existe la habitación con el número ingresado.");
            return;
        }
        habMod.get().setCapacidadMax(nuevaCapacidad);
        System.out.println("Modificación exitosa!!");
    }

    public void verHabitaciones() {
        if (habitaciones.isEmpty()) {
            System.out.println("---------------------");
            System.out.println("Todavía no se registraron habitaciones.");
            System.out.println("---------------------");
        } else {
            System.out.println("---------------------");
            habitaciones.forEach(System.out::println);
            System.out.println("---------------------");
        }
    }

    public void eliminarHabitacion(int num) {
        Optional<Habitacion> habElim = buscarHabitacionPorNumero(num);
        if (habElim.isEmpty()) {
            System.out.println("No se encontró ninguna habitación con el número ingresado.");
            return;
        }
        habitaciones.remove(habElim.get());
        System.out.println("La habitación ha sido eliminada de la lista.");
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}


