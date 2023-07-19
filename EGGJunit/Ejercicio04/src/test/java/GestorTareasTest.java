import org.example.entity.GestorTareas;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class GestorTareasTest {
    private GestorTareas gestor;

    @Before
    public void setUp() {
        gestor = new GestorTareas();
    }

    @Test
    public void testAgregarTarea() {
        gestor.agregarTarea("Tarea 1");
        List<String> tareas = gestor.listarTareas();
        assertEquals(1, tareas.size());
        assertEquals("Tarea 1", tareas.get(0));
    }

    @Test
    public void testEliminarTarea() {
        gestor.agregarTarea("Tarea 1");
        gestor.eliminarTarea("Tarea 1");
        List<String> tareas = gestor.listarTareas();
        assertEquals(0, tareas.size());
    }

    @Test
    public void testModificarTarea() {
        gestor.agregarTarea("Tarea 1");
        gestor.modificarTarea("Tarea 1", "Tarea 1 modificada");
        List<String> tareas = gestor.listarTareas();
        assertEquals(1, tareas.size());
        assertEquals("Tarea 1 modificada", tareas.get(0));
    }

    @Test
    public void testListarTareas() {
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
        gestor.agregarTarea("Tarea 3");
        List<String> tareas = gestor.listarTareas();
        assertEquals(3, tareas.size());
        assertEquals("Tarea 1", tareas.get(0));
        assertEquals("Tarea 2", tareas.get(1));
        assertEquals("Tarea 3", tareas.get(2));
    }
}
