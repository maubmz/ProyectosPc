package Seccion47ForEach;

public class ForEachTest {
    public static void main(String[] args) {
        int edades[] = {15, 20 ,19 ,41, 50};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Carlos"), new Persona("Danna"), new Persona("Alexis")};
        for (Persona p:personas) {
            System.out.println("persona = " + p);
        }

    }
}
