import java.util.Scanner;

public class TablaMultiplicarExt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int numero = sc.nextInt();
        System.out.println();
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d",numero * i);
        }

        System.out.println("\n\nTabla de multiplicar extendida desde 1 hasta " + numero + ":");
        for (int fila = 1; fila <= numero; fila++) {
            System.out.println();
            for (int columna = 1; columna <= 12; columna++) {
                System.out.printf("%4d", fila * columna);
            }
        }
        sc.close();
    }
}
