import java.util.Scanner;
public class AreaPerimetroFiguras {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.println("la altura del rectangulo:");
        double altura = sc.nextDouble();
        System.out.println("dame el radio de la circunferencia:");
        double radio = sc.nextDouble();

        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);

        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferencia = 2 * Math.PI * radio;

        
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Circunferencia del círculo: " + circunferencia);

        sc.close();
    }
}

