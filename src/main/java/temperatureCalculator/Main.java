package temperatureCalculator;

public class Main {
    public static void main(String[] args) {
        //Test the temperatureCalculator
        System.out.println("212 Fahrenheit is equal to " + temperatureCalculator.fahToCel(212) + " Celsius");
        System.out.println("100 Celsius is equal to " + temperatureCalculator.kelvinToFah(373.15f) + " Fahrenheit");
        System.out.println("273 Kelvin is equal to " + temperatureCalculator.kelvintoCel(273) + " Celsius");
        System.out.println("300.1 Kelvin is equal to " + temperatureCalculator.kelvinToFah(300.1f) + " Fahrenheit");
    }
}
