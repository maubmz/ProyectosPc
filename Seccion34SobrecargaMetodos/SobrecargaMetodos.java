package Seccion34SobrecargaMetodos;

public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println("Resultado 1: " + Operaciones.sumar(3, 4));

        System.out.println("Resultado 2: " + Operaciones.sumar(23.2, 23.4));

        System.out.println("Resultado 3: " + Operaciones.sumar(2,5.3));

        System.out.println("Resultado 4: " + Operaciones.sumar(2.4, 2));

        System.out.println("Resultado 5: " + Operaciones.sumar(3F, 'A'));
    }
}
