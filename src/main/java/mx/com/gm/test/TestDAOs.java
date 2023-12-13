package mx.com.gm.test;

import mx.com.gm.dao.*;

import java.util.List;

public class TestDAOs {
    public static void main(String[] args) {
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumno");
        imprimir(alumnoDao.listar());

        System.out.println("Domicilios");
        DomicilioDAO domicilioDao = new DomicilioDAO();
        imprimir(domicilioDao.listar());

        System.out.println("Contacto");
        ContactoDAO contactoDao = new ContactoDAO();
        imprimir(contactoDao.listar());

        System.out.println("Curso");
        CursoDAO cursoDao = new CursoDAO();
        imprimir(cursoDao.listar());

        System.out.println("Asignacion");
        AsignacionDAO asignacionDao = new AsignacionDAO();
        imprimir(asignacionDao.listar());
        
    }
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("valor = " + o);
        }
    }

}
