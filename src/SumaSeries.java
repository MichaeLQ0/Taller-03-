import java.util.Scanner;

public class SumaSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int sumaNaturales = 0;
        for (int i = 1; i <= n; i++) {
            sumaNaturales += i;
        }
        System.out.println("Formula de la suma de los primeros " + n + " números naturales: n * (n + 1) / 2 = " + n * (n + 1) / 2);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaNaturales);


        int sumaPares = 0;
        for (int i = 1; i <= n; i++) {
            sumaPares += (2 * i);
        }
        System.out.println("Formula de la suma de los primeros " + n + " números pares: n * (n + 1) = " + n * (n + 1));
        System.out.println("La suma de los primeros " + n + " números pares es: " + sumaPares);

        int sumaCuadrados = 0;
        for (int i = 1; i <= n; i++) {
            sumaCuadrados += (i * i);
        }
        System.out.println("Formula de la suma de los primeros " + n + " cuadrados: n * (n + 1) * (2n + 1) / 6 = " + n * (n + 1) * (2 * n + 1) / 6);
        System.out.println("La suma de los primeros " + n + " cuadrados es: " + sumaCuadrados);

        sc.close();
    }
}
