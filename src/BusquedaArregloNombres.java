import java.util.Scanner;

public class BusquedaArregloNombres {
    public static void main(String[] args) {
        String []pacientes=new String[8];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<=7;i++){
            pacientes[i]=sc.nextLine();
        }
        System.out.println("nombre buscado");
        String nombreBuscado=sc.nextLine();

        int posicion=-1;

        for (int i=0; i<=7;i++){
            if (pacientes[i].equalsIgnoreCase(nombreBuscado)){
                posicion=i;
                break;
            }
        }

        if (posicion!=-1){
            System.out.println("Encontrado en posición" + (posicion+1));
        }else{
            System.out.println("No encontrado");
        }
        sc.close();
    }
}

