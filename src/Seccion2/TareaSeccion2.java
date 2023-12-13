package Seccion2;

import java.util.Scanner;

public class TareaSeccion2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame nombre de la factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Dame primer precio de la factura: ");
        Double primerPrecio = scanner.nextDouble();

        System.out.println("Dame primer precio de la factura: ");
        Double segundoPrecio = scanner.nextDouble();

        Double totalPrecios = (primerPrecio + segundoPrecio);
        Double impuesto = totalPrecios * 0.19;
        Double totalImpuesto = totalPrecios + impuesto;

        String infoFactura = nombreFactura + "\n" + totalPrecios + "\n" + impuesto + "\n" + totalImpuesto;

        System.out.println(infoFactura);



    }
}
