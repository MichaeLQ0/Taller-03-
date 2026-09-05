import java.util.Scanner;

public class EstadisticaGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 10 notas: ");
        Double[] notas = new Double[10];
        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        if (notas[i] <0 || notas[i]>5) {
            System.out.println("La nota ingresada no es válida. Debe estar entre 0 y 5.");
            return;
            }
        }
        double suma=0;
        double masAlta =notas[0], posAlta=0;
        double masBaja = notas[0], posBaja=0;
        int aprobados=0, reprobados =0;
        for (int i = 0; i <= 9; i++){
            suma= suma + notas[i];
            if (notas[i] > masAlta){
                masAlta = notas[i];
                posAlta = i;
            }
            else if (notas[i] < masBaja){
                masBaja = notas[i];
                posBaja = i;
            }
            else if (notas[i] >= 3.0){
                aprobados++;
            } else {
                reprobados++;
            }
            double promedio = suma / 10;
            System.out.println("El promedio es: " + promedio);
            System.out.println("La nota más alta es: " + masAlta + " en la posición " + posAlta);
            System.out.println("La nota más baja es: " + masBaja + " en la posición " + posBaja);
            System.out.println("Número de aprobados: " + aprobados);
            System.out.println("Número de reprobados: " + reprobados);
            }
            sc.close();
        }
}
