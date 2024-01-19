package Seccion13;

import java.util.Scanner;

public class MatrizImprimirX {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[][] matriz;
        System.out.println("Dime el tamanio de la matriz en un valor numerico: ");
        int n = s.nextInt();
        matriz = new String[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || (j == n - i - 1) ){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
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
