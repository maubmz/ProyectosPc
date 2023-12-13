package Seccion27;

public class PabraReturnTiposPrimitivos {
    public static void main(String[] args) {

        sumarSinRetornarValor(3, 6);

        int resultado = sumarRetornadoValor(4, 2);
        System.out.println("resultado sumar retornado el valor = " + resultado);

    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("el resultado sin retornar valor: " + (a + b) );
    }

    private static int sumarRetornadoValor(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Proporcione otros valores que no sean 0");
            return 0;
        }
        System.out.println("Los valores son distintos de 0");
        return a + b;
    }
}
