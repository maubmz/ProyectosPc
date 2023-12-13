package Seccion16;

public class video59a61 {
    public static void main(String[] args) {
//        Video 59 Base Decimal, Hexadecimal y Octal
        
        var numeroDecimal = 10;
        System.out.println("numeroDecimal = " + numeroDecimal);

        var numeroOctal = 012;
        System.out.println("numeroOctal = " + numeroOctal);

        var numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        var numeroBinario = 0b1010;
        System.out.println("numeroBinario = " + numeroBinario);

//        Video 60 Tipos primitivos Flotantes

        var floatVar = 1000F;
        System.out.println("floatVar = " + floatVar);

        System.out.println("Bits tipo float: " + Float.SIZE);
        System.out.println("Bytes en el tipo float: " + Float.BYTES);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);

        double doubleVar = 100.10;
        System.out.println("doubleVar = " + doubleVar);

        System.out.println("Bits tipo double: " + Double.SIZE);
        System.out.println("Bytes en el tipo double: " + Double.BYTES);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);

//        Video 61 Tipos primitivos Char

//        Unicode '\u0021' = !
//        Decimal 33 = !
        char varChar = '!';
        System.out.println("varChar = " + varChar);

        System.out.println("Bits tipo char: " + Character.SIZE);
        System.out.println("Bytes en el tipo char: " + Character.BYTES);
        System.out.println("Valor minimo tipo char: " + Character.MIN_VALUE);
        System.out.println("Valor maximo tipo char: " + Character.MAX_VALUE);
    }
}
