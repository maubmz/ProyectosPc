package Seccion51PolimorfismoeInstanceOf;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

//    Sobreescribimos el metodo padre
//    Se puede cambiar el acceso pero solo a menos restringibos del padre
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
