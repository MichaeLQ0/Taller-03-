import java.util.Scanner;
import java.math.*;

public class ConversiónTemperatura {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la temperatura en grados Celcius: ");
        double tempCelcius = sc.nextDouble();

        double tempFahrenheit= (tempCelcius * 1.8 )+ 32;
        double tempKelvin = tempCelcius + 273.15;

        System.out.printf("La temperatura en grados Celcius es: %.2f\n", tempCelcius);
        System.out.printf("La temperatura en grados Fahrenheit es: %.2f\n", tempFahrenheit);
        System.out.printf("La temperatura en grados Kelvin es: %.2f\n", tempKelvin);

        sc.close(); 

    }
}
