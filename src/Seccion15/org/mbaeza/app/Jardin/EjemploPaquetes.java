package Seccion15.org.mbaeza.app.Jardin;

import Seccion15.org.mbaeza.app.hogar.*;
import static Seccion15.org.mbaeza.app.hogar.Persona.*;
import static Seccion15.org.mbaeza.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Mau");
        p.setApellido("Baeza");
        p.setColorPelo(NEGRO);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("Saludo = " + saludo);
        String generoHombre = GENERO_MASCULINO;
        String generoMujer = GENERO_FEMENINO;
        System.out.println("generoMujer = " + generoMujer);
        System.out.println("generoHombre = " + generoHombre);



    }
}
