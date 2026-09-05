import java.util.*;
public class InversionArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        for (int i = 0; i < n / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = temp;
        }
        System.out.println("Arreglo invertido: " + Arrays.toString(arreglo));
        sc.close();
    }
}
