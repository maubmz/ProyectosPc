package Seccion15.org.mbaeza.app.Jardin;


import Seccion15.org.mbaeza.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

    String jugar(Persona persona) {
        return persona.lanzarPelota();
    }

}
