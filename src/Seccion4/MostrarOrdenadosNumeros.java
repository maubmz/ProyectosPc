package Seccion4;

import java.util.Scanner;

public class MostrarOrdenadosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa otro numero: ");
        int num2 = scanner.nextInt();

        int mayor = (num1 > num2) ? num1 : num2;
        System.out.println("el numero mayor es = " + mayor);

    }
}
