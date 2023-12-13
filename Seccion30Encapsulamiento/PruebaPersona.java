package Seccion30Encapsulamiento;

public class PruebaPersona {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 5000, false);
//        System.out.println("Nombre persona: " + persona.getNombre() );
//        System.out.println("Sueldo persona: " + persona.getSueldo() );
//        System.out.println("Persona borrada?: " + persona.isEliminado() );

        System.out.println("Persona: " + persona );

        persona.setNombre("Carlos");
        persona.setSueldo(10000);
        persona.setEliminado(true);

//        System.out.println("Nombre persona: " + persona.getNombre() );
//        System.out.println("Sueldo persona: " + persona.getSueldo() );
//        System.out.println("Persona borrada?: " + persona.isEliminado() );

        System.out.println("Persona: " + persona );

    }
}
