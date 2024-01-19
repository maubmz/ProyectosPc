package Seccion12.Tareas;

import java.util.Scanner;

public class OcurrenciaArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero de 1 a 9: ");
            arreglo[i] = scanner.nextInt();
        }

        int[] arregloCantidadV = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadV[i] = cantidad;
        }

        int indice = 0;
        int max = 0;
        for (int i = 0; i < arregloCantidadV.length; i++) {
            if (max < arregloCantidadV[i]) {
                max = arregloCantidadV[i];
                indice = i;
            }
        }

        System.out.println("el elemento " + arreglo[indice] + " esta repetido " + max + "veces!");

    }
}
