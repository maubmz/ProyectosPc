package Seccion5;

public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i <= maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++){
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter '" + palabra + "' en la frase");

    }
}
