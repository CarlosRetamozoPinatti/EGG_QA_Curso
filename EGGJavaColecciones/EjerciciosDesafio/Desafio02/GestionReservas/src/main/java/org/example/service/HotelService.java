package org.example.service;

import org.example.entity.Alojamiento;
import org.example.entity.Habitacion;
import org.example.entity.Persona;
import org.example.entity.Reserva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private PersonaService servPer;
    private HabitacionService servHab;
    private List<Reserva> reservas;
    private List<Alojamiento> alojamientos;
    private List<Persona> personas;
    private List<Habitacion> habitaciones;

    public HotelService(PersonaService servPer, HabitacionService servHab){
        this.servPer = new PersonaService();
        this.servHab = new HabitacionService();
        reservas = new ArrayList<>();
        alojamientos = new ArrayList<>();
        personas = servPer.getPersonas();
        habitaciones = servHab.getHabitaciones();
    }

    private Habitacion buscarHabitacionPorNumero(int num){
        List<Habitacion> habNum = habitaciones.stream()
                .filter(habitacion -> habitacion.getNumeroHabitacion() == num)
                .toList();
        if (!habNum.isEmpty()){
            return habNum.get(0);
        } else {
            return null;
        }
    }
    private Persona buscarPersonaPorDNI(long dni) {
        List<Persona> personasConDNI = personas.stream()
                .filter(persona -> persona.getDni() == dni)
                .toList();
        if (!personasConDNI.isEmpty()) {
            return personasConDNI.get(0);
        } else {
            return null;
        }
    }

    public void reservarHab(){
        System.out.println("Ingrese el numero de la habitacion: ");
        int num = Integer.parseInt(leer.next());
        if (buscarHabitacionPorNumero(num) != null){
            System.out.println("Ingrese el DNI del huesped que se hospedará: ");
            long dni = Long.parseLong(leer.next());
            if (buscarPersonaPorDNI(dni) != null){
                System.out.println("Desde cuando: ");
                String desde = leer.next();
                System.out.println("Hasta cuando: ");
                String hasta = leer.next();
                List<String> fechas = new ArrayList<>();
                fechas.add(desde);
                fechas.add(hasta);
                Reserva reserva = new Reserva(1, fechas);
                System.out.println("Reserva Creada");
                System.out.println(reserva);
                reservas.add(reserva);
            } else {
                System.out.println("Error en Cliente");
            }
        } else {
            System.out.println("Error en habitacion");
        }
    }

    public void mostrarHab(){
        System.out.println(habitaciones);
    }

    public void mostrarPer(){
        System.out.println(personas);
    }
}
