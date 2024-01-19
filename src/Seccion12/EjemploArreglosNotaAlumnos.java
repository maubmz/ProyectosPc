package Seccion12;

import java.util.Scanner;

public class EjemploArreglosNotaAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas = 0,sumaNotasHistoria = 0, sumaNotasLenguajes = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese las 7 notas de los estudiantes para matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese las 7 notas de los estudiantes para historia: ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese las 7 notas de los estudiantes para leguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguajes += claseLenguaje[i];
        }
        double promedioMatemeticas = (sumaNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria/claseHistoria.length);
        double promedioLenguajes = (sumaNotasLenguajes/claseLenguaje.length);
        double promedioTotal = (promedioMatemeticas + promedioHistoria + promedioLenguajes ) /3;
        System.out.println("Promedio clase matematicas " + promedioMatemeticas);
        System.out.println("Promedio clase historia " + promedioHistoria);
        System.out.println("Promedio clase lenguajes " + promedioLenguajes);
        System.out.println("Promedio total del curso " + promedioTotal);

        System.out.println("Ingrese identificador del alumno de 0 a 6: ");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) /3;
        System.out.println("Promedioo del alumno = " + promedioAlumno);

    }
}
