import java.util.Scanner;

public class CalificacionLetras {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); 
    System.out.print ("¿Cual es la nota?");
    double nota = sc.nextDouble();
    if (nota >= 4.6) {
        System.out.println( nota + " A, Excelente");
    } else if (nota >= 4.0) {
        System.out.println( nota + " B, sobresaliente");
    } else if (nota >= 3.5) {
        System.out.println( nota + " C, aceptable");
    } else if (nota >= 3.0) {
        System.out.println( nota + " D, Aprobado minimo");
    } else {
        System.out.println( nota + " F, Reprobado");
    }
    sc.close();
    }
}
