package Seccion55ClasesAbstractas;

public class Circulo extends FiguraGeometrica{

    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}
