package Seccion19;

public class video84a85 {
    public static void main(String[] args) {

//        Video 84 Palabras Break y Continue
//        Break
        for (var i = 0; i < 3; i++ ) {
            //Imprimimos solo numeros pares
            if (i % 2 == 0 ) {
                System.out.println("i = " + i);
                break;
            }
        }

//        Continue
        for (var i = 0; i < 3; i++ ) {
            //Imprimimos solo numeros pares
            if (i % 2 != 0 ) {
                continue;
            }
            System.out.println("i = " + i);
        }

//        Video 85 Uso de labels
        inicio:
        for (var i = 0; i < 3; i++ ) {
            //Imprimimos solo numeros pares
            if (i % 2 != 0 ) {
                continue inicio;
            }
            System.out.println("i = " + i);
        }


    }
}
