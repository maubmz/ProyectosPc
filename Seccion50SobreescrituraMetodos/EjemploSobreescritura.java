package Seccion50SobreescrituraMetodos;

public class EjemploSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 10000);
        System.out.println("empleado = " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Miguel",10000, "Finanzas");
        System.out.println("gerente = " + gerente.obtenerDetalles());

    }
}
