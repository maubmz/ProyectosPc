package Seccion51PolimorfismoeInstanceOf;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 10000);
        imprimirDetalles(empleado);

        Gerente gerente = new Gerente("Miguel",10000, "Finanzas");
        imprimirDetalles(gerente);

    }

    public static void imprimirDetalles(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
