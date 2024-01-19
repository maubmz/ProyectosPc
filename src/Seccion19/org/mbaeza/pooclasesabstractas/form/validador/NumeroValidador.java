package Seccion19.org.mbaeza.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo %s debe de ser un numero";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
