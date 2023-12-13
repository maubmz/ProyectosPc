package Seccion9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/seccion9/config.properties");

            Properties properties = new Properties(System.getProperties());
            properties.load(archivo);
            properties.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto Properties");

            System.setProperties(properties);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("mi.propiedad.personalizada"));

            ps.list(System.out);
        } catch (Exception e) {
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }

    }
}
