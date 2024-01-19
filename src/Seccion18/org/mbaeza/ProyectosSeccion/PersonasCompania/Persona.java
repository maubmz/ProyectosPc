package Seccion18.org.mbaeza.ProyectosSeccion.PersonasCompania;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                ", numeroFiscal='" + this.numeroFiscal + '\'' +
                ", direccion='" + this.direccion;
    }
}
