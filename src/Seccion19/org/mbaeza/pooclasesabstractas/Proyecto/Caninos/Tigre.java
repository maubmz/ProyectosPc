package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Caninos;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales.Felino;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return super.comer() + "Tigre";
    }

    @Override
    public String dormir() {
        return super.dormir() + "Tigre";
    }

    @Override
    public String correr() {
        return super.correr() + "Tigre";
    }

    @Override
    public String comunicarse() {
        return super.comunicarse() + "Tigre";
    }
}
