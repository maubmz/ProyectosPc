package Seccion15.org.mbaeza.app.hogar;

import Seccion6.WrapperBoolean;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;
    public static final String GENERO_MASCULINO = "Hombre";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String lanzarPelota() {
        return "Lanza la pelota al perro! ";
    }

    public static String saludar() {
        return "Hola que tal";
    }

}
