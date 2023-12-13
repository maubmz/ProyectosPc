package Seccion24Proyecto;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja() {

    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public void calcularVolumen() {
        System.out.println("Volumen de la caja: " + (ancho * alto * profundo));
    }

}
