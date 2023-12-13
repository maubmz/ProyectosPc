package Seccion31Static;

public class Persona {
    private int idPersona;//Se asocia con el objeto (instancia)
    private String nombre;//Se asocia con el objeto (instancia)
    private static int contadorPersonas;//Se asocia con la clase

    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona(){
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "idPersona: " + idPersona + ", nombre: " + nombre + ", contadorPersonas: " + contadorPersonas;
    }

}
