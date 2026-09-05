import java.util.Scanner;

public class TresEnRaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = ' ';
            }
        }

        int turno = 1;
        boolean hayGanador = false;
        boolean tableroLleno = false;
        char simbolo = ' ';
        char ganador = ' ';

        while (!hayGanador && !tableroLleno) {
            simbolo = (turno == 1) ? 'X' : 'O';

            mostrarTablero(tablero);

            System.out.println("Turno del jugador " + simbolo);

            int fila;
            int columna;
            boolean celdaValida;

            do {
                System.out.print("Introduce la fila (0-2): ");
                fila = scanner.nextInt();

                System.out.print("Introduce la columna (0-2): ");
                columna = scanner.nextInt();

                celdaValida = fila >= 0 && fila < 3
                        && columna >= 0 && columna < 3
                        && tablero[fila][columna] == ' ';

                if (!celdaValida) {
                    System.out.println("Celda inválida, intenta de nuevo.");
                }

            } while (!celdaValida);

            tablero[fila][columna] = simbolo;

            hayGanador = verificarGanador(tablero, simbolo);

            if (hayGanador) {
                ganador = simbolo;
            }


            tableroLleno = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        tableroLleno = false;
                    }
                }
            }

            if (!hayGanador) {
                turno = (turno == 1) ? 2 : 1;
            }
        }

        mostrarTablero(tablero);

        if (hayGanador) {
            System.out.println("¡Ganó el jugador " + ganador + "!");
        } else {
            System.out.println("¡Empate!");
        }

        scanner.close();
    }

    public static void mostrarTablero(char[][] tablero) {

        System.out.println();
        System.out.println("  0   1   2");
        System.out.println("-------------");

        for (int fila = 0; fila < 3; fila++) {
            System.out.print(fila + " ");

            for (int columna = 0; columna < 3; columna++) {
                System.out.print(tablero[fila][columna]);

                if (columna < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (fila < 2) {
                System.out.println("-------------");
            }
        }

        System.out.println();
    }

    public static boolean verificarGanador(char[][] tablero, char simbolo) {

        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == simbolo &&
                tablero[fila][1] == simbolo &&
                tablero[fila][2] == simbolo) {

                return true;
            }
        }


        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == simbolo &&
                tablero[1][columna] == simbolo &&
                tablero[2][columna] == simbolo) {

                return true;
            }
        }


        if (tablero[0][0] == simbolo &&
            tablero[1][1] == simbolo &&
            tablero[2][2] == simbolo) {

            return true;
        }

        if (tablero[0][2] == simbolo &&
            tablero[1][1] == simbolo &&
            tablero[2][0] == simbolo) {

            return true;
        }

        return false;
    }
}

