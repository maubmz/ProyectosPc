package Seccion3;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++ ) {
//            System.out.println("arreglo[i] = " + arreglo[i]);
            System.out.print(arreglo[i]);
        }

        System.out.println();
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;
        for(int i = 0;i < largo2; i++ ) {
            System.out.println("arreglo2[i] = " + arreglo2[i]);
        }

        String archivo = "alguna.imagen.jpeg";
        String[] archivoArr = archivo.split("\\."); // [.]
        int largoArr = archivoArr.length;
        for(int i = 0;i < largoArr; i++ ) {
            System.out.println("archivoArr[i] = " + archivoArr[i]);
        }
        System.out.println("Extension = " + archivoArr[largoArr - 1]);



    }
}
