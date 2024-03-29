package temperatureCalculator;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TemperatureCalculatorTest {

    @Test
    public void testFahrenheitToCelsiusWithZeroFahrenheit() {
        assertEquals(-17.7778f, temperatureCalculator.fahToCel(0.0f), 0.001f);
    }

    @Test
    public void testFahrenheitToCelsiusWithPositiveFahrenheit() {
        assertEquals(37.7778f, temperatureCalculator.fahToCel(100.0f), 0.001f);
        assertEquals(100.0f, temperatureCalculator.fahToCel(212.0f), 0.001f);
    }

    @Test
    public void testFahrenheitToCelsiusWithNegativeFahrenheit() {
        assertEquals(-40.0f, temperatureCalculator.fahToCel(-40.0f), 0.001f);
    }

    @Test
    public void testKelvinToCelsiusZero() {
        assertEquals(-273.15f, temperatureCalculator.kelvintoCel(0.0f), 0.001f);
    }

    @Test
    public void testKelvinToCelsiusPositive() {
        assertEquals(0.0f, temperatureCalculator.kelvintoCel(273.15f), 0.001f);
        assertEquals(100.0f, temperatureCalculator.kelvintoCel(373.15f), 0.001f);
    }

    @Test
    public void testKelvinToCelsiusNegative() {
        assertEquals(-100.0f, temperatureCalculator.kelvintoCel(173.15f), 0.001f);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(32.0f, temperatureCalculator.kelvinToFah(273.15f), 0.001f);
        assertEquals(212.0f, temperatureCalculator.kelvinToFah(373.15f), 0.001f);
    }

}
