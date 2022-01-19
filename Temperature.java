package temperature;
import java.util.*;

public abstract class Temperature {
    public static void main(String[] args) {
        System.out.print("Введите температуру по цельсию: ");
        double far;
        double kel;
        try (Scanner s = new Scanner(System.in)) {
            far = s.nextDouble();
            kel = s.nextDouble();
        }

        double farRez = celsiusToFahrenheit(far);
        double kelRez = celsiusToKelvin(kel);

        System.out.println("Температура по Фаренгейту= " + farRez);
        System.out.println("Температура по Кельвину= " + kelRez);

    }

    public static double celsiusToFahrenheit(double far) {
        return (far * 1.8) + 32;
    }

    public static double celsiusToKelvin(double kel) {
        return kel + 273.15;
    }
}