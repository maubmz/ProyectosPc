package Seccion2;

public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2.12e3f;//2120
        float realFloat1 = 2.12e-3f;//0.00212
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de float es " + Float.MAX_VALUE);
        System.out.println("Valor minimo de float es " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor maximo de double es " + Double.MAX_VALUE);
        System.out.println("Valor minimo de double es " + Double.MIN_VALUE);

//        Variable local = Inicializada, en un metodo
//        Variable clase = Cuando no se inicializa y lleva la palabra static

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
