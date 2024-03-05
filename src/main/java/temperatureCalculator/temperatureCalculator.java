package temperatureCalculator;

public class temperatureCalculator {
    public static float fahToCel(float fah){
        return (float) ((fah - 32) * 5 / 9);
    }
    public static float kelvintoCel(float kel){
        return (float) (kel-273.15);
    }

    public static float kelvinToFah(float kel) {
        return (float) ((kel - 273.15) * 9 / 5 + 32);
    }
}
