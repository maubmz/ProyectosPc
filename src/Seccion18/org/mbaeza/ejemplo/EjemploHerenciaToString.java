package Seccion18.org.mbaeza.ejemplo;

import Seccion18.org.mbaeza.pooherencia.*;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("=========== Creando la instancia de Alumno ================");
        Alumno alumno = new Alumno("Mauricio", "Baeza", 20, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("mau@correo.com");

        System.out.println("=========== Creando la instancia de Alumno Internacional ================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("=========== Creando la instancia de Profesor ================");
        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("luci.pf@correo.com");

        System.out.println(" ============ - ==============");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona) {
        System.out.println(" ============ - ==============");
        System.out.println(persona);
    }

}
