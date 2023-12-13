package Seccion22a24;

public class PruebaAritmetica {
    public static void main(String[] args) {
//        Seccion 22 y 23 Metodos, Constructores

//        //Creamos un objeto de tipo aritmetica
//        Aritmetica aritmetica = new Aritmetica();
//        aritmetica.a = 10;
//        aritmetica.b = 3;
//        int resultado = aritmetica.sumar();
//
//        System.out.println("resultado = " + resultado);
//
//        //Creamos un segundo objeto de Aritmetica
//        Aritmetica aritmetica2 = new Aritmetica(31,10);
//
//        System.out.println("resultado2 = " +aritmetica2.sumar());


//        Seccion 24 Alcance de variables
//        Variables locales, son las que estan dentro de un metodo
        // solo se pueden acceder dentro de ese metodo
        int operandoA = 6;
        int operandoB = 2;

        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //Imprimimos los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos el resultado de la suma
        System.out.println("\nResultado de la suma: " + objeto1.sumar());

        //Imprimimos el resultado de la resta
        System.out.println("\nResultado de la resta: " + objeto1.restar());

        //Imprimimos el resultado de la multiplicacion
        System.out.println("\nResultado de la multiplicacion: " + objeto1.multiplicar());

        //Imprimimos el resultado de la division
        System.out.println("\nResultado de la division: " + objeto1.dividir());


    }
}
