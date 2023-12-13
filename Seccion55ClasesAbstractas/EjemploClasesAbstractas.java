package Seccion55ClasesAbstractas;

public class EjemploClasesAbstractas {
    public static void main(String[] args) {

        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();

        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();

        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(triangulo);
        circulo.dibujar();

    }
}
