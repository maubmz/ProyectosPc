package Seccion19;

public class video82a83Ciclos {
    public static void main(String[] args) {

//        Video 82 ejercicio ciclo While y do while
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);

//        Video 83 ejercicio ciclo For
        for (var i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }


    }
}
