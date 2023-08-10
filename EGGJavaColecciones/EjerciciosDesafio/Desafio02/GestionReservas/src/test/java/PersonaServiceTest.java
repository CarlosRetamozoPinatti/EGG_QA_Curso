import org.example.entity.Persona;
import org.example.service.PersonaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaServiceTest {

    private PersonaService personaService;
    private List<Persona> personas;

    @BeforeEach
    void setUp() {
        personas = new ArrayList<>();
        personaService = new PersonaService(new Scanner(System.in));
        personaService.setPersonas(personas);
    }

    @Test
    void testAgregarPersonaPositivo() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        assertEquals(1, personaService.getPersonas().size());
    }

    @Test
    void testAgregarPersonaDniExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        personaService.agregarPersona("Maria", 25, 123456789, "Brasil");
        assertEquals(1, personaService.getPersonas().size());
    }

    @Test
    void testBuscarPersonaPorDniExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        Persona personaEncontrada = personaService.buscarPersonaPorDNI(123456789);
        assertNotNull(personaEncontrada);
    }

    @Test
    void testBuscarPersonaPorDniNoExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        Persona personaEncontrada = personaService.buscarPersonaPorDNI(987654321);
        assertNull(personaEncontrada);
    }

    @Test
    void testModificarPersonaExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        personaService.modificarPersona(123456789, "NuevoNombre", 25, "Uruguay");
        Persona personaModificada = personaService.buscarPersonaPorDNI(123456789);
        assertEquals("NuevoNombre", personaModificada.getNombre());
        assertEquals(25, personaModificada.getEdad());
        assertEquals("Uruguay", personaModificada.getPais());
    }

    @Test
    void testModificarPersonaNoExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        personaService.modificarPersona(987654321, "NuevoNombre", 25, "Uruguay");
        // Verificar que no se hayan realizado modificaciones
        Persona personaOriginal = personaService.buscarPersonaPorDNI(123456789);
        assertEquals("Juan", personaOriginal.getNombre());
        assertEquals(30, personaOriginal.getEdad());
        assertEquals("Argentina", personaOriginal.getPais());
    }

    @Test
    void testEliminarPersonaExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        personaService.eliminarPersona(123456789);
        assertEquals(0, personaService.getPersonas().size());
    }

    @Test
    void testEliminarPersonaNoExistente() {
        personaService.agregarPersona("Juan", 30, 123456789, "Argentina");
        personaService.eliminarPersona(987654321);
        assertEquals(1, personaService.getPersonas().size());
    }
}
