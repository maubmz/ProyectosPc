package Seccion2;

public class DefinirVariable {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 11;
        System.out.println("numero = " + numero);
        int numero2 = 5;

        boolean valor = true;
        if ( valor ){
            System.out.println("numero = " + numero);
            numero2 = 100;

        }

        System.out.println("numero2 = " + numero2);

        var numero3 = "11";

//        Video 10
        String nombre;
        nombre = "Andres";
//        Si numero es mayor a 10 se ejecuta
        if( numero > 10 ){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        int $edad = 5;
        int _edad = 3;

    }
}
