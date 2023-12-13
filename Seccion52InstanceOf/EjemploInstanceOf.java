package Seccion52InstanceOf;

import Seccion51PolimorfismoeInstanceOf.Empleado;
import Seccion51PolimorfismoeInstanceOf.Gerente;

public class EjemploInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 10000);
        determinaTipo(empleado);

        Gerente gerente = new Gerente("Miguel",10000, "Finanzas");
//        determinaTipo(gerente);

    }

    public static void determinaTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            System.out.println("departamento del gerente: " + gerente.getDepartamento());

//            System.out.println( (( Gerente ) empleado).getDepartamento() );
        }
        if (empleado instanceof Empleado) {
            System.out.println("Nombre empleado: " + empleado.getNombre());
        }
    }
}
