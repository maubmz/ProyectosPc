package Seccion18.org.mbaeza.ProyectosSeccion.PersonasCompania;

public class Empleado extends Persona{
    private double renumeracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double renumeracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.renumeracion = renumeracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRenumeracion(int porcentaje) {
        this.renumeracion += (porcentaje * renumeracion/100);
    }

    public double getRenumeracion() {
        return renumeracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    @Override
    public String toString() {
        return "renumeracion=" + this.renumeracion +
                ", empleadoId=" + this.empleadoId +
                super.toString();
    }
}
