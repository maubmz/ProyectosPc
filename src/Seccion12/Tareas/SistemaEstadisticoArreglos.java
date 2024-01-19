package Seccion12.Tareas;

import java.util.Scanner;

public class SistemaEstadisticoArreglos {
    public static void main(String[] args) {

        int[] arreglo = new int[7];
        int numPositivos = 0, numNegativos = 0, ceros = 0, contadorPositivos = 0, contadorNegativos = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un valor para el arreglo: ");
            arreglo[i] = s.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                ceros++;
            } else {
                if (arreglo[i] > 0) {
                    numPositivos += arreglo[i];
                    contadorPositivos++;
                } else {
                    numNegativos -= arreglo[i];
                    contadorNegativos++;
                }
            }
        }

        double promedioPositivos = numPositivos / contadorPositivos;
        double promedioNegativos = numNegativos / contadorNegativos;

        if (contadorPositivos == 0) {
            System.out.println("No se pudo contar los positivos por que no hay numeros positivos en el arreglo");
        }else {
            System.out.println("Promedio de valores en Positivos: " + promedioPositivos
                    + " fueron en total: " + contadorPositivos + " en positivo");
        }
        if (contadorNegativos == 0) {
            System.out.println("No se pudo contar los negativos por que no hay numeros negativos en el arreglo");
        } else {
            System.out.println("Promedio de valores en Negativos: " + promedioNegativos
                    + " fueron en total: " + contadorNegativos + " en negativo");
        }

        System.out.println("Numeros que fueron 'ceros': " + ceros);
    }
}
