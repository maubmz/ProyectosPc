package Seccion55ClasesAbstractas;

public class Rectangulo extends FiguraGeometrica{
    protected Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Aqui deberia dibujar: " + this.getClass().getSimpleName());
    }
}
