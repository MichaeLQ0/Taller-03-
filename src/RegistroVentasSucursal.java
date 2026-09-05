import java.util.Scanner;

public class RegistroVentasSucursal {
    public static void main(String[] args) {
        int[][] ventas = new int[4][3];
        for(int sucursal = 0; sucursal < 4; sucursal++) {
            for(int producto = 0; producto < 3; producto++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese las ventas de la sucursal " + (sucursal + 1) + " para el producto " + (producto + 1) + ": ");
                ventas[sucursal][producto] = sc.nextInt();
                sc.close();
            }
        }

        for(int sucursal = 0; sucursal < 4; sucursal++) {
            int totalVentasSucursal = 0;
            for(int producto = 0; producto < 3; producto++) {
                totalVentasSucursal += ventas[sucursal][producto];
            }
            System.out.println("Total de ventas de la sucursal " + (sucursal + 1) + ": " + totalVentasSucursal);
        }

        for(int producto = 0; producto < 3; producto++) {
            int totalVentasProducto = 0;
            for(int sucursal = 0; sucursal < 4; sucursal++) {
                totalVentasProducto += ventas[sucursal][producto];
            }
            System.out.println("Total de ventas del producto " + (producto + 1) + ": " + totalVentasProducto);
        }

        int maxVentas = ventas[0][0];
        int sucursalMax = 0; int productoMax = 0;

        for(int sucursal = 0; sucursal < 4; sucursal++) {
            for(int producto = 0; producto < 3; producto++) {
                if(ventas[sucursal][producto] > maxVentas) {
                    maxVentas = ventas[sucursal][producto];
                    sucursalMax = sucursal;
                    productoMax = producto;
                }
            }
        }

        System.out.println("La sucursal " + (sucursalMax + 1) + " tuvo las mayores ventas del producto " + (productoMax + 1) + " con " + maxVentas + " unidades vendidas.");
        

    }

}
