package Seccion4;

public class OperadoresIncrementales {
    public static void main(String[] args) {

//        Pre incremento
        int i = 1;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

//        Post incremento
        i = 2;
        System.out.println("valor incial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

//        Pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

//        Post decremento
        i = 4;
        System.out.println("valor incial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
