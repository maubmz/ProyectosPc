package Seccion4;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de alguien: ");
        String name2 = JOptionPane.showInputDialog("Ingresa el segundo nombre y apellido de alguien: ");
        String name3 = JOptionPane.showInputDialog("Ingresa el tercer nombre y apellido de alguien: ");

        String max = (name1.split(" ")[0].length() < name2.split(" ")[0].length()? name2 : name1 );
        max = (max.split(" ")[0].length() < name3.split(" ")[0].length() ? name3 : max );

        JOptionPane.showMessageDialog(null,max);
    }
}
