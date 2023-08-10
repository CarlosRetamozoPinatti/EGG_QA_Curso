import org.example.entity.Alojamiento;
import org.example.entity.Reserva;
import org.example.service.HabitacionService;
import org.example.service.PersonaService;
import org.example.service.HotelService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HotelServiceTest {
    private HotelService hotelService;
    private PersonaService personaService;
    private HabitacionService habitacionService;

    @BeforeEach
    public void setUp() {
        personaService = new PersonaService(new java.util.Scanner(System.in));
        habitacionService = new HabitacionService(new java.util.Scanner(System.in));
        hotelService = new HotelService(personaService, habitacionService);
    }

    @Test
    public void testReservarHab_Positive() {
        // Agregar una persona y una habitación
        personaService.agregarPersona("John Doe", 30, 123456789, "USA");
        habitacionService.crearHabitacion(101, 2);

        // Realizar una reserva válida
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(3);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);

        hotelService.reservarHab(101, 123456789, 2, fechasReserva);

        // Verificar que la reserva se haya creado correctamente
        List<Reserva> reservas = hotelService.getReservas();
        assertEquals(1, reservas.size());
        assertEquals(101, reservas.get(0).getNumeroHabitacion());
    }

    @Test
    public void testReservarHab_HabitacionNoExiste() {
        // Intentar reservar una habitación inexistente
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(3);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);

        hotelService.reservarHab(102, 123456789, 2, fechasReserva);

        // Verificar que no se haya creado ninguna reserva
        List<Reserva> reservas = hotelService.getReservas();
        assertEquals(0, reservas.size());
    }

    @Test
    public void testReservarHab_ClienteNoExiste() {
        // Agregar una habitación
        habitacionService.crearHabitacion(103, 2);

        // Intentar reservar con un cliente inexistente
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(3);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);

        hotelService.reservarHab(103, 987654321, 2, fechasReserva);

        // Verificar que no se haya creado ninguna reserva
        List<Reserva> reservas = hotelService.getReservas();
        assertEquals(0, reservas.size());
    }

    @Test
    public void testReservarHab_CapacidadInsuficiente() {
        // Agregar una persona y una habitación con capacidad 1
        personaService.agregarPersona("Jane Smith", 28, 987654321, "UK");
        habitacionService.crearHabitacion(104, 1);

        // Intentar reservar una habitación con capacidad insuficiente
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(3);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);

        hotelService.reservarHab(104, 987654321, 2, fechasReserva);

        // Verificar que no se haya creado ninguna reserva
        List<Reserva> reservas = hotelService.getReservas();
        assertEquals(0, reservas.size());
    }

    @Test
    public void testCancelarReserva_Positive() {
        // Agregar una persona, una habitación y realizar una reserva
        personaService.agregarPersona("Alice Johnson", 25, 555555555, "Canada");
        habitacionService.crearHabitacion(105, 3);
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(2);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);
        hotelService.reservarHab(105, 555555555, 2, fechasReserva);

        // Cancelar la reserva
        Reserva reserva = hotelService.getReservas().get(0);
        hotelService.cancelarReserva(reserva.getId());

        // Verificar que la reserva se haya cancelado correctamente
        List<Reserva> reservas = hotelService.getReservas();
        assertEquals(0, reservas.size());
    }

    @Test
    public void testCancelarReserva_ReservaNoExiste() {
        // Intentar cancelar una reserva inexistente
        hotelService.cancelarReserva(999);

        // Verificar que no haya cambios en las reservas
        List<Reserva> reservas = hotelService.getReservas();
        assertEquals(0, reservas.size());
    }

    @Test
    public void testCrearAlojamiento_Positive() {
        // Agregar una persona, una habitación y realizar una reserva
        personaService.agregarPersona("Bob Brown", 40, 777777777, "Australia");
        habitacionService.crearHabitacion(106, 4);
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(3);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);
        hotelService.reservarHab(106, 777777777, 3, fechasReserva);

        // Crear un alojamiento para la reserva
        Reserva reserva = hotelService.getReservas().get(0);
        hotelService.crearAlojamiento(reserva.getId());

        // Verificar que el alojamiento se haya creado correctamente
        List<Alojamiento> alojamientos = hotelService.getAlojamientos();
        assertEquals(1, alojamientos.size());
        assertEquals(reserva.getId(), alojamientos.get(0).getIdReserva());
    }

    @Test
    public void testCrearAlojamiento_ReservaNoExiste() {
        // Intentar crear un alojamiento para una reserva inexistente
        hotelService.crearAlojamiento(999);

        // Verificar que no se haya creado ningún alojamiento
        List<Alojamiento> alojamientos = hotelService.getAlojamientos();
        assertEquals(0, alojamientos.size());
    }

    @Test
    public void testBajaAlojamiento_Positive() {
        // Agregar una persona, una habitación, realizar una reserva y crear un alojamiento
        personaService.agregarPersona("Eve Taylor", 22, 888888888, "New Zealand");
        habitacionService.crearHabitacion(107, 2);
        LocalDate fechaInicio = LocalDate.now().plusDays(1);
        LocalDate fechaFin = fechaInicio.plusDays(2);
        List<LocalDate> fechasReserva = Arrays.asList(fechaInicio, fechaFin);
        hotelService.reservarHab(107, 888888888, 2, fechasReserva);
        Reserva reserva = hotelService.getReservas().get(0);
        hotelService.crearAlojamiento(reserva.getId());

        // Dar de baja el alojamiento
        hotelService.bajaAlojamiento(reserva.getId());

        // Verificar que el alojamiento se haya dado de baja correctamente
        List<Alojamiento> alojamientos = hotelService.getAlojamientos();
        assertEquals(0, alojamientos.size());
    }

    @Test
    public void testBajaAlojamiento_AlojamientoNoExiste() {
        // Intentar dar de baja un alojamiento inexistente
        hotelService.bajaAlojamiento(999);

        // Verificar que no haya cambios en los alojamientos
        List<Alojamiento> alojamientos = hotelService.getAlojamientos();
        assertEquals(0, alojamientos.size());
    }
}
