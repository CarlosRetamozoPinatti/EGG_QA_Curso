import org.example.entity.ValidadorClave;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidadorClaveTest {
    private ValidadorClave validador;

    @Before
    public void setUp() {
        validador = new ValidadorClave();
    }

    @Test
    public void testValidarFortaleza_CumpleTodo() {
        String clave = "Abcdefg1!";
        assertTrue(validador.validarFortaleza(clave));
    }

    @Test
    public void testValidarFortaleza_NoCumpleLongitudMinima() {
        String clave = "Abc1!";
        assertFalse(validador.validarFortaleza(clave));
    }

    @Test
    public void testValidarFortaleza_NoCumpleCaracterEspecial() {
        String clave = "Abcdefg1";
        assertFalse(validador.validarFortaleza(clave));
    }

    @Test
    public void testValidarFortaleza_NoCumpleLetraMayuscula() {
        String clave = "abcdefg1!";
        assertFalse(validador.validarFortaleza(clave));
    }

    @Test
    public void testValidarFortaleza_NoCumpleNumero() {
        String clave = "Abcdefgh!";
        assertFalse(validador.validarFortaleza(clave));
    }
}
