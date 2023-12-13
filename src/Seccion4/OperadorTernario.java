package Seccion4;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7? "Si es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas =0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el valor de matematicas entre 0 - 10: ");
        matematicas = scanner.nextDouble();
        System.out.println("Ingresa el valor de ciencias entre 0 - 10: ");
        ciencias = scanner.nextDouble();
        System.out.println("Ingresa el valor de historia entre 0 - 10: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49? "Aprobado":"Reprobado";
        System.out.println("estado = " + estado);

        /*if(promedio >= 5.49){
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }*/


    }
}
