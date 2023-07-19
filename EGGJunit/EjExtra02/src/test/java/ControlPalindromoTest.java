import org.example.entity.ControlPalindromo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ControlPalindromoTest {
    private ControlPalindromo controlPalindromo;

    @Before
    public void setear() {
        controlPalindromo = new ControlPalindromo();
    }

    @Test
    public void testEsPalindromo_Verdadero() {
        String palindromo = "neuquen";

        boolean resultado = controlPalindromo.esPalindromo(palindromo);
        Assert.assertTrue(resultado);
    }

    @Test
    public void testEsPalindromo_Falso() {
        String noPalindromo = "Hola mundo";

        boolean resultado = controlPalindromo.esPalindromo(noPalindromo);
        Assert.assertFalse(resultado);
    }

    @Test
    public void testEsPalindromo_VerdaderoNumeros() {
        String palindromoNumerico = "12321";

        boolean resultado = controlPalindromo.esPalindromo(palindromoNumerico);
        Assert.assertTrue(resultado);
    }

    @Test
    public void testEsPalindromo_PalindromoVacio() {
        String palindromoVacio = "";

        boolean resultado = controlPalindromo.esPalindromo(palindromoVacio);
        Assert.assertTrue(resultado);
    }
}

