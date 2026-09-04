import java.util.Scanner;

public class TarifaParqueadero {
public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("<seleccione el vehículo: ");
        System.out.println("1=moto, 2=carro, 3=camioneta");
        int vehiculo =sc.nextInt();
        
        System.out.println("Cantidad de horas: ");
        int horas = sc.nextInt();
        int primeraHora=0;
        int horaAdicional=0;

        switch (vehiculo){
            case 1:
                primeraHora=2000;
                horaAdicional=1500;
                break;
            case 2:
                primeraHora=4000;
                horaAdicional=3000;
                break ;
            case 3:
                primeraHora=5000;
                horaAdicional=4000;
                break;
            default:
                System.out.print("Tipo de vehículo no es válido");
                break;
        }
        int total=primeraHora + (horaAdicional *(horas-1));
        System.out.print("el valor a pagar es de: "+ total);

        sc.close();

    }
}
