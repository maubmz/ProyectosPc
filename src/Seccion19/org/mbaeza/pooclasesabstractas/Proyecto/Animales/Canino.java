package Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Animales;

import Seccion19.org.mbaeza.pooclasesabstractas.Proyecto.Mamiferos;

public class Canino extends Mamiferos {

    private String color;
    private double tamanioColmillos;


    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    @Override
    public String comer() {
        return "Quiere comer el canino ";
    }

    @Override
    public String dormir() {
        return "Quiere dormir el canino ";
    }

    @Override
    public String correr() {
        return "Quiere correr el canino ";
    }

    @Override
    public String comunicarse() {
        return "Quiere comunicarse el canino ";
    }

    public String getColor() {
        return color;
    }

    public double getTamanioColmillos() {
        return tamanioColmillos;
    }
}
