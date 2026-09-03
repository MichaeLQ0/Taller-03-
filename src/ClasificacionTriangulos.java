import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[]args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("lado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("lado 2:");
        double lado2 = sc.nextDouble();
        System.out.println("lado 3:");
        double lado3 = sc.nextDouble();
        boolean esValido=(lado1+lado2>lado3 && lado1+lado3>lado2 && lado2+lado3>lado1);
        if (!esValido){
            System.out.println("El triángulo no es valido");
        }else if(lado1==lado2 && lado1==lado3){
            System.out.println("El triángulo es equilátero");
        }else if(lado1==lado2 ||lado2==lado3||lado1==lado3){
            System.out.println("El triángul es isósceles");
        }else{
            System.out.println("el tringulo es escaleno");
        }
        sc.close();
    }
}

