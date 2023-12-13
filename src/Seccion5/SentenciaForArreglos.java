package Seccion5;

import javax.swing.*;

public class SentenciaForArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;

        for (int i = 0; i < count ; i++) {
            if (nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("pepa")) {
                continue;
            }
            System.out.println( i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingresa un nombre, ejemplo \"Pepe\" o \"Maria\" : ");
        boolean encontrado = false;

        for (int i = 0; i < count; i++ ){
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres[i] = " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "No fue encontrado");
        }

    }
}
