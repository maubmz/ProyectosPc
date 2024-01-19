package Seccion12;

import java.util.Arrays;

public class ArreglosIterar {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "Kingston Pendrice 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println("-------------------Usamos for --------------");
        for (int i = 0; i < total; i++ ) {
            System.out.println("para indice " + i +": " + productos[i]);
        }
        System.out.println("-------------------Usamos for each--------------");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }
        System.out.println("-------------------Usamos while--------------");
        int i = 0;
        while(i < total) {
            System.out.println("para indice " + i +": " + productos[i]);
            i++;
        }
        System.out.println("-------------------Usamos Do while--------------");
        int j = 0;
        do {
            System.out.println("para indice " + j +": " + productos[j]);
            j++;
        } while(j < total);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for (int k = 0;k < totalNumeros; k++) {
            numeros[k] = k * 3;
        }
        for (int k = 0;k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
