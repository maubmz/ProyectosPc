package Seccion4;

import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {

        double capacidadMaxima = 70;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Medida actual en litros del Estanque: ");
        double capacidadActual = scanner.nextDouble();

        if( capacidadActual >= 0 && capacidadActual < 20) {
            System.out.println(" Insuficiente");
        } else if (capacidadActual >= 20 && capacidadActual < 35) {
            System.out.println("Suficiente");
        } else if (capacidadActual >= 35 && capacidadActual < 40) {
            System.out.println("Medio estanque");
        } else if (capacidadActual >= 40 && capacidadActual < 60) {
            System.out.println("Estanque a 3/4");
        } else if (capacidadActual >= 60 && capacidadActual < 70) {
            System.out.println("Casi lleno");
        } else if (capacidadActual == 70){
            System.out.println("Estanque lleno");
        }

    }
}
