package Seccion3;

public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpeg";
        int i = archivo.indexOf(".");
        int i2 = archivo.lastIndexOf(".");

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i + 1));
        System.out.println("archivo.substring(i2+1) = " + archivo.substring(i2 + 1));


    }
}
