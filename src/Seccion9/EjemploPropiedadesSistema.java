package Seccion9;

import java.util.Properties;

public class EjemploPropiedadesSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String javeVersion = System.getProperty("java.version");
        System.out.println("javeVersion = " + javeVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: " + lineSeparator + "Una linea nueva" );

        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator: " + lineSeparator2 + "Una linea nueva\n" );

        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}
