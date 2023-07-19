import org.example.entity.ConversorTemp;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class ConversorTempTest {
    private ConversorTemp conversor;

    @Before
    public void setear(){
        conversor = new ConversorTemp();
    }

    @Test
    public void testRankineACelsius() {
        double rankine = 500;
        double esperadoCelsius = 4.62;
        double obtenidoCelsius = conversor.rankineACelsius(rankine);
        assertEquals(esperadoCelsius, obtenidoCelsius, 0.01);
    }

    @Test
    public void testRankineACelsiuseExcepcion() {
        double rankine = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.rankineACelsius(rankine);
        });
    }

    @Test
    public void testRankineAFahrenheit() {
        double rankine = 500;
        double esperadoFahrenheit = 40.33;
        double obtenidoFahrenheit = conversor.rankineAFahrenheit(rankine);
        assertEquals(esperadoFahrenheit, obtenidoFahrenheit, 0.01);
    }

    @Test
    public void testRankineAFahrenheitExcepcion() {
        double rankine = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.rankineAFahrenheit(rankine);
        });
    }

    @Test
    public void testRankineAKelvin() {
        double rankine = 500;
        double esperadoKelvin = 277.7778;
        double obtenidoKelvin = conversor.rankineAKelvin(rankine);
        assertEquals(esperadoKelvin, obtenidoKelvin, 0.01);
    }

    @Test
    public void testRankineAKelvinExcepcion() {
        double rankine = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.rankineAKelvin(rankine);
        });
    }

    @Test
    public void testCelsiusARankine() {
        double celsius = 25;
        double esperadoRankine = 536.67;
        double obtenidoRankine = conversor.celsiusARankine(celsius);
        assertEquals(esperadoRankine, obtenidoRankine, 0.01);
    }

    @Test
    public void testCelsiusARankineExcepcion() {
        double celsius = -300;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.celsiusARankine(celsius);
        });
    }

    @Test
    public void testCelsiusAFahrenheit() {
        double celsius = 25;
        double esperadoFahrenheit = 77;
        double obtenidoFahrenheit = conversor.celsiusAFahrenheit(celsius);
        assertEquals(esperadoFahrenheit, obtenidoFahrenheit, 0.01);
    }

    @Test
    public void testCelsiusAFahrenheitExcepcion() {
        double celsius = -300;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.celsiusAFahrenheit(celsius);
        });
    }

    @Test
    public void testCelsiusAKelvin() {
        double celsius = 25;
        double esperadoKelvin = 298.15;
        double obtenidoKelvin = conversor.celsiusAKelvin(celsius);
        assertEquals(esperadoKelvin, obtenidoKelvin, 0.01);
    }

    @Test
    public void testCelsiusAKelvinExcepcion() {
        double celsius = -300;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.celsiusAKelvin(celsius);
        });
    }

    @Test
    public void testFahrenheitARankine() {
        double fahrenheit = 80;
        double esperadoRankine = 539.67;
        double obtenidoRankine = conversor.fahrenheitARankine(fahrenheit);
        assertEquals(esperadoRankine, obtenidoRankine, 0.01);
    }

    @Test
    public void testFahrenheitARankineExcepcion() {
        double fahrenheit = -600;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.fahrenheitARankine(fahrenheit);
        });
    }

    @Test
    public void testFahrenheitACelsius() {
        double fahrenheit = 80;
        double esperadoCelsius = 26.6667;
        double obtenidoCelsius = conversor.fahrenheitACelsius(fahrenheit);
        assertEquals(esperadoCelsius, obtenidoCelsius, 0.01);
    }

    @Test
    public void testFahrenheitACelsiusExcepcion() {
        double fahrenheit = -600;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.fahrenheitACelsius(fahrenheit);
        });
    }

    @Test
    public void testFahrenheitAKelvin() {
        double fahrenheit = 80;
        double esperadoKelvin = 299.8167;
        double obtenidoKelvin = conversor.fahrenheitAKelvin(fahrenheit);
        assertEquals(esperadoKelvin, obtenidoKelvin, 0.01);
    }

    @Test
    public void testFahrenheitAKelvinExcepcion() {
        double fahrenheit = -600;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.fahrenheitAKelvin(fahrenheit);
        });
    }

    @Test
    public void testKelvinARankine() {
        double kelvin = 300;
        double esperadoRankine = 540;
        double obtenidoRankine = conversor.kelvinARankine(kelvin);
        assertEquals(esperadoRankine, obtenidoRankine, 0.01);
    }

    @Test
    public void testKelvinARankineExcepcion() {
        double kelvin = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.kelvinARankine(kelvin);
        });
    }

    @Test
    public void testKelvinACelsius() {
        double kelvin = 300;
        double esperadoCelsius = 26.85;
        double obtenidoCelsius = conversor.kelvinACelsius(kelvin);
        assertEquals(esperadoCelsius, obtenidoCelsius, 0.01);
    }

    @Test
    public void testKelvinACelsiusExcepcion() {
        double kelvin = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.kelvinACelsius(kelvin);
        });
    }

    @Test
    public void testKelvinAFahrenheit() {
        double kelvin = 300;
        double esperadoFahrenheit = 80.33;
        double obtenidoFahrenheit = conversor.kelvinAFahrenheit(kelvin);
        assertEquals(esperadoFahrenheit, obtenidoFahrenheit, 0.01);
    }

    @Test
    public void testKelvinAFahrenheitExcepcion() {
        double kelvin = -100;
        assertThrows(IllegalArgumentException.class, () -> {
            conversor.kelvinAFahrenheit(kelvin);
        });
    }
}

