import org.example.entity.CalculadoraDescuento;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraDescuentoTest {
    private CalculadoraDescuento calcDesc;

    @Before
    public void setearClase() {
        calcDesc = new CalculadoraDescuento();
    }

    @Test
    public void testDescuentosValoresValidos() {
        double precio = 100.0;
        double cantDesc = 25.0;

        double precioDescontado = calcDesc.calcularDescuento(precio, cantDesc);

        Assert.assertEquals(75.0, precioDescontado, 0.0025);
    }

    @Test
    public void testDescuentosValoresInvalidos01() {
        double precio = -100.0;
        double cantDesc = 10.0;
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            calcDesc.calcularDescuento(precio, cantDesc);
        });
    }
    @Test
    public void testDescuentosValoresInvalidos02() {
        double precio = 100.0;
        double cantDesc = -10.0;
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            calcDesc.calcularDescuento(precio, cantDesc);
        });
    }
    @Test
    public void testDescuentosValoresInvalidos03() {
        double precio = 100.0;
        double cantDesc = 110.0;
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            calcDesc.calcularDescuento(precio, cantDesc);
        });
    }
}