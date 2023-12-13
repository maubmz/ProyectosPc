package Seccion28this;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }
}

class Persona{
    String nombre;

    Persona(String nombre){
        this.nombre = nombre;
    }

    Imprimir imprimir = new Imprimir();
//    imprimir.imprimir( this );
}

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("impresion argumento persona: " + p);//valor objeto persona
        System.out.println("impresion objeto actual(this): " + this);//this apunta a un objeto de tipo imprimir
    }
}
