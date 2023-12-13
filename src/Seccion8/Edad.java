package Seccion8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();

        try {
            System.out.println("Dame tu fecha de nacimiento en este formato (yyyy-MM-dd): ");
            Date fechaNacimiento = format.parse(scanner.next());
            System.out.println("Esta es tu edad: " + (fechaActual.getYear() - fechaNacimiento.getYear()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}
