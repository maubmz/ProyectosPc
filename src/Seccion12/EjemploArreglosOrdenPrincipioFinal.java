package Seccion12;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        int aux = 0;
        for (int i = 0; i < numeros.length/2; i++) {
            a[aux++] = numeros[i];
            a[aux++] = numeros.length-i;
//            System.out.print(numeros[i] + " ");
//            System.out.println(numeros.length-i);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + i + " valor: " + a[i]);
        }

    }
}
