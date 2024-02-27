package temperatureCalculator;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class temperatureCalculatorTest {

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

}
