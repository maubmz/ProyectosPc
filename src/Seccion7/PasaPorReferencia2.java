package Seccion7;

class Persona {
    private String nombre;

    public void modificarNombre(String Nuevonombre) {
        this.nombre = Nuevonombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasaPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andres");

        System.out.println("iniciamos el metodo main ");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        
        System.out.println("Antes de invocar el metodo test ");
        test(persona);
        System.out.println("Despues de invocar el metodo test");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());

        System.out.println("Finaliza el metodo main con los datos de la persona modificados ");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test ");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test ");
    }
}
