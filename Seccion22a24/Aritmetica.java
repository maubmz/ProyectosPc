package Seccion22a24;

public class Aritmetica {

//    Atributos de la clase
    int a;
    int b;


//    Constructores
    public Aritmetica() {
        System.out.println("Ejecutando el constructor vacio");
    }
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con dos argumentos");
    }



//    Metodos
    public int sumar() {
        return this.a + this.b;
    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {
        return this.a * this.b;
    }

    public int dividir() {
        return this.a / this.b;
    }

}
