package Seccion17;

public class video69a70OCondicionales {
    public static void main(String[] args) {

//        Video 69 Operadores condicionales
        int a = 10;
        int valorMinimo = 0, valorMaximo = 10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);

        boolean vacaciones = true;
        boolean diaDescanso = false;
        if (vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego del hijo");
        else
            System.out.println("Padre ocupado");

//        Video 70 Operador Ternario
        var resultado1 = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado1 = " + resultado1);

        var numero = 8;
        var par = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("par = " + par);


    }
}
