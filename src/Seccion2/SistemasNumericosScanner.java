package Seccion2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
//        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{ //Trata
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (Exception e) {
            //NumberFormatException -- InputMismatchException son excepciones especificas y heredan de Exception
            System.out.println("Error debe ingresar un numero entero! ");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "\nNumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHexadecimal;
        System.out.println(mensaje);

    }
}
