import java.util.Scanner;

public class AnioBisiestoDiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("El año " + anio + (esBisiesto ? " es bisiesto." : " no es bisiesto."));

        System.out.print("Ingrese un día de la semana (1-7): ");
        int dia = sc.nextInt();
        String diaSemana = "";
        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;  
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                System.out.println("Número de día inválido. Debe ser entre 1 y 7.");
        }

        if(dia >= 1 && dia <= 7) {
            System.out.println("El día de la semana es: " + diaSemana);
        }
        sc.close();
    }
}
