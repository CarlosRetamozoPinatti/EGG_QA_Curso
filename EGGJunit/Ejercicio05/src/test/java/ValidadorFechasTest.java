import org.example.entity.ValidadorFechas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidadorFechasTest {
    private ValidadorFechas validador;

    @Before
    public void setUp() {
        validador = new ValidadorFechas();
    }

    @Test
    public void testValidarFecha_FechaValida() {
        int anio = 2023;
        int mes = 7;
        int dia = 18;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertTrue(resultado);
    }

    @Test
    public void testValidarFecha_AnioInvalido() {
        int anio = 0;
        int mes = 7;
        int dia = 18;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testValidarFecha_MesInvalido() {
        int anio = 2023;
        int mes = 13;
        int dia = 18;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testValidarFecha_DiaInvalido() {
        int anio = 2023;
        int mes = 7;
        int dia = 32;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testValidarFecha_FechaInvalida30Dias() {
        int anio = 2023;
        int mes = 2;
        int dia = 30;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testValidarFecha_BisiestoVerdadero() {
        int anio = 2020;
        int mes = 2;
        int dia = 29;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertTrue(resultado);
    }

    @Test
    public void testValidarFecha_BisiestoFalso() {
        int anio = 2023;
        int mes = 2;
        int dia = 29;

        boolean resultado = validador.validarFecha(anio, mes, dia);
        Assert.assertFalse(resultado);
    }
}
