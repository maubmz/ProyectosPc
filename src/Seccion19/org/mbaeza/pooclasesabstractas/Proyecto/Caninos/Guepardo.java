package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Caninos;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales.Felino;

public class Guepardo extends Felino {



    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    @Override
    public String comer() {
        return super.comer() + "Guepardo";
    }

    @Override
    public String dormir() {
        return super.dormir() + "Guepardo";
    }

    @Override
    public String correr() {
        return super.correr() + "Guepardo";
    }

    @Override
    public String comunicarse() {
        return super.comunicarse() + "Guepardo";
    }
}
