package Seccion13;

public class EjemploMatricesFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};

        System.out.println("Iterando con un for each: ");
        for (String[] fila: nombres){
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }

    }
}
