package Seccion18;

import java.util.Scanner;

public class video75a76SentenciaIfElse {
    public static void main(String[] args) {

//        Video 75 uso de if-else
        var condicion = false;

        if ( condicion ) {
            System.out.println("Condicion verdadera");
        }else {
            System.out.println("Condicion falsa");
        }

        var numero = 2;
        var numeroTexto = "numero desconocido";
        if (numero == 1) {
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        }else {
            numeroTexto = "valor desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);

//        Video 76 Calculo estacion del anio con if-else

        var scanner = new Scanner(System.in);
        System.out.println("Proporciona el mes del anio: ");
        var mes = scanner.nextInt();//mes del anio
        String estacion = null;
        if ( mes == 1 || mes == 2 || mes == 12 ){
            estacion = "Invierno";
        } else if ( mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if ( mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if ( mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        } else {
            estacion = "Mes incorrecto";
        }
        System.out.println("estacion: " + estacion + " para el mes: " + mes);

    }
}
