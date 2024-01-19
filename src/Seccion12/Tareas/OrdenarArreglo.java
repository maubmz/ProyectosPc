package Seccion12.Tareas;

import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un nuevo numero: ");
            arreglo[i] = s.nextInt();
        }

        for (int i = 0; i < (arreglo.length/2) ; i++) {
            System.out.println(arreglo[arreglo.length-1-i]);
            System.out.println(arreglo[i]);
        }

    }
}
