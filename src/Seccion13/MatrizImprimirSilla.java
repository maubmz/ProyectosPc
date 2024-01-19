package Seccion13;

import java.util.Scanner;

public class MatrizImprimirSilla {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[][] matriz;
        System.out.println("Dime el tamanio de la matriz en un valor numerico: ");
        int n = s.nextInt();
        matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || i == matriz.length/2 || (j == n - 1 && i >= n / 2)) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
