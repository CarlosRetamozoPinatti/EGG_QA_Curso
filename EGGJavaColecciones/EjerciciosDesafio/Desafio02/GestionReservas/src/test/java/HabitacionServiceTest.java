import org.example.entity.Habitacion;
import org.example.service.HabitacionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class HabitacionServiceTest {

    private HabitacionService habitacionService;
    private List<Habitacion> habitaciones;

    @BeforeEach
    void setUp() {
        habitaciones = new ArrayList<>();
        habitacionService = new HabitacionService(new Scanner(System.in));
        habitacionService.setHabitaciones(habitaciones);
    }

    @Test
    void testCrearHabitacionPositivo() {
        habitacionService.crearHabitacion(101, 2);
        assertEquals(1, habitacionService.getHabitaciones().size());
    }

    @Test
    void testCrearHabitacionExistente() {
        habitacionService.crearHabitacion(101, 2);
        habitacionService.crearHabitacion(101, 3);
        assertEquals(1, habitacionService.getHabitaciones().size());
    }

    @Test
    void testBuscarHabitacionPorNumeroExistente() {
        habitacionService.crearHabitacion(101, 2);
        Optional<Habitacion> habitacionEncontrada = habitacionService.buscarHabitacionPorNumero(101);
        assertTrue(habitacionEncontrada.isPresent());
    }

    @Test
    void testBuscarHabitacionPorNumeroNoExistente() {
        habitacionService.crearHabitacion(101, 2);
        Optional<Habitacion> habitacionEncontrada = habitacionService.buscarHabitacionPorNumero(102);
        assertFalse(habitacionEncontrada.isPresent());
    }

    @Test
    void testValidarCapacidadHabitacionSuficiente() {
        Habitacion habitacion = new Habitacion(101, 3);
        boolean resultado = habitacionService.validarCapacidadHabitacion(habitacion, 2);
        assertTrue(resultado);
    }

    @Test
    void testValidarCapacidadHabitacionInsuficiente() {
        Habitacion habitacion = new Habitacion(101, 3);
        boolean resultado = habitacionService.validarCapacidadHabitacion(habitacion, 4);
        assertFalse(resultado);
    }

    @Test
    void testModificarHabitacionExistente() {
        habitacionService.crearHabitacion(101, 2);
        habitacionService.modificarHabitacion(101, 3);
        Habitacion habitacionModificada = habitacionService.buscarHabitacionPorNumero(101).orElse(null);
        assertNotNull(habitacionModificada);
        assertEquals(3, habitacionModificada.getCapacidadMax());
    }

    @Test
    void testModificarHabitacionNoExistente() {
        habitacionService.crearHabitacion(101, 2);
        habitacionService.modificarHabitacion(102, 3);
        // Verificar que no se haya realizado ninguna modificación
        Habitacion habitacionOriginal = habitacionService.buscarHabitacionPorNumero(101).orElse(null);
        assertNotNull(habitacionOriginal);
        assertEquals(2, habitacionOriginal.getCapacidadMax());
    }

    @Test
    void testEliminarHabitacionExistente() {
        habitacionService.crearHabitacion(101, 2);
        habitacionService.eliminarHabitacion(101);
        assertEquals(0, habitacionService.getHabitaciones().size());
    }

    @Test
    void testEliminarHabitacionNoExistente() {
        habitacionService.crearHabitacion(101, 2);
        habitacionService.eliminarHabitacion(102);
        assertEquals(1, habitacionService.getHabitaciones().size());
    }
}


