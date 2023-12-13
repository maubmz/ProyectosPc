package Seccion5;

import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un mes del anio del 1-12: ");
        int mes = scanner.nextInt();
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;
        }
        System.out.println("nombreMes = " + nombreMes);

        char num = 'z';
        switch (num) {
            case '0':
                System.out.println("el num es cero");
                break;
            case '1':
                System.out.println("el num es uno");
                break;
            case '2':
                System.out.println("el num es dos");
                break;
            case '3':
                System.out.println("el num es tres");
                break;
            case 'a':
                System.out.println("el caracter es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre = "juan";
        switch (nombre ){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "andres":
                System.out.println("Hola andres");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("usuario desconocido");
        }

    }
}
