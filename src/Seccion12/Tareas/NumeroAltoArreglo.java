package Seccion12.Tareas;

import java.util.Scanner;

public class NumeroAltoArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingresa un numero: ");
            arreglo[i] = s.nextInt();
        }
        System.out.println();

        int maximo = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (maximo < arreglo[i]) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El valor mas grande del arreglo es: " + maximo);
    }
}
