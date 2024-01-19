package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Mamiferos;

public class Felino extends Mamiferos {

    private double tamanioGarras;
    private int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String comer() {
        return "Quiere comer el felino ";
    }

    @Override
    public String dormir() {
        return "Quiere dormir el felino ";
    }

    @Override
    public String correr() {
        return "Quiere correr el felino ";
    }

    @Override
    public String comunicarse() {
        return "Quiere comunicarse el felino ";
    }

    public double getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
