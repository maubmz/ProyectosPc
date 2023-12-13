package Seccion16;

import java.util.Scanner;

public class video62a63 {
    public static void main(String[] args) {
//        Video 62 Tipos primitivos Boolean
        System.out.println("Video 62 Tipos primitivos Boolean");
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);

        boolean booleanVar = false;

//        booleanVar == true / booleanVar
//        booleanVar == false / !booleanVar
        if (booleanVar) {
            System.out.println("el valor es verdadero");
        }else {
            System.out.println("el valor es falso");
        }

        var edad = 10;
        boolean esAdulto = edad>= 18;

        System.out.println("esAdulto = " + esAdulto);

//        Video 63 Conversion de tipos primitivos
        System.out.println("Video 63 Conversion de tipos primitivos");

//        Conversion de string a int
        var edad1 = Integer.parseInt("20");
        System.out.println("edad1 = " + edad1);

//        Conversion de string a double
        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

//        Conversion de string a char
        char valorChar = "hola".charAt(0);
        System.out.println("valorChar = " + valorChar);

//        Conversion de string a Integer por Scanner
        var scanner = new Scanner(System.in);
        int edad2 = Integer.parseInt(scanner.nextLine());//Recibe un strin y convertimos a Integer
        System.out.println("edad2 = " + edad2);
        
//        Conversion de string a char por Scanner
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

//        Conversion de int a String
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);

//        Conversion "Casting"
        short s = 10;//16 bites
        byte b = (byte)s;//8 bites no lo soporta por el tamanio de bytes
        System.out.println("b = " + b);
    }
}
