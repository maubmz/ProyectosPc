package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Felinos;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales.Canino;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return super.comer() + "Perro";
    }

    @Override
    public String dormir() {
        return super.dormir() + "Perro";
    }

    @Override
    public String correr() {
        return super.correr() + "Perro";
    }

    @Override
    public String comunicarse() {
        return super.comunicarse() + "Perro";
    }
}
