package Seccion27;

public class PalabraReturnClases {
    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        System.out.println("Resultado de llamar el metodo sumar: " + s.sumar());

    }

    private static Suma creaObjetoSuma() {
        return new Suma(31, 10);
    }
}

class Suma {
    int a;
    int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar() {
        return this.a + this.b;
    }
}
