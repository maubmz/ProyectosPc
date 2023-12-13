package Seccion6;

public class WrapperInteger {
    public static void main(String[] args) {

        int primitivo = 32768;
        Integer intObjeto = Integer.valueOf(primitivo);
        Integer intObjeto2 = primitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortintObjeto = intObjeto.shortValue();
        System.out.println("shortintObjeto = " + shortintObjeto);

        Byte byteintObjeto = intObjeto.byteValue();
        System.out.println("byteintObjeto = " + byteintObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
