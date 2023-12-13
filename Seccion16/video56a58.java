package Seccion16;

import java.util.Scanner;

public class video56a58 {
    public static void main(String[] args) {
//        Video 56 Caracteres Especiales

        var nombre = "Karla";
        var apellido = "Esparza";

        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva Linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");

//        Video 57 Clase Scanner

        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el valor del usuario: ");
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);

//        Video 58 Tipos primitivos

//        byte, short, int, long
        byte byteVar = 10;
        System.out.println("byteVar = " + byteVar);
        System.out.println("bytes tipo de bytes: " + Byte.SIZE);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo tipo byte: " + Byte.MAX_VALUE);

        short shortVar = 31;
        System.out.println("shortVar = " + shortVar);
        System.out.println("bytes tipo de short: " + Short.SIZE);
        System.out.println("Valor minimo de tipo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de tipo short: " + Short.MAX_VALUE);

        int intVar = 03;
        System.out.println("intVar = " + intVar);
        System.out.println("bytes tipo de int: " + Integer.SIZE);
        System.out.println("Valor minimo de tipo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de tipo int: " + Integer.MAX_VALUE);

        long logVar = 19;
        System.out.println("logVar = " + logVar);
        System.out.println("bytes tipo de long: " + Long.SIZE);
        System.out.println("Valor minimo de tipo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de tipo long: " + Long.MAX_VALUE);

    }
}
