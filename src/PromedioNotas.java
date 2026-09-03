import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" ingrese nota 1: ");
        int nota1 = sc.nextInt();
        System.out.print(" ingrese nota 2: ");
        int nota2 = sc.nextInt();
        System.out.print(" ingrese nota 3: ");
        int nota3 = sc.nextInt();
        double definitiva = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);
        System.out.println("La nota definitiva es: " + definitiva);
        boolean aprobado = definitiva >= 3.0;
        String mensaje = aprobado ? "Aprobado" : "Reprobado";
        System.out.println(mensaje);

        sc.close();
    }
}

