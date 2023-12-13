package Seccion5;

import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame las notas que debo promedias, deben de ser minimo 20 : ");
        int valor = scanner.nextInt();
        double notas[] = new double[valor];
        if (notas.length < 20) {
            System.out.println("Se solicitan minimo 20 notas, ingresar de nuevo");
            main(args);
            System.exit(0);
        }else {
            double notasMayor5 = 0.0;
            double notasInferior4 = 0.0;
            double notasValor1 = 0.0;
            for (int i = 0; i < notas.length; i++){
                System.out.println("Dame el numero de la nota " + (i + 1) + " , en una escala del 1 - 7: ");
                notas[i] = scanner.nextDouble();
                if (notas[i] <= 7 && notas[i] != 0) {
                    if (notas[i] >= 5) {
                        notasMayor5 += notas[i];
                    }else if (notas[i] <= 4.9 && notas[i] >= 1.1 ) {
                        notasInferior4 += notas[i];
                    }else {
                        notasValor1 += notas[i];
                    }
                } else if (notas[i] == 0) {
                    System.out.println("error finalizando el programa.");
                    System.exit(0);
                }
            }
            double totalPromedio = (notasMayor5 + notasInferior4 + notasValor1) / valor;
            System.out.println("El promedio de todas las notas es de: " + totalPromedio);
        }

    }
}
