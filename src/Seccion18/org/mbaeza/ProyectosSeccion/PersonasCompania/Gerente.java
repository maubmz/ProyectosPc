package Seccion18.org.mbaeza.ProyectosSeccion.PersonasCompania;

public class Gerente extends Empleado{
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, renumeracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "presupuesto=" + this.presupuesto +
                super.toString();
    }
}
