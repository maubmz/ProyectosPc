package Seccion2;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == caracter ? " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo == caracter " + (simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';


        System.out.println("char corresponde en bytes a: " + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor maximo de char es " + Character.MAX_VALUE);
        System.out.println("Valor minimo de char es " + Character.MIN_VALUE);
    }
}
