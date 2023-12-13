package Seccion7;

public class PasaPorReferencia {
    public static void main(String[] args) {

//        Pasa por valor
        int[] edad = {10, 11, 12};

        System.out.println("iniciamos el metodo main ");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de invocar el metodo test ");
        test(edad);
        System.out.println("Despues de invocar el metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados ");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el metodo test ");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
        }
        System.out.println("Finaliza el metodo test ");
    }
}
