package Seccion12;

import java.util.Arrays;

public class ArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {

//        String[] productos = new String[7];
        String[] productos = {"Kingston Pendrice 64gb", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta Generacion", "Bicicleta Oxford"};
        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

//        Collections.reverse(Arrays.asList(productos));

        System.out.println("-------------------Usando for --------------");
        for (int i = 0; i < total; i++ ) {
            System.out.println("para indice " + i +": " + productos[i]);
        }

    }
}
