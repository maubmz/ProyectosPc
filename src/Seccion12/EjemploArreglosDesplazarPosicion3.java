package Seccion12;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);

//        Ingresa los valores al arreglo
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();

//        Ingresa el valor a insertar
        System.out.println("Ingrese un numero a insertar: ");
        numero = s.nextInt();

//        Busca la posicion donde tiene que ir el numero
        posicion = 0;
        while (posicion < 6 && numero > a[posicion]) {

            posicion++;
        }

//        Ordena los valores y deja vacia la posicion donde va el valor del usuario
        for (int i = a.length - 2; i >= posicion ;i--) {
            a[i + 1] = a[i];
        }

        a[posicion] = numero;
        System.out.println("El arreglo ordenado: ");
        for (int i = 0; i < a.length; i++ ) {
            System.out.println(i + " => " + a[i]);
        }

    }
}
