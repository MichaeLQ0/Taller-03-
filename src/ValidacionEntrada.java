import java.util.Scanner;

public class ValidacionEntrada {
    public static void main(String[] args){
        int edad = -1;
        while (edad < 0 || edad > 120) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su edad (0-120): ");
            edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                System.out.println("Edad inválida. Por favor, ingrese un valor entre 0 y 120.");
            }
            sc.close();
        }

        if (edad <= 12) {
            System.out.println("Niñez.");
        } else if (edad <= 17) {
            System.out.println("Adolescencia.");
        } else if (edad <= 25) {
            System.out.println("Juventud.");
        } else if (edad <= 59) {
            System.out.println("Adultez.");
        } else {
            System.out.println("Tercera edad.");
        }

    }
}
