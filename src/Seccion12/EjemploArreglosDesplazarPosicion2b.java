package Seccion12;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int numero, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.print("Nuevo elemento: ");
        numero = s.nextInt();

        System.out.println("Posicion donde se desea agregar: ");
        posicion = s.nextInt();

        ultimo = a[a.length - 1];
        for (int i = a.length - 2; i >= posicion; i --){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[posicion] = numero;

        b[b.length-1] = ultimo;

        System.out.println("El arreglo nuevo: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => "  + b[i]);
        }

    }
}
