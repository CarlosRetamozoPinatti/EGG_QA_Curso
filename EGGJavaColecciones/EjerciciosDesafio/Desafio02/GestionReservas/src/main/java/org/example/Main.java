package org.example;

import org.example.service.HabitacionService;
import org.example.service.HotelService;
import org.example.service.PersonaService;

public class Main {
    public static void main(String[] args) {
        PersonaService servPer = new PersonaService();
        HabitacionService servHab = new HabitacionService();
        HotelService servHotel = new HotelService(servPer, servHab);

        servPer.agregarPersona();
        servPer.agregarPersona();
        servHab.crearHabitacion();
        servPer.personasRegistradas();
        servHab.verHabitaciones();
        servHotel.mostrarPer();
        servHotel.mostrarHab();
        servHotel.reservarHab();

    }
}