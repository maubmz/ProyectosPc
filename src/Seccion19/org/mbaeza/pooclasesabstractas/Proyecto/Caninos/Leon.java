package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Caninos;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales.Felino;

public class Leon extends Felino {

    private int numeroManada;
    private double rugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, int numeroManada, double rugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.numeroManada = numeroManada;
        this.rugidoDecibel = rugidoDecibel;
    }

    @Override
    public String comer() {
        return super.comer() + "Leon";
    }

    @Override
    public String dormir() {
        return super.dormir() + "Leon";
    }

    @Override
    public String correr() {
        return super.correr() + "Leon";
    }

    @Override
    public String comunicarse() {
        return super.comunicarse() + "Leon";
    }
}
