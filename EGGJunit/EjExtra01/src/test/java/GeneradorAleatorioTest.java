import org.example.entity.GeneradorAleatorio;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GeneradorAleatorioTest {
    private GeneradorAleatorio rng;

    @Before
    public void setUp() {
        rng = new GeneradorAleatorio(1, 10);
    }

    @Test
    public void testGeneradorAleatorio_EnRango() {
        for (int i = 0; i < 100; i++) {
            int numeroRandom = rng.generarNumero();
            Assert.assertTrue(numeroRandom >= 1 && numeroRandom <= 10);
        }
    }

    @Test
    public void testGeneradorAleatorio_ValMin() {
        boolean minValueGenerated = false;
        for (int i = 0; i < 1000; i++) {
            int numeroRandom = rng.generarNumero();
            if (numeroRandom == 1) {
                minValueGenerated = true;
                break;
            }
        }
        Assert.assertTrue(minValueGenerated);
    }

    @Test
    public void testGeneradorAleatorio_ValMax() {
        boolean maxValueGenerated = false;
        for (int i = 0; i < 1000; i++) {
            int numeroRandom = rng.generarNumero();
            if (numeroRandom == 10) {
                maxValueGenerated = true;
                break;
            }
        }
        Assert.assertTrue(maxValueGenerated);
    }
}
