import java.util.Scanner;
public class TiempoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los minutos del viaje: ");
        int minTotales = sc.nextInt();

        int seggTotales = minTotales * 60;

        int horas = minTotales / 60;
        int minResto = minTotales % 60;
        int segResto = seggTotales % 60;

        System.out.println("El tiempo de viaje en minutos es: " + minTotales);
        System.out.printf("El tiempo de viaje equivale a: %d horas, %d minutos y %d segundos\n", horas, minResto, segResto);
        System.out.println("El tiempo de viaje en segundos es: " + seggTotales);

        sc.close();
    }
}
