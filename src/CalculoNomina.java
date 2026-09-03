import java.util.Scanner;

public class CalculoNomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el número de horas trabajadas: ");
        double horas = sc.nextDouble();
        double valorHora = 20000;

        double salarioBruto = horas * valorHora;
        double descuentoSS = salarioBruto * 0.08;
        double retencion    = salarioBruto * 0.05;
        double salarioNeto  = salarioBruto - descuentoSS - retencion;

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Descuento SS: " + descuentoSS);
        System.out.println("Retención: " + retencion);
        System.out.println("Salario Neto: " + salarioNeto);

        sc.close();
    }
}
