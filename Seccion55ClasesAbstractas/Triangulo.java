package Seccion55ClasesAbstractas;

public class Triangulo extends FiguraGeometrica{
    protected Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}
