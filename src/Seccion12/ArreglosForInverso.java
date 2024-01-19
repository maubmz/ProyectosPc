package Seccion12;

import java.util.Arrays;

public class ArreglosForInverso {
    public static void main(String[] args) {

//        String[] productos = new String[7];
        String[] productos = {"Kingston Pendrice 64gb", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta Generacion", "Bicicleta Oxford"};
        int total = productos.length;

//        productos[0] = "Kingston Pendrice 64gb";
//        productos[1] = "Samsung Galaxy";
//        productos[2] = "Disco Duro SSD Samsung Externo";
//        productos[3] = "Asus Notebook";
//        productos[4] = "Macbook Air";
//        productos[5] = "Chromecast 4ta Generacion";
//        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println("-------------------Usamos for --------------");
        for (int i = 0; i < total; i++ ) {
            System.out.println("para indice " + i +": " + productos[i]);
        }

        System.out.println("-------------------Usamos for inverso --------------");
        for (int i = 0;i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) +" valor: " + productos[total - 1 - i]);
        }

        System.out.println("-------------------Usamos for inverso 2--------------");
        for (int i = total - 1;i >= 0; i--) {
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

    }
}
