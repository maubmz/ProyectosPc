package Seccion10;

import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el radio del circulo: ");
        double radio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo = " + areaCirculo);

    }
}
