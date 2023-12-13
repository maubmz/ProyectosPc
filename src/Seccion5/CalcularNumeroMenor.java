package Seccion5;

import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a comparar para encontrar el minimo? ");
        int numeros = scanner.nextInt();
        if (numeros < 10){
            System.out.println("Son menos de 10 numeros, ingresar mas de 10 valores");
        }else {
            int[] arregloNumeros = new int[numeros];
            for (int i = 0; i < numeros; i++) {
                System.out.println("Dame el numero a evaluar: ");
                arregloNumeros[i] = scanner.nextInt();
            }
            int numMenor = Integer.MAX_VALUE;
            for (int i = 0; i < arregloNumeros.length; i++) {
                int numSiguiente = arregloNumeros[i];
                numMenor = (numSiguiente < numMenor) ? numSiguiente : numMenor;
            }
            if (numMenor < 10) {
                System.out.println("El número menor es menor que 10!");
            } else {
                System.out.println("El numero menor es igual o mayor que 10!");
            }

            System.out.println("El numero menor es: " + numMenor);
        }
    }
}
