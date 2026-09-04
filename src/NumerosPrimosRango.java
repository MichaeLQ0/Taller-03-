import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimosRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de inicio del rango: ");
        int inicio = sc.nextInt();
        System.out.print("Ingrese el valor de fin del rango: ");
        int fin = sc.nextInt();

        int cantidad = 0;
        int suma = 0;
        int[] listaPrimos = new int[4];

        for (int i = inicio; i <= fin; i++) {
            if (i < 2) {
                continue;
            }

            boolean esPrimo = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(i) && esPrimo) {
                if (i % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }

            if (esPrimo) {
                System.out.println(i + " es un número primo.");
                cantidad++;
                suma += i;
                listaPrimos[cantidad - 1] = i;
            }
        }
        System.out.println("Cantidad de números primos encontrados: " + cantidad);
        System.out.println("Suma de los números primos encontrados: " + suma);
        System.out.println(Arrays.toString(listaPrimos));
        sc.close();
    }
}
