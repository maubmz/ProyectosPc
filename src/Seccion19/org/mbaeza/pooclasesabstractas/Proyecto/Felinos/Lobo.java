package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Felinos;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales.Felino;

public class Lobo extends Felino {

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return super.comer() + "Lobo";
    }

    @Override
    public String dormir() {
        return super.dormir() + "Lobo";
    }

    @Override
    public String correr() {
        return super.correr() + "Lobo";
    }

    @Override
    public String comunicarse() {
        return super.comunicarse() + "Lobo";
    }
}
