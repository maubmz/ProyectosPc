package Seccion17;

public class video65OAritmeticos {
    public static void main(String[] args) {

//        Video 65 Operadores aritmeticos
        int a = 3, b = 2;
        
        int resultado = a + b;
        System.out.println("resultado = " + resultado);

        System.out.println("resultado = " + a + b );//Concatena los valores
        System.out.println("resultado = " + ( a + b ) );//Mayor prioridad el parentesis

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        System.out.println("resultado resta = " + (a - b) );

        resultado = a * b;
        System.out.println("resultado multiplicacion= " + resultado);

        resultado = a / b;
        System.out.println("resultado division = " + resultado);
        //Nos regresara un valor entero por el tipo de variable

        resultado = a % b;
        System.out.println("resultado residuo de division = " + resultado);
        //Nos regresara un valor entero por el tipo de variable

        if ( resultado == 0 ){
            System.out.println("Numero par");
        }else {
            System.out.println("Numero impar");
        }

    }
}