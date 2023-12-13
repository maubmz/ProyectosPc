package Seccion2;

public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de byte es " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de byte es " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("short corresponde en bytes a " + Short.BYTES);
        System.out.println("short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor maximo de short es " + Short.MAX_VALUE);
        System.out.println("Valor minimo de short es " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("int corresponde en bytes a " + Integer.BYTES);
        System.out.println("int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maximo de int es " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de int es " + Integer.MIN_VALUE);

        long numeroLong = 2147483648l;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("long corresponde en bytes a " + Long.BYTES);
        System.out.println("long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maximo de long es " + Long.MAX_VALUE);
        System.out.println("Valor minimo de long es " + Long.MIN_VALUE);

//        El valor maximo que toma es de valor int, a menos que especifiquemos que es de tipo long
        var numeroVar = 2147483647;



    }
}
