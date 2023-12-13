package Seccion18;

import java.util.Scanner;

public class video77a78SentenciaSwitch {
    public static void main(String[] args) {

//        Video 77 Sentencia switch
        var numero = 1;
        var numeroTexto = "numero desconocido";

        switch ( numero ) {
            case 1:
                numeroTexto = "numero uno";
                break;
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto = "numero tres";
                break;
            default:
                numeroTexto = "numero desconocido";
        }
        System.out.println("numero texto: " + numeroTexto + " para el numero proporcionado: " + numero);

//        Video 78 Calculo estacion del anio con switch
        var scanner = new Scanner(System.in);
        System.out.println("Proporcionar el valor del mes");
        var mes = scanner.nextInt();
        String estacion = null;

        switch ( mes ){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
            default:
                estacion = "mes incorrecto";
        }
        System.out.println("estacion: " + estacion + " para el mes: " + mes);


    }
}
