package Seccion18.org.mbaeza.ProyectosSeccion.PersonasCompania.main;

import Seccion18.org.mbaeza.ProyectosSeccion.PersonasCompania.Gerente;

public class EjemploPersonasCompania {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("John", "Roe", "12.345.678-9", "Agustinas 2233", 2000.00,25, 57000.00);
        gerente.aumentarRenumeracion(15);
        gerente.setPresupuesto(77000.00);
        System.out.println(gerente);
    }
}
