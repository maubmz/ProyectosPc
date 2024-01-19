package Seccion12.Tareas;

import java.util.Scanner;

public class HistogramaArreglo {
    public static void main(String[] args) {

        int[] arreglo = new int[12];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un numero de 1-6: ");
            arreglo[i] = scanner.nextInt();
        }

        String[] arregloHistograma = new String[6];
        for (int i = 0; i < arregloHistograma.length; i++) {
            int aux = i + 1;
            String histo = aux + ": ";
            for (int j = 0; j < arreglo.length; j++) {
                if (aux == arreglo[j]) {
                    histo += "*";
                }
            }
            arregloHistograma[i] = histo;
        }

        for (int i = 0; i < arregloHistograma.length; i++) {
            System.out.println(arregloHistograma[i]);
        }

    }
}
