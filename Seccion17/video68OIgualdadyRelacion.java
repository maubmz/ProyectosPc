package Seccion17;

public class video68OIgualdadyRelacion {
    public static void main(String[] args) {

//        Video 68 Operadores de igualdad y relacionales
//        Operadores de igualdad
        int a = 3, b = 2;

        boolean c = a == b;
        System.out.println("c = " + c);

        c = (a != b);
        System.out.println("c = " + c);

        String cadena = "Hola";
        String cadena2 = "Hola";

        System.out.println( cadena.equals(cadena2) );

//        Operadores relacionales
        boolean d = a >= b;//a mayor o menor que b
        System.out.println("d = " + d);

        if (b % 2 == 0) {
            System.out.println("Numero par");
        }else {
            System.out.println("Numero impar");
        }

        int edad = 8;
        int adulto = 18;

        if ( edad >= adulto )//edad mayor o menor que adulto
            System.out.println("es un adulto");
        else
            System.out.println("es menor de edad");



    }
}
