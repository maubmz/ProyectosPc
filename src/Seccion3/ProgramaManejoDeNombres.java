package Seccion3;

import javax.swing.*;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la primera persona");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la segunda persona");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese el nombre de la tercer persona");

        System.out.println(nombre1);
        System.out.println(nombre1.length());
        String variableNombre1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length() - 2));
        String variableNombre2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length() - 2));
        String variableNombre3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length() - 2));

        String variablesCreadas = "Estas son las variables creadas: \n".concat(variableNombre1).concat("\n");
        variablesCreadas = variablesCreadas.concat(variableNombre2).concat("\n");
        variablesCreadas = variablesCreadas.concat(variableNombre3).concat("\n");

        JOptionPane.showMessageDialog(null, variablesCreadas);

    }
}
