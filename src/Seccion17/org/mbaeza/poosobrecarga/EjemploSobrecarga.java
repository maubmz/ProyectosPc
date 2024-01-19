package Seccion17.org.mbaeza.poosobrecarga;

import Seccion17.org.mbaeza.poosobrecarga.Calculadora.*;

import static Seccion17.org.mbaeza.poosobrecarga.Calculadora.sumar;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(10, 5));
        System.out.println("Sumar float: " + sumar(10.0F, 5F));
        System.out.println("Sumar float-int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5.0f));
        System.out.println("Sumar double: " + sumar(10.0, 5.0));
        System.out.println("Sumar string: " + sumar("10", "5"));
        System.out.println("Sumar seis int: " + sumar(34, 30, 6, 24, 20, 23));
        System.out.println("Sumar float + n int: " + sumar(10.5f, 5, 9, 15));
        System.out.println("Sumar cuatro double: " + sumar(10.0, 5.0, 3.5, 4.5));

        System.out.println("Sumar long: "  + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar float-int: " + sumar(10F, '@'));
        System.out.println("Sumar cuatro int: " + sumar(10, 5, 3, 5));
        System.out.println("Sumar cuatro int: " + Calculadora.sumar(10, 5, 3, 5));
    }
}
