import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int secreto= (int)(Math.random() * 100) + 1;
    int intentos=0;
    while (true){
    intentos++;
    System.out.print("Ingrese un numero del 1 al 100: ");
    double numero= sc.nextDouble();
        if (numero>secreto){
            System.out.println("El número es menor");
        }else if(numero<secreto){
            System.out.println("El númeor es mayor");
        }else{
            System.out.print("¡Correcto! Lo lograste en: " + intentos + " intentos");
            break;
        }
     }
     sc.close();
    }
}

